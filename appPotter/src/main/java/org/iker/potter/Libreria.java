package org.iker.potter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.iker.potter.domain.Libro;
import org.iker.potter.estatico.LibrosHarryPotter;

public class Libreria {

	private List<Libro> pedido;

	private List<List<Libro>> librosConOferta;

	private List<Libro> librosSinOferta;

	private BigDecimal precioLibro = new BigDecimal(8);

	private Map<Integer, BigDecimal> descuentos = Map.of(
			1, new BigDecimal(1), 
			2, BigDecimal.valueOf(0.95), 
			3, BigDecimal.valueOf(0.90), 
			4, BigDecimal.valueOf(0.85), 
			5, BigDecimal.valueOf(0.80), 
			6, BigDecimal.valueOf(0.70), 
			7, BigDecimal.valueOf(0.60), 
			8, BigDecimal.valueOf(0.50));

	public Libreria(List<Libro> pedidoDeLibros) {

		librosConOferta = new ArrayList<>();
		librosSinOferta = new ArrayList<>();
		pedido = pedidoDeLibros;
	}

	public String getPrecioDePedido() {

		librosSinOferta.addAll(pedido);
		
		boolean terminadaOptimizacion = false;
		List<Libro> libros = null;
		
		while(!terminadaOptimizacion) {
			libros = librosSinOferta.stream()
						.distinct()
						.collect(Collectors.toList());
			
			if(!libros.isEmpty()) {
				libros.forEach(libro -> librosSinOferta.remove(libro));
				librosConOferta.add(libros);
				
			} else {
				terminadaOptimizacion = true;
			}
		}
		return calcularImporte();
	}
	
	private String calcularImporte() {

		BigDecimal total = new BigDecimal("0");
		BigDecimal librosConDescuento;
		BigDecimal librosSinDescuento = new BigDecimal(librosSinOferta.size());
		
		for (List<Libro> lista : librosConOferta) {
			librosConDescuento = new BigDecimal(lista.size());
			total = total
					.add(librosConDescuento
						.multiply(precioLibro)
						.multiply(descuentos.get(lista.size())));
		}
		
		total = total.add(librosSinDescuento.multiply(precioLibro));

		return total.setScale(2).toString();
	}

}
