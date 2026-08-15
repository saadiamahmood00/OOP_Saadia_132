public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(){
        this.numerator=0;
        this.denominator=1;
    }

    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        
    }

    public int getNumerator(){
         return numerator;
    }
    public int getDenominator(){ 
        return denominator; 
    }

    // a/b + c/d = (ad + bc) / bd
    public RationalNumber add(RationalNumber R){
        int num = this.numerator * R.denominator + R.numerator * this.denominator;
        int den = this.denominator * R.denominator;
        return new RationalNumber(num, den);
    }

    // a/b - c/d = (ad - bc) / bd
    public RationalNumber subtract(RationalNumber R){
        int num = this.numerator * R.denominator - R.numerator * this.denominator;
        int den = this.denominator * R.denominator;
        return new RationalNumber(num, den);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
    
