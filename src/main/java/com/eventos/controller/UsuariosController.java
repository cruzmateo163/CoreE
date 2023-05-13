package com.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventos.model.Usuarios;
import com.eventos.repository.UsuariosRepository;

@Controller
@RequestMapping("/usuarios")  //http://localhost:8080/usuarios
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@GetMapping("")
	public String user (Model model) {
		model.addAttribute("usuarios", usuariosRepository.findAll());
		return "listar-usuarios";
	}
	
	@GetMapping("/create") //http://localhost:8080/usuarios/create
	public String create () {
		
		return "agregar-usuarios";
	}
	
	@PostMapping("/save")
	public String save (Usuarios usuario) {
		
		usuariosRepository.save(usuario);
		
		 return "redirect:/usuarios";
	}

	@GetMapping("/delete/{id}")
	public String delete (@PathVariable Integer id ) {
		Usuarios usuario = usuariosRepository.getOne(id);
		usuariosRepository.delete(usuario);
		
		return "redirect:/usuarios";
	}
	
	@GetMapping("/edit/{id}")
	public String edit (@PathVariable Integer id, Model model) {
		Usuarios usuario = usuariosRepository.getOne(id);
		model.addAttribute("usuarios", usuario);
		return "editar-usuarios";
	}
	
	
}
