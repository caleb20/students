package com.example.university.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.university.module.entity.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {

	
	
}
