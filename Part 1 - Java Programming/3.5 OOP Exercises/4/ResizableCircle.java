public class ResizableCircle extends CircleGeometric implements Resizable {

	public ResizableCircle(double radius){
		super(radius);}

	// implement method defined in the interface Resizable
	@Override
	public void resize(int percent){
		super.radius = (int) super.radius*((double)percent/100) ;}
}