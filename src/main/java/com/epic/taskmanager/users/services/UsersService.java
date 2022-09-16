package com.epic.taskmanager.users.services;

import com.epic.taskmanager.sendemail.SendMail;
import com.epic.taskmanager.users.dto.UsersDto;
import com.epic.taskmanager.users.entity.Users;
import com.epic.taskmanager.users.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    private final UserGroupeService userGroupeService;
    private final UsersRepository usersRepository;
    private final SendMail sendMail;
    public String createUser(UsersDto newUser){

        if(chekUserExists(newUser.getUserName(), newUser.getEmail())){
            return "User exists";
        } else{
            Users user = Users.builder()
                    .userNr(newUser.getUserName())
                    .email(newUser.getEmail())
                    .password(createPassword(newUser.getUserName(), newUser.getPassword()))
                    .userGroupId(userGroupeService.getUserGroupId(newUser.getUserGroupNr()))
                    .isActive(false)
                    .activationCode(createActivationCode(newUser.getEmail()))
                    .userCreated(getUserId(newUser.getUserNr()))
                    .dateCreated(LocalDateTime.now())
                    .userModifi(getUserId(newUser.getUserNr()))
                    .dateModifi(LocalDateTime.now())
                    .build();
            usersRepository.saveAndFlush(user);
            sendMail.sendMail(user.getEmail(), "Activate user account",
                    "For activation user account, go to link http://localhost:8082/taskmanager/user/activeaccount/"+user.getActivationCode());
            return "User created, check you email";
        }
    }

    public boolean chekUserExists(String userNr, String email){
        return usersRepository.existByUserNr(userNr) && usersRepository.existByEmail(email);
    }

    public String createPassword(String userNr, String password){
        String newPass = userNr + password;
        return Base64.getEncoder().encodeToString(newPass.getBytes()); }

    public String createActivationCode(String email){
        return Base64.getEncoder().encodeToString(email.getBytes()); }

    public String activationUser(String activationCode){
        Users user = usersRepository.findByActivationCode(activationCode);
        if(user != null){
            user.setActive(true);
            usersRepository.save(user);
            return "Account activate";
        } else {
            return "Activation code is wrong";
        }
    }
    public int getUserId(String userNr){
        Users user  = usersRepository.findByUserNr(userNr);
        return user.getUserId();
    }

    public void deleteUser(int userId){
        usersRepository.deleteById(userId);
    }

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }
    public Users getUser(int userId){
        return usersRepository.findById(userId);
    }
}
