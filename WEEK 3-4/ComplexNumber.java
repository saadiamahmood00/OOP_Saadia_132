public class ComplexNumber {
     private double real;    
    private double imaginary; 

    public ComplexNumber(){
        this.real=0.0;
        this.imaginary=0.0;
    }

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber(ComplexNumber C){
        this.real = C.real;
        this.imaginary = C.imaginary;
    }

    public double getReal(){ 
        return real; 
    }

    public double getImaginary(){
         return imaginary; 
    }
    // (a+bi) + (c+di) = (a+c) + (b+d)i
    public ComplexNumber add(ComplexNumber C){
        return new ComplexNumber(this.real + C.real, this.imaginary + C.imaginary);
    }

    // (a+bi) - (c+di) = (a-c) + (b-d)i
    public ComplexNumber subtract(ComplexNumber C) {
        return new ComplexNumber(this.real - C.real, this.imaginary - C.imaginary);
    }

    @Override
    public String toString(){
         return real + " + " + imaginary + "i";
    }
}

