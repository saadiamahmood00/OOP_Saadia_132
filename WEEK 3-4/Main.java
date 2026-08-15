public class Main {
    public static void main(String[] args) {
        Point p1=new Point(0, 0);
        Point p2=new Point(2, 3);
        Point p3=new Point(4, 6);

        TrianglePoint t1=new TrianglePoint(p1,p2,p3);
        System.out.println(t1);
        Line L1=new Line(p1,p2);
        Line L2=new Line(p2, p3);
        Line L3=new Line(p3, p1);
        TriangleLine t2=new TriangleLine(L1,L2,L3);
        System.out.println(t2);
    }
    
}
