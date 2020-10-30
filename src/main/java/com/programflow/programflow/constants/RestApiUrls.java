package com.programflow.programflow.constants;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RestApiUrls {


    public static final String ASSEMBLY = "/v1/assembly";
    public static final String ASSEMBLY_ID = "/{assemblyId}";


    public static final String AFFILIATE_MILL = "/affiliate/mill";
    public static final String DELETE_AFFILIATE_MILL = "/affiliate/mill/delete/{affiliateRelationId}";
    public static final String UPDATE_AFFILIATE_MILL = "/affiliate/mill/update/{affiliateRelationId}";
    public static final String AFFILIATE_MILL_APPLICATIONS = "/affiliate/mill/application";

    public static final String AFFILIATE_MILL_APPLICATION_DETAIL = "/affiliate/application/{affiliateRelationId}";
    public static final String AFFILIATE_RELATIONS = "/affiliate/relations";
    public static final String AFFILIATE_RELATIONS_DETAIL = "/affiliate/relations/{affiliateRelationId}";

    public static final String AFFILIATED_TRADERS = "/affiliate/traders";


    public static final String APPLICATION = "/v1/application";
    public static final String GET_ALL_APPLICATIONS = "getAllApplications";
    public static final String APPLICATION_ID = "{applicationId}";
    public static final String UPDATE_APPLICATION_STATUS = "updateApplicationStatus";
    public static final String GET_USER_TYPE_STATUS = "getUserType/status";

    public static final String USER_ID = "/{userId}";
}
