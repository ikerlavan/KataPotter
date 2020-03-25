package org.iker.potter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

import org.iker.potter.domain.Libro;
import org.iker.potter.estatico.LibrosHarryPotter;
import org.junit.jupiter.api.Test;

public class AppPotterTest {

	Libreria libreria;
	
	@Test
	void shouldBuy1equal2Diferent() {
		List<Libro> pedido = Arrays.asList(
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.DOS)
				);
		
		libreria = new Libreria(pedido);
		
		assertEquals("23.20", libreria.getPrecioDePedido());
		
	}
	
	@Test
	void shouldBuy1Only2Diferent8Diferent() {
		List<Libro> pedido = Arrays.asList(
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO),
				new Libro(LibrosHarryPotter.CINCO),
				new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE),
				new Libro(LibrosHarryPotter.OCHO)
				);
		
		libreria = new Libreria(pedido);
		BigDecimal resultado = new BigDecimal((8*8*0.50)+(8*2*0.95)+8);
		assertEquals(resultado.setScale(2, RoundingMode.HALF_UP).toString(), 
				libreria.getPrecioDePedido());
		
	}
	
	@Test
	void shouldBuy1Diferent() {
		List<Libro> pedido = Arrays.asList(
				new Libro(LibrosHarryPotter.OCHO)
				);
		
		libreria = new Libreria(pedido);
		
		assertEquals("8.00", libreria.getPrecioDePedido());
		
	}
	
	@Test
	void shouldBuy5CollectionsAnd3Diferent() {
		List<Libro> pedido = Arrays.asList(
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS),	new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO), new Libro(LibrosHarryPotter.CINCO), new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE), new Libro(LibrosHarryPotter.OCHO),
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS),	new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS), new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO), new Libro(LibrosHarryPotter.CINCO), new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE), new Libro(LibrosHarryPotter.OCHO),
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS),	new Libro(LibrosHarryPotter.TRES),				
				new Libro(LibrosHarryPotter.CUATRO), new Libro(LibrosHarryPotter.CINCO), new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE), new Libro(LibrosHarryPotter.OCHO),
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS),	new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO), new Libro(LibrosHarryPotter.CINCO), new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE), new Libro(LibrosHarryPotter.OCHO),
				new Libro(LibrosHarryPotter.UNO), new Libro(LibrosHarryPotter.DOS),	new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO), new Libro(LibrosHarryPotter.CINCO), new Libro(LibrosHarryPotter.SEIS),
				new Libro(LibrosHarryPotter.SIETE), new Libro(LibrosHarryPotter.OCHO)
				);
		
		libreria = new Libreria(pedido);
		BigDecimal resultado = new BigDecimal( (8*(5*8)*0.50) + (3*8*0.90));
		assertEquals(resultado.setScale(2, RoundingMode.HALF_UP).toString(), 
				libreria.getPrecioDePedido());
		
	}
	
	@Test
	void shouldBuy5Diferent3Diferent2Diferent() {
		List<Libro> pedido = Arrays.asList(
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.UNO),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.DOS),
				new Libro(LibrosHarryPotter.TRES),
				new Libro(LibrosHarryPotter.CUATRO),
				new Libro(LibrosHarryPotter.CINCO),
				new Libro(LibrosHarryPotter.CINCO)
				);
		
		libreria = new Libreria(pedido);
		BigDecimal resultado = new BigDecimal((8*5*0.80)+(8*3*0.90)+(8*2*0.95));
		assertEquals(resultado.setScale(2, RoundingMode.HALF_UP).toString(), 
				libreria.getPrecioDePedido());
		
	}
}
