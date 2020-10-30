package com.programflow.programflow.service;

import com.programflow.programflow.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface WebClientUserService {

    Optional<UserDto> findByUserId(String userId);

    void updateUser(UserDto userDto, String userId);
}
