public class TriangleLine {
    private Line L1;
    private Line L2;
    private Line L3;

    public TriangleLine(){
        this.L1=new Point(0.0, 0.0);
        this.L2=new Point(0.0, 0.0);
        this.L3=new Point(0.0, 0.0);

    }
    public TriangleLine(Line L1,Line L2,Line L3){
        this.L1=L1;
        this.L2=L2;
        this.L3=L3;
    }
    public TriangleLine(TriangleLine TL){
        this.L1=new Line(TL.L1.getA(),TL.L1.getB());
        this.L2=new Line(TL.L2.getA(),TL.L2.getB());
        this.L3=new Line(TL.L3.getA(),TL.L3.getB());
    }
    public Line getL1(){
        return L1;
    }
    public Line getL2(){
        return L2;
    }
    public Line getL3(){
        return L3;
    }
    public void setL1L2L3(Line L1, Line L2, Line L3){
        this.L1=L1;
        this.L2=L2;
        this.L3=L3;
    }
    @Override
    public String toString(){
        return "Triangle with 3 lines"+"\nLine1 : "+L1+"\nLine 2 :"+L2+"\nLine 3: "+L3;
    }

    
}
