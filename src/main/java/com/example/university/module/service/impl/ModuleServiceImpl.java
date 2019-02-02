package com.example.university.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.module.entity.Module;
import com.example.university.module.repository.ModuleRepository;
import com.example.university.module.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	ModuleRepository moduleRepository;

	@Override
	public List<Module> getAllModule() {

		return moduleRepository.findAll();
	}

	@Override
	public Module registrarModulo(Module nuevoModulo) {

		return moduleRepository.save(nuevoModulo);
	}

}
