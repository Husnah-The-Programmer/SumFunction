public class SumFunction{

    static int sumCalculator(int a, int b){
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args){
        int var1 = 60;
        int var2 = 80;

        System.out.println(sumCalculator(var1, var2));
        System.out.println(sumCalculator(12, 15));
    }
}