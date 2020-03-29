#Potter

##Descripción del problema

Harry Potter es una colección de 8 novelas, escrita por la autora británica J. K. Rowling, en la que se describen las aventuras del joven aprendiz de mago Harry Potter y sus amigos. 
Nuestra librería ha decidido poner en venta los libros con una oferta especial:

	Cada libro cuesta 8€
	Si compras 2 libros diferentes tienes un 5% de descuento
	si compras 3 libros diferentes tienes un 10% de descuento
	si compras 4 libros diferentes tienes un 15% de descuento
	si compras 5 libros diferentes tienes un 20% de descuento
	si compras 6 libros diferentes tienes un 30% de descuento
	si compras 7 libros diferentes tienes un 40% de descuento
	si compras toda la colección tienes un 50% de descuento

Tras la locura desatada por semejante oferta, la librería se está llenando de adolescentes alocados comprando libros en grandes cantidades y las cajeras no dan a basto porque pierden mucho tiempo realizando cálculos.

Por lo tanto tu objetivo es crear un módulo de código fuente que pueda aportar la solución a este problema y devuelva el precio de compra para cada combinación que haga cualquier cliente.

Se proponen algunos ejemplos prácticos para entender los diferentes casos:

>_comprando 2 copias del primer libro el precio es 8€ por unidad: 8 * 2 = 16_

>_comprando 2 copias del primer libro y una del segundo: (8€ * 2libros * 0.95descuento) + 8€_

>_comprando 5 copias de toda la colección: (8€ * 7libros * 0.60descuento) * 5copias_

[Basada en la kata Potter](http://codingdojo.org/cgi-bin/wiki.pl?KataPotter  "kata Potter")