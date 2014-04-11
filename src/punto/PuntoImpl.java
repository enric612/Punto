package punto;

public class PuntoImpl implements Punto { 
	
	 private Double x; 
	 private Double y; 
	
	 public PuntoImpl (Double x1, Double y1) { 
	
		 this.x=x1; 
		 this.y=y1; 
	
	 } 
	
	 public PuntoImpl(){ 
	
		 this.x=0.; 
		 this.y=0.; 
	
	 } 
	
	 public Double getX() { return x; } 
	
	 public Double getY() { return y; } 
	
	 public void setX(Double x1) { x=x1; } 
	
	 public void setY(Double y1) { y=y1; } 
	
	 public Double getDistanciaAOtroPunto(Punto p){ 
	
		 Double dx = this.getX()-p.getX(); 
		 Double dy = this.getY()-p.getY(); 
	
		 return Math.sqrt(dx*dx+dy*dy); 
	
	 } 
	
	 // representación como cadena 
	
	 public String toString() { 
	
		 String s="("+this.getX()+","+ this.getY()+")"; 
	
	 return s; 
	
	 } 

}