package com.epic.taskmanager.users.controllers;

import com.epic.taskmanager.users.controllers.records.users.UserId;
import com.epic.taskmanager.users.controllers.records.users.UserNr;
import com.epic.taskmanager.users.dto.UsersDto;
import com.epic.taskmanager.users.entity.Users;
import com.epic.taskmanager.users.services.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("taskmanager/user")
@AllArgsConstructor
public class UserController {

    private final UsersService usersService;


    @PostMapping("/createuser")
    public String createUser(@RequestBody UsersDto usersDto){
        try {
            return usersService.createUser(usersDto);
        } catch (Exception e){
            return e.toString();
        }
    }

    @PostMapping("/deleteuser")
    public String deleteUser(@RequestBody UserNr userNr){
        try {
            usersService.deleteUser(usersService.getUserId(userNr.userNr()));
            return "User: " + userNr.userNr() + " deleted";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @GetMapping("activeaccount/{activecode}")
    public String activateUser(@PathVariable("activecode") String activecode){
        return usersService.activationUser(activecode);
    }

    @GetMapping("/allusers")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/getuser")
    public Users getUser(@RequestBody UserId userId){
        return usersService.getUser(userId.userId());

    }

}
