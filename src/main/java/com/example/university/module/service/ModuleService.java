package com.example.university.module.service;

import java.util.List;

import com.example.university.module.entity.Module;

public interface ModuleService {

	List<Module> getAllModule();

	Module registrarModulo(Module nuevoModulo);
}
