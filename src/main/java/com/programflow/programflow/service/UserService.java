package com.programflow.programflow.service;

import com.programflow.programflow.dto.request.UserRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void createNewUser(UserRequestDto userDto);
}
