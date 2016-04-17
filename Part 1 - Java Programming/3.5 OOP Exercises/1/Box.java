public class Box {
	//variables
	private int x1;
	private int y1;
	private int x2;
	private int y2;

   // Constructors
	public Box(int x, int y, int width, int height) {
		x1 = x;
		y1 = y;
		x2 = x + width - 1;
		y2 = y + height - 1;
	}

   // toString()
   public String toString() {
      return "Box at (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")";
   }

	public boolean collidesWith(Ball ball) {
		if (ball.getX() - ball.getRadius() <= x1 ||
	   		ball.getX() + ball.getRadius() >= x2) {
				ball.reflectHorizontal();
				return true;
			}
		if (ball.getY() - ball.getRadius() <= y1 ||
	   		ball.getY() + ball.getRadius() >= y2) {
				ball.reflectVertical();
				return true;
			}
	   return false;
   }

}