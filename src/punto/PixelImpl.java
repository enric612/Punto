package punto;

public class PixelImpl extends PuntoImpl implements Pixel {

	private Color color;
	
	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color c) {
		this.color = c;

	}

}
