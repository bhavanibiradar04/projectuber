package com.appuber.projectuber.service.imple;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.SignUpDto;
import com.appuber.projectuber.dto.UserDto;
import com.appuber.projectuber.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthSeriveImple implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardnewdriver(Long userId) {
        return null;
    }
}
