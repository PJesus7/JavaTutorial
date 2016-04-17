public class CircleGeometric implements GeometricObject {
	protected double radius;

	public CircleGeometric(){
		radius = 1.0;}

	public CircleGeometric(double radius){
		this.radius = radius;}

	@Override
	public double getArea(){
		return radius*radius*Math.PI;}

	@Override
	public double getPerimeter(){
		return 2*radius*Math.PI;}

	@Override
	public String toString(){
		return "A Circle with radius=" + radius + ", which has perimeter "
		+ getPerimeter() + " and area " + getArea();}
}