public class TrianglePoint{
    private Point p1;
    private Point p2;
    private Point p3;

    public TrianglePoint(){
        this.p1=new Point(0.0,0.0);
        this.p2=new Point(0.0,0.0);
        this.p3=new Point(0.0, 0.0);


    }
    public TrianglePoint(Point p1,Point p2,Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    } 
    public TrianglePoint(TrianglePoint TP){
        this.p1=new Point(TP.p1.getX(),TP.p1.getY());
        this.p2=new  Point(TP.p2.getX(),TP.p2.getY());
        this.p3=new Point(TP.p3.getX(),TP.p3.getY());
    }
    public Point getp1(){
        return p1;
    }
    public Point getp2(){
        return p2;
    }
    public Point getp3(){
        return p3;
    }
    public void setp1p2p3(Point p1,Point p2,Poinr p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    @Override
    public String toString(){
        return "TRIANGLE WITH IT THREE POINTS"+"\nPoint 1: "+p1+"\nPoint 2: "+p2+"\nPoint 3: "+p3;
    }

    


    
}
