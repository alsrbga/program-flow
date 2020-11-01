package com.programflow.programflow.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ErrorType {
    MANDATORY_FIELD_IS_NULL(1000, "This field can not be blank", NOT_ACCEPTABLE),
    INTERNAL_ERROR(1001, "An internal server error occurred", INTERNAL_SERVER_ERROR),
    INVALID_PARAMETER_ERROR(1002, "Invalid field(s). ", NOT_ACCEPTABLE),
    PHONE_NUMBER_ALREADY_EXISTS(1003, "Phone number already exists.", NOT_ACCEPTABLE),
    USER_NOT_FOUND(1004, "User not found", BAD_REQUEST),
    USER_SERVICE_UNREACHABLE(1005, "User Service is unreachable", INTERNAL_SERVER_ERROR),
    USER_WS_BAD_REQUEST(1006, "User Service Bad Request", INTERNAL_SERVER_ERROR),
    USER_SERVICE_BAD_REQUEST(1007, "User Service Bad Request Error", INTERNAL_SERVER_ERROR),
    USER_SERVICE_INTERNAL_ERROR(1008, "User Service Internal Error", INTERNAL_SERVER_ERROR),
    USER_SERVICE_POST_INTERNAL_ERROR(1009, "User Service Internal Error", INTERNAL_SERVER_ERROR),
    NO_DATA_FOUND(1010, "No data found", BAD_REQUEST),
    EMAIL_SERVICE_ERROR(1011, "An error occurred in the email service", INTERNAL_SERVER_ERROR),
    EMAIL_SERVICE_BAD_REQUEST(1012, "Email service returned request as a bad request", BAD_GATEWAY),
    ASSEMBLY_NOT_FOUND(1013, "Assembly not found", BAD_REQUEST),
    COMPANY_NOT_APPROVED(1014, "The Assembly is not approved. You are not allowed to take an action!", UNAUTHORIZED),
    USER_HAS_ALREADY_ASSEMBLY(1015, "The user has already an assembly", BAD_REQUEST),
    USER_IS_NOT_VERIFIED(1016, "The user is not verified.", UNAUTHORIZED),
    NOT_ALLOWED_UPDATE(1017, "You are not allowed to update information", UNAUTHORIZED),
    INVALID_COUNTRY(1018, "Invalid country name.", NOT_ACCEPTABLE),
    ASSEMBLY_LINK_ALREADY_EXISTS(1019, "The Assembly already exist", NOT_ACCEPTABLE),
    EMAIL_ALREADY_EXISTS(1020, "Email already exist", NOT_ACCEPTABLE);


    private final Integer code;
    private final String message;
    private final HttpStatus httpStatus;
}
