package org.iker.potter.estatico;

public enum LibrosHarryPotter {
	UNO("Harry Potter y la piedra filosofal","123"),
	DOS("Harry Potter y la cámara secreta","124"),
	TRES("Harry Potter y el prisionero de Azkaban","125"),
	CUATRO("Harry Potter y el cáliz de fuego","126"),
	CINCO("Harry Potter y la Orden del Fénix","127"),
	SEIS("Harry Potter y el misterio del príncipe","128"),
	SIETE("Harry Potter y las reliquias de la Muerte","129"),
	OCHO("Harry Potter y el legado maldito","130");
	
	private String nombre;
	private String isbn;
	
	private LibrosHarryPotter(String nombre, String isbn){
		this.isbn = isbn;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getIsbn() {
		return isbn;
	}
}
