package com.programflow.programflow.util;


import com.programflow.programflow.dto.AssemblyDto;
import com.programflow.programflow.dto.UserDto;
import com.programflow.programflow.dto.request.AssemblyRequestDto;
import com.programflow.programflow.enums.Country;
import com.programflow.programflow.repository.entity.User;

import java.util.Date;

import static com.programflow.programflow.enums.Country.*;

public class ObjectFactory {

    public static final String PHONE_NUMBER = "+44 343 343 343";
    public static final String ADDRESS_LINE = "Address";
    public static final String CITY = "London";
    public static final Country COUNTRY = UNITED_KINGDOM;
    public static final String POSTAL_CODE = "35250";
    public static final String FULL_NAME = "HANS";
    public static final String E_MAIL = "company@gmail.com";
    public static final String PASSWORD = "12345678";
    public static final String ASSEMBLY_NAME = "Assembly Name";
    public static final String ASSEMBLY_LINK = "www.link.co.uk";


    public static final String PHONE_NUMBER_TWO = "+44 123 123 123";
    public static final String ADDRESS_LINE_TWO = "New Address";
    public static final String CITY_TWO = "Manchester";
    public static final Country COUNTRY_TWO = FRANCE;
    public static final String POSTAL_CODE_TWO = "27260";
    public static final String FULL_NAME_TWO = "JOHN";
    public static final String USER_ID_TWO = "USER2";
    public static final String USER_ID = "USER1";
    public static final String E_MAIL_TWO = "user@gmail.com";
    public static final String PASSWORD_TWO = "98765432";
    public static final String ASSEMBLY_NAME_TWO = "Name of Assembly";
    public static final String ASSEMBLY_LINK_TWO = "www.link-two.co.uk";


    public static final int ID = 1;
    public static final int ID_TWO = 2;
    public static final String ASSEMBLY_ID = "ID_ONE";
    public static final String ASSEMBLY_ID_TWO = "ID_TWO";
    public static final Date DATE = DateUtils.createDate(2020, 8, 29, 11, 20, 10);
    public static final String REASON = "More Information Needed";
    public static final Country COUNTRY_ONE = GERMANY;


    public static AssemblyDto getAssemblyDetailsDto() {
        return AssemblyDto.builder()
                .addressLine(ADDRESS_LINE_TWO)
                .city(CITY_TWO)
                .country(COUNTRY_TWO)
                .postalCode(POSTAL_CODE_TWO)
                .fullName(FULL_NAME_TWO)
                .email(E_MAIL_TWO)
                .password(PASSWORD_TWO)
                .companyName(ASSEMBLY_NAME_TWO).build();
    }


    public static AssemblyRequestDto getAssemblyDto() {
        AssemblyRequestDto AssemblyRequestDto = new AssemblyRequestDto();
        assemblyRequestDto.phoneNumber(PHONE_NUMBER_TWO)
        AssemblyRequestDto.setAddressLine(ADDRESS_LINE);
        AssemblyRequestDto.setCity(CITY);
        AssemblyRequestDto.setCountry(COUNTRY);
        AssemblyRequestDto.setPhoneNumber(PHONE_NUMBER);
        AssemblyRequestDto.setPostalCode(POSTAL_CODE);
        return AssemblyRequestDto;
    }


    public static UserDto getUserDto() {
        UserDto userDto = new UserDto();
        userDto.setAssemblyName(ASSEMBLY_NAME);
        userDto.setEmail(E_MAIL);
        userDto.setFullName(FULL_NAME);
        userDto.setPassword(HashingUtil.encode(PASSWORD));
        return userDto;
    }


//    public static EmailRequest getEmailRequest() {
//        EmailRequest emailRequest = new EmailRequest();
//        emailRequest.setType(APPLICATION_DECLINED);
//        emailRequest.setTo(E_MAIL);
//        return emailRequest;
//    }


}