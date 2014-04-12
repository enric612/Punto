package punto;

public class PixelImpl extends PuntoImpl implements Pixel {

	private Color color;
	
	public PixelImpl(){
		super();
		this.color = Color.VERDE;
	}
	
	public PixelImpl(Color c){
		super();
		this.color = c;
	}
	
	public PixelImpl(Double x, Double y,Color c) {
		super(x,y);
		this.color = c;
		
		
		
	}
	
	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color c) {
		this.color = c;

	}

}
