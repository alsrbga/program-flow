package com.programflow.programflow.repository;


import com.programflow.programflow.repository.entity.Assembly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssemblyRepository extends JpaRepository<String, Integer> {

    Optional<Assembly> findAssemblyByAssemblyId(String assemblyId);

    Optional<Assembly> findByAssemblyLink(String assemblyLink);


}
