package com.programflow.programflow.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {


    private String fullName;

    private String email;

    private String password;

    private String assemblyName;

    private String phoneNumber;

    private String assemblyId;
}

