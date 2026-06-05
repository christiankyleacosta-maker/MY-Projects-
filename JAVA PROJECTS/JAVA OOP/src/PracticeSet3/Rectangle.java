package PracticeSet3;

public class Rectangle {
	
	public double heigth;
	public double width;
	
	public Rectangle(double Heigth, double Width){
		this.heigth = Heigth;
		this.width = Width;
	}
	
	public double getWidth() {
		return width;
	}
	public void setwidth(double width) {
		this.width = width;
	}
	
	public double getHeigth() {
		return heigth;
	}
	public void setHeight(double heigth) {
		this.heigth = heigth;
	}
	
//	Calculation of Area of the Rectangle as well as the Parameter
	
	public double CalculateArea() {
		return width*heigth;
	}
	
	public double CalculateParameter() {
		return 2 * (width + heigth);
	}
	
}
