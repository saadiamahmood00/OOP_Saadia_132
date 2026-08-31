public class Students implements Cloneable{
    int rollNo;
    Address add1;
    @Override
    protected Object clone()throws CloneNotSupportedException{
        Students cloneStudent=(Students)super.clone();
        cloneStudent.add1=(Address)add1.clone();
        return cloneStudent;
    }

    
    
    
}
