public class TestLine {
    public static void main(String[] args) {
        Point p1=new Point(0,0);
        Point p2=new Point(4,4);
        Point p3=new Point(0,4);
        Point p4=new Point (4,0);
        
        Line L1=new Line(p1,p2);
        Line L2=new Line(p3,p4);

        Point intersectionPoint=L1.intersection(L2);
        if(intersectionPoint !=null)
            System.out.println("Point of Intersection"+ intersectionPoint);
        else
            System.out.println("No Point of intersection. Lines are parallel");
    }
    
}
