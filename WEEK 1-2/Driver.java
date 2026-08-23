public class Driver {

    public static void main(String[] args) {

        CalculatorC calculator1 = new CalculatorC(10, 5);

        System.out.println("Addition: " + calculator1.add());
        System.out.println("Subtraction: " + calculator1.subtract());
        System.out.println("Multiplication: " + calculator1.multiply());
        System.out.println("Division: " + calculator1.divide());

        calculator1.setNum2(0);
        System.out.println("Division by zero:");
        System.out.println(calculator1.divide());

        calculator1.setNum1(10);
        calculator1.setNum2(3);

        System.out.println("Modulus normal case:");
        System.out.println("10 % 3 = " + calculator1.modulus());

        calculator1.setNum2(0);

        System.out.println("Modulus by zero:");
        System.out.println(calculator1.modulus());

        calculator1.setNum1(2);
        calculator1.setNum2(3);

        System.out.println("Power normal case:");
        System.out.println("2^3 = " + calculator1.power());


        // Power edge case
        calculator1.setNum1(0);
        calculator1.setNum2(0);

        System.out.println("Power edge case:");
        System.out.println("0^0 = " + calculator1.power());
    }
}