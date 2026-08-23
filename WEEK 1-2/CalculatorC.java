public class CalculatorC {

    private double num1;
    private double num2;

    public CalculatorC() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public CalculatorC(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("ERROR: Cannot divide by zero.");
            return 0;
        }
        return (num1 / num2);
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double modulus() {
        if (num2 == 0) {
            System.out.println("ERROR: Cannot find modulus with zero.");
            return 0;
        }
        return (num1 % num2);
    }

    public double power() {
        return Math.pow(num1, num2);
    }
}
