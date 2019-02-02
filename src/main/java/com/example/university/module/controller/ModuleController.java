package com.example.university.module.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.module.entity.Module;
import com.example.university.module.service.ModuleService;

@RestController
@RequestMapping("modulos")
public class ModuleController {

	@Autowired
	ModuleService moduleService;

	@GetMapping("/lista")
	public List<Module> getAllModules() {

		return moduleService.getAllModule();

	}

	@PostMapping("/insertar")
	public Module guardarModulo(@RequestBody Module modulo) {

		return moduleService.registrarModulo(modulo);
	}

	@GetMapping("/insertar/{moduleCode}/{moduleName}")
	public Module guardarModuloString(@PathVariable String moduleCode, @PathVariable String moduleName) {
		
		Module mod = new Module();
		
		mod.setModuleCode(moduleCode);
		mod.setModuleName(moduleName);

		return moduleService.registrarModulo(mod);
	}

}
