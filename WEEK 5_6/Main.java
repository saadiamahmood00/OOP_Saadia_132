import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Main {
    public static void main(String[]args){
        Patients p1=new Patients();
        Patients p2=new Patients();
        Patients p3=new Patients("Prime", "minister",123);
        System.out.println("____________________________________");
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        Patients s1=new Patients("Sara","khan",101);
        Patients s2=new Patients("Sara","khan",101);

        System.out.println("-----------------------------------------");
        System.out.println("s1==s2       : "+(s1==s2));
        System.out.println("s1.equals(s2) : "+ s1.equals(s2));
        System.out.println("sara 1 hash code : "+s1.hashCode());
        System.out.println("sara 2 hash code : "+s2.hashCode());

        System.out.println("--------JFC: HASH-SET ------------");
        Set<Patients> patients=new HashSet<>();
        patients.add(s1);
        patients.add(s2);
        System.out.println("HashSet size : "+patients.size());
        Patients searchPatient=new Patients("Sara","khan",101);
        System.out.println(
            "Patient found: "+patients.contains(searchPatient)
        );
        System.out.println("xxxxxxxx-HASHCODE-xxxxxxxx");
    }
}
