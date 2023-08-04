package com.example.demo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@Table(name = "dispositivi")
	@Data
	@NoArgsConstructor
public class Dispositivo {
	
		@Id
		@GeneratedValue
		private UUID id;
		private TipoDispositivo tipo;
		private StatoDispositivo stato;
		
		@ManyToOne
		private Utente utente;

		public Dispositivo(TipoDispositivo tipo, StatoDispositivo stato) {
			this.tipo = tipo;
			this.stato = stato;
	}
}
