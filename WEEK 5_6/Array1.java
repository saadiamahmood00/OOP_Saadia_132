public class Array1 implements Cloneable {
    private int[] anarray;
    private int value;

    public Array1(){
        this.anarray = new int[] {1,2,3,4,5,6};
        this.value = 0;
    }
    public void increment(){
        for (int i=0; i<anarray.length; i++){
        this.anarray[i]++;
        }
        this.value++;
    }
    public String toString(){
        String s = "Value: " +this.value + " Anarray: [";
        for (int i=0; i<anarray.length;i++){
            s = s+anarray[i]+",";
        }
        return s + "]";
    }
    @Override //deep copy
    public Object clone()throws CloneNotSupportedException{
        Array1 clonedArray = (Array1)super.clone();
        clonedArray.anarray = this.anarray.clone();
        return clonedArray;
    }
    
}
