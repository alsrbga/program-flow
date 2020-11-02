package com.programflow.programflow.controller;

import com.programflow.programflow.dto.AssemblyDto;
import com.programflow.programflow.dto.request.AssemblyRequestDto;
import com.programflow.programflow.service.AssemblyService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.programflow.programflow.constants.RestApiUrls.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(ASSEMBLY)
public class AssemblyController {

    private final AssemblyService assemblyService;

    @PostMapping(USER_ID)
    @ApiOperation(value = "Add Assembly", httpMethod = "POST")
    public ResponseEntity<String> addAssembly(@RequestBody @Valid AssemblyRequestDto assemblyRequestDto,
                                              @PathVariable String userId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(assemblyService.addAssembly(assemblyRequestDto, userId));
    }

    @GetMapping(ASSEMBLY_ID)
    public ResponseEntity<AssemblyDto> getAssembly(@PathVariable String assemblyId) {
        return ResponseEntity.ok(assemblyService.getAssemblyByAssemblyId(ASSEMBLY_ID));
    }


}
