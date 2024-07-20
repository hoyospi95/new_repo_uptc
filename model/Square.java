package co.edu.uptc.model;

public class Square  {
	private int side;
	
	public void setSide(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return side * side;
	}

}
