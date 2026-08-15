public class Point {
    private double x;
    private double y;

    public Point(){
        this.x=0;
        this.y=0;

    }
    
    public Point(double x, double y){
        this.x=x;
        this.y=y;

    }
    public Point(Point P){
        this.x=P.x;
        this.y=P.y;

    }
    public  void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
   
    public Point add(Point P){
        double newX=this.x+P.x;
        double newY=this.y+P.y;
        return new Point(newX,newY);
    }
    public Point subtract(Point P){
        double newX=this.x-P.x;
        double newY=this.y-P.y;
        return new Point (newX,newY);
    }

    //  public String toString(){
    //     String hugeString=" ("+this.x +","+this.y +")";
    //     return hugeString;
    // }
     @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    
}
