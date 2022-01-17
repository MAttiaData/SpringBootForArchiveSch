package com.example.SpringBootForArchiveSch.repository;


import com.example.SpringBootForArchiveSch.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModulesRepo extends JpaRepository<Module,Long> {

}
