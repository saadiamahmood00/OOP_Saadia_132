public class Line {
    Point A;
    Point B;
     
    public Line(){
        this.A=new Point(0.0,0.0);
        this.B=new Point(0.0,0.0);
      
    }
    public Line(Point A,Point B){
         this.A=A;
        this.B=B;
    
    }
    public Line(Line L){
        this.A=new Point(L.A.getX(),L.A.getY());
        this.B=new Point(L.B.getX(),L.B.getY());
    }
    public Point getA() {
        return A;
    }
    public Point getB(){
        return B;
    }
   
    public void setABCD(Point A,Point B){
        this.A=A;
        this.B=B;
    }
    @Override
    public String toString()
    {
        return "Line 1"+A+"to"+B;
    }

    public Point intersection(Line A1){
        double x1=this.A.getX(), y1=this.A.getY();
        double x2=this.B.getX(),y2=this.B.getY();
        double x3=A1.A.getX(),y3=A1.A.getY();
        double x4=A1.B.getX(),y4=A1.B.getY();

        double denominator=(x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);

        double numX=(x1*y2-y1*x2)*(x3-x4)-(x1-x2)*(x3*y4-y3*x4);
        double numY=(x1*y2-y1*x2)*(y3-y4)-(y1-y2)*(x3*y4-y3*x4);

        return new Point(numX/denominator,numY/denominator);

    }

    
}
