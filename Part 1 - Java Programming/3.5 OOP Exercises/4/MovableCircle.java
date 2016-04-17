public class MovableCircle implements Movable {
	private MovablePoint center; // can use center.x, center.y directly because they are package accessible
	private int radius;

	public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public String toString () {
		return "Circle with radius " + radius + " and center " + center;
	}

	// Implement abstract methods declared in the interface Movable
	@Override
	public void moveUp() {
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		center.y += center.ySpeed;
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	@Override
	public void moveRight() {
		center.x += center.xSpeed;
	}

}