public class Calculator {
    //methods
    static double start;//=0


    public static double clear() {
        start = 0;
        return start;
    }

    public static double add(int input) {
        start = start + input;
        return start;
    }

    public static double subtract(int input) {
        start = start - input;
        return start;
    }

    public static double multiply(int input) {
        start = start * input;
        return start;
    }

    public static double divide(int input) {
        start = start / input;

        if (input <= 0){
            System.out.println("Error");        }

        return start;
        }

    public static double square(int input) {
        start = start + input;
        return input * input;
    }

    public static double square_root(int input) {
        start = start + input;
        return Math.sqrt(input);
    }

    public static double exponentiation(double input,double exponent) {

        return Math.pow(input, exponent);
    }

    public static double inverse() {
        start *= 1 / start;
        return start;
    }

    public static double invert() {
        start = start * -1;
        return start;
    }

    public static void main(String[] args) {
//use methods

        System.out.println(add(9));
        System.out.println(divide(3));
        System.out.println(add(7));
        System.out.println(clear());
        System.out.println(square(6));
        System.out.println(clear());
        System.out.println(square_root(36));
        System.out.println(clear());
        System.out.println(exponentiation(2,4));
        System.out.println(clear());
        System.out.println(add(3));
        System.out.println(inverse());
        System.out.println(inverse());
        System.out.println(clear());
        System.out.println(add(4));
        System.out.println(start);
        System.out.println(invert());
        System.out.println(invert());
        System.out.println(divide(0));


    }
}