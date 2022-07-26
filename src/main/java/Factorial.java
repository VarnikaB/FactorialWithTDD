public class Factorial {


    private final int number;

    public Factorial(int i) {
        this.number = i;
    }

    public int calculate() {
        if(number < 0)
            return -1;
        if(number == 0 || number == 1)
            return 1;
        int factorial = 1;
        for(int num = 2; num <= number; num++)
            factorial *= num;
        return factorial;
    }
}
