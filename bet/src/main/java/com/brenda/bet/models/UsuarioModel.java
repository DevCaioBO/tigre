package com.brenda.bet.models;

import java.util.UUID;

import com.brenda.bet.controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;

@Entity
@Table(name ="tb_usuario")

public class UsuarioModel {
	
	public UsuarioModel(@Valid UsuarioDTO user) {
		this.cpf = user.cpf();
		this.aniver = user.aniver();
		this.email = user.email();
		this.senha = user.senha();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String cpf,aniver,email,senha;


}
