

import java.util.Comparator;

public class Rectangle {
	private double recWidth;
	private double recHeight;
	Rectangle(double recWidth,double recHeight) throws Exception{
		if(recWidth < 0 || recWidth > 20 || recHeight < 0 || recHeight > 20) {
			throw new Exception("Height and/or Width is less than 0 or greater than 20");
		}
		this.recWidth = recWidth;
		this.recHeight = recHeight;
	}
	public double getrecWidth(){
		return recWidth;
	}
	public double getrecHeight() {
		return recHeight;
	}
	public void setWH(double recWidth,double recHeight) throws Exception {
		
		if(recWidth < 0 || recWidth > 20 || recHeight < 0 || recHeight > 20) {
			throw new Exception("Height and/or Width is less than 0 or greater than 20");
		}
		this.recWidth = recWidth;
		this.recHeight = recHeight;
	}
	public double calculatePerimeter() {
		double perimeter = (2 * recWidth) + (2 * recHeight);
		return perimeter;
	}
	public double calculateArea() {
		double area = recWidth * recHeight;
		return area;
	}

}
class RectangleComparator implements Comparator<Rectangle>{ 
	@Override
	public int compare(Rectangle testRec, Rectangle testRec2) {
		return Double.compare(testRec.calculateArea(),testRec2.calculateArea());
		
	}
}
