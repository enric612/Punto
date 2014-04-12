package test;

import punto.*;

public class TestPixel {

	public static void main(String[] args) {
		Pixel q = new PixelImpl(1.0,2.0,Color.AMARILLO);
		
		System.out.println(q.getX());
		q.setX(4.0);
		System.out.println(q.getX());
		
		System.out.println(q);
		
	}
}
