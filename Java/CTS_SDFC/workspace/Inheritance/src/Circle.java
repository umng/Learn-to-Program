
class Circle extends Shape {
	int radius;
	
	Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	Double calculateArea() {
		return (double) Math.PI*radius*radius;
	}
}