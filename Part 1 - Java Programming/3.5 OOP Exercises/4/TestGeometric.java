public class TestGeometric {
	public static void main (String[] args) {

GeometricObject g1 = new CircleGeometric(5);
System.out.println(g1);

ResizableCircle g2 = new ResizableCircle(5);
System.out.println(g2);
g2.resize(200);
System.out.println(g2);
g2.resize(50);
System.out.println(g2);
g2.resize(0);
System.out.println(g2);

	}
}