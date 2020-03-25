package org.iker.potter.domain;

import org.iker.potter.estatico.LibrosHarryPotter;

import lombok.Data;

@Data
public class Libro {

	private String name;
	
	private String isbn;
	
	public Libro(String name, String isbn) {
		this.name = name;
		this.isbn = isbn;
	}
	
	public Libro(LibrosHarryPotter catalogo) {
		
		this.name = catalogo.getNombre();
		this.isbn = catalogo.getIsbn();
	}
	
}
