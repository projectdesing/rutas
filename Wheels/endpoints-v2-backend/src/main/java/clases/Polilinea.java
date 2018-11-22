package clases;

public class Polilinea {
	
	protected float cooX;
	protected float cooY;

	
	public Polilinea(float cooX, float cooY) {
		super();
		this.cooX = cooX;
		this.cooY = cooY;
	}

	public float getCooX() {
		return cooX;
	}

	public void setCooX(float cooX) {
		this.cooX = cooX;
	}

	public float getCooY() {
		return cooY;
	}

	public void setCooY(float cooY) {
		this.cooY = cooY;
	}

	@Override
	public String toString() {
		return "Polillinea [cooX=" + cooX + ", cooY=" + cooY + "]";
	}
	
}
