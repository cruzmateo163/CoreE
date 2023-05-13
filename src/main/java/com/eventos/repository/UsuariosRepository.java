package com.eventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventos.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository <Usuarios,Integer > {
	

}
