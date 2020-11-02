package com.programflow.programflow.controller;

import com.programflow.programflow.dto.AssemblyDto;
import com.programflow.programflow.dto.request.AssemblyRequestDto;
import com.programflow.programflow.service.AssemblyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.programflow.programflow.constants.RestApiUrls.ASSEMBLY_ID;
import static com.programflow.programflow.constants.RestApiUrls.USER_ID;
import static com.programflow.programflow.util.ObjectFactory.getAssemblyDto;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AssemblyControllerTest {
    @InjectMocks
    AssemblyController assemblyController;

    @Mock
    AssemblyService assemblyService;

    @Test
    void testAddCompany() {

        AssemblyRequestDto assemblyDetails = getAssemblyDto();
        when(assemblyService.addAssembly(assemblyDetails, USER_ID)).thenReturn(ASSEMBLY_ID);

        //when
        ResponseEntity<String> responseEntity = assemblyController.addAssembly(assemblyDetails, USER_ID);

        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(responseEntity.getBody()).isEqualTo(ASSEMBLY_ID);

        verify(assemblyService).addAssembly(assemblyDetails, USER_ID);
    }


    @Test
    public void testGetCompany() {
        when(assemblyService.getAssemblyByAssemblyId(ASSEMBLY_ID)).thenReturn(new AssemblyDto());

        ResponseEntity<AssemblyDto> response = assemblyController.getAssembly(ASSEMBLY_ID);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isInstanceOf(AssemblyDto.class);
    }

}
