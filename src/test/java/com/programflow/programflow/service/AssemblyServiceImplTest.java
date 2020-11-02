//package com.programflow.programflow.service;
//
//
//import com.programflow.programflow.repository.AssemblyRepository;
//import com.programflow.programflow.repository.UserRepository;
//import com.programflow.programflow.service.impl.AssemblyServiceImpl;
//import com.programflow.programflow.util.ObjectFactory;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.util.Optional;
//
//import static com.programflow.programflow.util.ObjectFactory.*;
//import static org.assertj.core.api.Assertions.catchThrowable;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class AssemblyServiceImplTest {
//
//
//    @Mock
//    AssemblyRepository assemblyRepository;
//
//    @Mock
//    UserRepository userRepository;
//
//    @Mock
//    WebClientUserService webClientUserService;
//    @InjectMocks
//    AssemblyServiceImpl assemblyService;
//
//    @Test
//    void addCompany_givenRegisterNumberIsAlreadyInUse_thenThrowRegistrationNumberAlreadyExists() {
//        //given
//        when(webClientUserService.findByUserId(USER_ID)).thenReturn(Optional.of(getUserDto()));
//        when(assemblyRepository.findByAssemblyLink(ASSEMBLY_LINK)).thenReturn(Optional.of(ObjectFactory.buildGetTraderCompany()));
//
//        //when
//        Throwable thrown = catchThrowable(() -> assemblyService.addAssembly(getAssemblyDto(), USER_ID));
//
//
//        //then
//        assertThat(thrown).isInstanceOf(CompanyManagerException.class)
//                .hasFieldOrPropertyWithValue("errorType", ErrorType.REGISTRATION_NUMBER_ALREADY_EXISTS);
//    }
//
//    @Test
//    void addCompany_givenTaxNumberIsAlreadyInUse_theThrowTaxNumberAlreadyExists() {
//        //given
//        when(webClientUserService.findByUserId(USER_ID)).thenReturn(Optional.of(getUserDto()));
//        when(companyRepository.findByRegistrationNumber(REGISTRATION_NUMBER)).thenReturn(Optional.empty());
//        when(companyRepository.findByTaxNumber(TAX_NUMBER)).thenReturn(Optional.of(ObjectFactory.buildGetTraderCompany()));
//
//
//        Throwable thrown = catchThrowable(() -> companyService.addCompany(getCompanyDto(), USER_ID));
//
//
//        assertThat(thrown).isInstanceOf(CompanyManagerException.class)
//                .hasFieldOrPropertyWithValue("errorType", ErrorType.TAX_NUMBER_ALREADY_EXISTS);
//    }
//
//    @Test
//    void addCompany_givenUserHasNotFound_thenThrowUserNotFound() {
//
//        when(webClientUserService.findByUserId(USER_ID)).thenReturn(Optional.empty());
//
//
//        Throwable thrown = catchThrowable(() -> companyService.addCompany(getCompanyDto(), USER_ID));
//
//
//        assertThat(thrown).isInstanceOf(CompanyManagerException.class)
//                .hasFieldOrPropertyWithValue("errorType", ErrorType.USER_NOT_FOUND);
//    }
//
//    @Test
//    void addCompany_givenUserHasAlreadyCompany_thenThrowUserHasAlreadyCompany() {
//
//        UserDto userDto = getUserDto();
//        userDto.setCompanyId(COMPANY_ID);
//        when(webClientUserService.findByUserId(USER_ID)).thenReturn(Optional.of(userDto));
//
//
//        Throwable thrown = catchThrowable(() -> companyService.addCompany(getCompanyDto(), USER_ID));
//
//
//        assertThat(thrown).isInstanceOf(CompanyManagerException.class)
//                .hasFieldOrPropertyWithValue("errorType", ErrorType.USER_HAS_ALREADY_COMPANY);
//    }
//
//
//    @Test
//    void addCompany_ReturnCompanyID() {
//        //given
//        when(companyRepository.findByRegistrationNumber(REGISTRATION_NUMBER)).thenReturn(Optional.empty());
//        when(companyRepository.findByTaxNumber(TAX_NUMBER)).thenReturn(Optional.empty());
//        when(webClientUserService.findByUserId(USER_ID)).thenReturn(Optional.of(getUserDto()));
//        when(companyRepository.save(any(Company.class))).then(returnsFirstArg());
//
//        String companyId = companyService.addCompany(getCompanyDto(), USER_ID);
//
//        assertThat(companyId).isInstanceOf(String.class).hasSize(36);
//
//    }
//
//
//    @Test
//    public void getCompanyByCompanyIdTest() {
//        when(companyRepository.findCompanyByCompanyId(COMPANY_ID)).thenReturn(Optional.of(buildGetTraderCompany()));
//
//        CompanyDto companyDto = companyService.getCompanyByCompanyId(COMPANY_ID);
//
//        assertThat(companyDto)
//                .hasFieldOrPropertyWithValue("title", TITLE)
//                .hasFieldOrPropertyWithValue("email", E_MAIL)
//                .hasFieldOrPropertyWithValue("tradeName", TRADE_NAME)
//                .hasFieldOrPropertyWithValue("buyerType", null)
//                .hasFieldOrPropertyWithValue("userType", TRADER)
//                .hasFieldOrPropertyWithValue("phoneNumber", PHONE_NUMBER)
//                .hasFieldOrPropertyWithValue("address",
//                        "Address Line :" + ADDRESS_LINE + ", " + CITY + ", " + COUNTRY.toString() + ", " + POSTAL_CODE)
//                .hasFieldOrPropertyWithValue("companyRegistrationNumber", REGISTRATION_NUMBER)
//                .hasFieldOrPropertyWithValue("taxNumber", TAX_NUMBER)
//                .hasFieldOrPropertyWithValue("companyName", COMPANY_NAME)
//                .hasFieldOrPropertyWithValue("fullName", FULL_NAME)
//                .hasFieldOrPropertyWithValue("reason", REASON)
//                .hasFieldOrPropertyWithValue("status", PENDING);
//
//        assertThat(companyDto.getDocumentDtoList().get(0))
//                .hasFieldOrPropertyWithValue("fileSize", FILE_SIZE)
//                .hasFieldOrPropertyWithValue("fileType", FILE_TYPE1)
//                .hasFieldOrPropertyWithValue("fileName", FILE_NAME1);
//        assertThat(companyDto.getDocumentDtoList().get(1))
//                .hasFieldOrPropertyWithValue("fileSize", FILE_SIZE)
//                .hasFieldOrPropertyWithValue("fileType", FILE_TYPE2)
//                .hasFieldOrPropertyWithValue("fileName", FILE_NAME2);
//    }
//
//    @Test
//    void getCompanyByCompanyId_givenCompanyIdDoesNotExist_thenThrowCompanyNotFound() {
//        when(companyRepository.findCompanyByCompanyId(COMPANY_ID)).thenReturn(Optional.empty());
//
//        Throwable thrown = catchThrowable(() -> companyService.getCompanyByCompanyId(COMPANY_ID));
//
//        assertThat(thrown).isInstanceOf(CompanyManagerException.class)
//                .hasFieldOrPropertyWithValue("errorType", ErrorType.COMPANY_NOT_FOUND);
//    }
//
//
//}
//
