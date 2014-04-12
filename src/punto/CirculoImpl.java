package punto;

public class CirculoImpl implements Circulo {
	
	private Punto centro;
	private Double radio;
	
	public CirculoImpl(Punto p, Double r){
		
		this.centro = p;
		this.radio = r;
		
	}
	

	@Override
	public Punto getCentro() {
		
		return centro;
	}

	@Override
	public void setCentro(Punto p) {
		this.centro = p;

	}

	@Override
	public Double getRadio() {
		
		return radio;
	}

	@Override
	public void setRadio(Double r) {
		
		this.radio = r;
		
	}

	@Override
	public Double getArea() {
		
		return Math.PI*this.radio*this.radio;
	}

	@Override
	public Double getLongitud() {
		
		return 2.*Math.PI*this.radio;
	}

}
