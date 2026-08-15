public class Driver{
    public static void main(String[] args) {
       
        ComplexNumber c1 = new ComplexNumber(3, 2); 
        ComplexNumber c2 = new ComplexNumber(1, -4); 

        System.out.println("COMPLEX NUMBER");
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);
        System.out.println("C1 + C2: " + c1.add(c2));
        System.out.println("C1 * C2: " + c1.subtract(c2));
        
        RationalNumber r1 = new RationalNumber(2, 3);
        RationalNumber r2 = new RationalNumber(4, 6); 

    
        System.out.println("RATIONAL NUMBER");
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);
        System.out.println("R1 + R2: " + r1.add(r2));      
        System.out.println("R1 * R2: " + r1.subtract(r2)); 

        Vector v1 = new Vector(3, 4);
        Vector v2 = new Vector(1, 2);

        System.out.println("Dot producct of Vector V1= "+v1+" and V2= " +v2);
        System.out.println(v1.dotProduct(v2));  
        System.out.println("Cross producct of Vector V1= "+v1+" and V2 "+v2); 
        System.out.println(v1.crossProduct(v2)); 
    }
}

