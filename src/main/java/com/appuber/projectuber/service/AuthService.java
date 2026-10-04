package com.appuber.projectuber.service;

import com.appuber.projectuber.dto.DriverDto;
import com.appuber.projectuber.dto.SignUpDto;
import com.appuber.projectuber.dto.UserDto;
import org.springframework.stereotype.Service;


public interface AuthService {

String login(String email,String password);
UserDto signup(SignUpDto signUpDto);
DriverDto onboardnewdriver(Long userId);

}
