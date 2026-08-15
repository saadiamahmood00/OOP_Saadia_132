public class Vector{
    private double x;
    private double y;

    public Vector(){
        this.x=0.0;
        this.y=0.0;
    }
    public Vector(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Vector(Vector V)
    {
        this.x=V.x;
        this.y=V.y;
    }

    public double getX(){
        
        return x; 
    }
    public double getY(){
        
        return y; 
    }
    public Vector add(Vector other){
        double newx=this.x + other.x;
        double newy=this.y + other.y;
        return new Vector(newx,newy);
    }

    public Vector subtract(Vector other){
        double newx=this.x - other.x;
        double newy=this.y - other.y;
        return new Vector(newx,newy);
    }

    public double dotProduct(Vector other){
        double dp=this.x * other.x + this.y * other.y;
        return dp;
    }
    public double crossProduct(Vector other){
        double cx=this.x*other.y-this.y*other.x;
        return cx;
    }



    @Override
    public String toString() {
        return x + "i + " + y + "j";
    }
}
