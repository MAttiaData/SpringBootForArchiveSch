package com.example.SpringBootForArchiveSch.repository;

import com.example.SpringBootForArchiveSch.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ModuleRepo extends JpaRepository<Module, Long> {


}
