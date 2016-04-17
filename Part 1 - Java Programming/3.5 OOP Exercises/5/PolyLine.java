import java.util.*;
public class PolyLine {
   private List<Point> points = new ArrayList<Point>();
      // Allocate an ArrayList of Points and upcast to List

   public PolyLine() { }   // default constructor

   public PolyLine(List<Point> points) {
      this.points = points;
   }

   // Append a point at (x, y) to the end of this polyline
   public void appendPoint(int x, int y) {
      Point newPoint = new Point(x, y);
      points.add(newPoint);
   }

   // Append a point instance to the end of this polyline
   public void appendPoint(Point point) {
      points.add(point);
   }

   // Insert point at a giver index
   public void appendPoint(int x, int y, int index) {
      Point newPoint = new Point(x, y);
      points.add(index, newPoint);
   }

   public void appendPoint(Point point, int index) {
      points.add(index, point);
   }

   // return (x1,y1)(x2,y2)(x3,y3)....
   public String toString() {
      StringBuilder sb = new StringBuilder();
      for (Point aPoint : points) {
          sb.append(aPoint.toString());
      }
      return sb.toString();
   }
}