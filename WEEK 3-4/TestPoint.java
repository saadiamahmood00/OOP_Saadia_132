public class TestPoint {
    public static void main(String[] args) {
        Point p1=new Point(5,4);
        Point P2=new Point(2,3);

        Point p3=p1.add(P2);
        System.out.println("Points after addition"+ p3);
        Point p4=p1.subtract(P2);
        System.out.println("Points after subtraction"+p4);

    }
}
