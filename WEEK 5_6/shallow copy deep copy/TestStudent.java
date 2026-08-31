public class TestStudent{
public static void main(String[] args) throws CloneNotSupportedException{

Students obj1=new Students();
obj1.rollNo=1;
Address add1=new Address();
add1.addressID=22;
obj1.add1=add1;

Students obj2=(Students)obj1.clone();
obj2.rollNo=56;
obj2.add1.addressID=39;

System.out.println(obj1.rollNo);
System.out.println(obj2.rollNo);
System.out.println(obj1.add1.addressID);
System.out.println(obj2.add1.addressID);

}}
