public class Circle2 extends Shape {
	private double radius;

	public Circle2 (){
		super();
		radius = 1.0;}

	public Circle2(double radius){
		super();
		this.radius = radius;}

	public Circle2(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;}

	public double getRadius(){
		return radius;}

	public void setRadius(double radius){
		this.radius = radius;}

	public double getArea(){
		return radius*radius*Math.PI;}

	public double getPerimeter(){
		return 2*radius*Math.PI;}

	@Override
	public String toString(){
		return "A Circle with radius=" + radius + ", which is a subclass of:" + super.toString();}
}