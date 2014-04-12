package test;

import punto.*;

public class TestCirculo {

	public static void main(String[] args) {
		
		Circulo c = new CirculoImpl(new PuntoImpl(1.,0.),4.);
		
		mostrar("El area del circula es "+c.getArea());

	}
	
	public static void mostrar(String s){
		
		System.out.println(s);
		
	}
	
	

}

