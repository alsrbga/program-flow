package com.programflow.programflow.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class AssemblyDto {

    private String assemblyDescription;

    private Date assemblyStartDate;

    private Date assemblyEndDate;

    private String assemblyLink;
}


