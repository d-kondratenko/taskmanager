package com.epic.taskmanager.users.services;

import com.epic.taskmanager.users.dto.SessionControlDto;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Base64;

@Service
public class SessionControlService {

    public String login(String userNr, String password){
        return null;
    }

    public String generateToken(String userNr, String password, String email){
        String preToken = userNr+password+email;
        return Base64.getEncoder().encodeToString(preToken.getBytes());
    }

    public void saveSession(SessionControlDto sessionControlDto){
    }

    public Long getSessionId(String userNr, String token){ return null; }

    public void deleteSession(Long sessionId){
    }
    public boolean chekSessionExists(int userId, String token){
        return  false;
    }

    public boolean chekExpirePeriod(Long sessionId, LocalDateTime currentDate){
        return false;
    }
}
