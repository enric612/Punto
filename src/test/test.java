package test;

import punto.*;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Punto p = new PuntoImpl(3.0,4.0);
		Punto q = new PuntoImpl(4.,5.);
		
		System.out.println("p Antes : "+p);
		p.setX(7.9);
		System.out.println("p Despues :"+p);
		
		Double dis = p.getDistanciaAOtroPunto(q);
		System.out.println("La distancia entre p y q es : "+dis);
	}

}
