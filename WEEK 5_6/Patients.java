import java.util.Objects;
public class Patients {
    //Q5
    private String firstName;
    private Strig lastName;
    private int healthCardNumber;
     
    //constructor chaining
    //constructor inside constructor
    //calling parametized constructor 
    public Patient(){
        this("unknown","unknown",-1);
    }
    public Patient(String firstName,String lastName,int healthCardNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.healthCardNumber=healthCardNumber;
    }
    @Override
    public int hashcode(){
        return Objects.hash(this.firstName,this.lastName,this.healthCardNumber);
    }
    
}
