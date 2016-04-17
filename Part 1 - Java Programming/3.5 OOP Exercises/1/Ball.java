public class Ball {
   // Private variables
   private float x;
   private float y;
   private int radius;
   private float xDelta;
   private float yDelta;

   // Constructors
   public Ball(int x, int y, int radius, int speed, int direction) {
      this.x = x;
      this.y = y;
      this.radius = radius;
      xDelta = (float)speed * ((float)Math.cos(direction * Math.PI/180));
      yDelta = (float)speed * ((float)-Math.sin(direction * Math.PI/180));
   }

   // Getters and Setters
   public float getX() {
      return x;
   }

   public float getY() {
      return y;
   }

   public int getRadius() {
      return radius;
   }

   public float getXDelta() {
      return xDelta;
   }

   public float getYDelta() {
      return yDelta;
   }

   public void setX(float x) {
      this.x = x;
   }

   public void setY(float y) {
      this.y = y;
   }

   public void setXY(float x, float y) {
      setX(x); setY(y);
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   public void setXDelta(float xDelta) {
      this.xDelta = xDelta;
   }

   public void setYDelta(float yDelta) {
      this.yDelta = yDelta;
   }


   //methods
	public void move() {
	   x += xDelta; y += yDelta;
   }

	public void reflectHorizontal() {
	   xDelta = -xDelta;
   }

	public void reflectVertical() {
	   yDelta = -yDelta;
   }

   // toString()
	public String toString() {
      return "Ball at (" + x + "," + y + ") of velocity (" + xDelta + "," + yDelta + ")";
   }



}