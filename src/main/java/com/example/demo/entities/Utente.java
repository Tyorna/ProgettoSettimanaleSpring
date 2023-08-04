package com.example.demo.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "utenti")
@Data
@NoArgsConstructor
public class Utente {
	@Id
	@Column(nullable = false, unique = true)
	private String username;
	private String name;
	private String surname;
	@Column(nullable = false, unique = true)
	private String email;
    
	@OneToMany(mappedBy = "utente")
	private Set<Dispositivo> dispositivo;
	
	public Utente(String username, String name, String surname, String email) {
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
}
