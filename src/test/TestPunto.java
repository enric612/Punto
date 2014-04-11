package test;

import java.util.*;

import punto.*;

public class TestPunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Punto p = new PuntoImpl(3.0,4.0);
//		Punto q = new PuntoImpl(4.,5.);
//		
//		System.out.println("p Antes : "+p);
//		p.setX(7.9);
//		System.out.println("p Despues :"+p);
//		
//		Double dis = p.getDistanciaAOtroPunto(q);
//		System.out.println("La distancia entre p y q es : "+dis);
		
		
		/*
		 * Test Arrays
		 */
		
//		int n=5;
//		int a[] = new int[n];
//		a[0] = 1;
//		a[1] = 3;
//		mostrar(a.length);
//		
//		Punto [] tablaPuntos = new PuntoImpl[n];
//		
//		tablaPuntos[0] = new PuntoImpl();
//		tablaPuntos[1] = new PuntoImpl(1.,2.);
//		
//		Punto p = new PuntoImpl(3.0,4.0);
//		
//		tablaPuntos[2] = p; // Cuidado, aqui realmente se esta haciendo que el elemenro 2 del array tablaPuntos apunte a p
//							// Esto significa que si cambiamos p o cambiamos el elemento 2 de la tabla cambiaremos el otro. Es decir
//							// que son el mismo objeto.
//		
//		tablaPuntos[1].setX(3.0);
//		
//		
//		mostrar(tablaPuntos[1]);
		
		/*
		 * Test List
		 */
		
		List<Integer> listent = new ArrayList<Integer>(); 
		/*
		 * Es importante recordar que los ArrayList no tienen tamaño final
		 */
		
		
		
		listent.add(3);
		listent.add(44);
		listent.add(-34);
		
		mostrar(listent.size());
		
		List<Punto> lispun = new ArrayList<Punto>();
		
		lispun.add(new PuntoImpl(2.,3.));
		Punto p = new PuntoImpl(4.,5.);
		
		lispun.add(p);
		
		mostrar(lispun);
		
		mostrar(lispun.get(1));
		
		lispun.get(1).setX(88.);
		
		mostrar(p); 
		/* Como vemos sigue pasando que apuntamos al objeto p por lo que al modificamos el objeto p al modificar 
		 * el elemento que apunta al mismo 
		 */
		
		
		/*
		 * Test String
		 */
		
		String s = "Hola Mundo";
		
		mostrar(s.charAt(3)); // charAt(n) devuelve el caracter n del String que lo invoca.
		
		mostrar(s.indexOf('M')); //indexOf(char) devuelve el indice del caracter
		
		String t = s.replace('o', 'e');
		
		mostrar("s vale "+s);
		mostrar("t vale "+t);
		
		
		
		
	
	}
	
	/*
	 * Método mostrar para evitar poner System.out.println(); cada vez 
	 */
	
	public static void mostrar(Object p){
		System.out.println(p);
	}
	

}
