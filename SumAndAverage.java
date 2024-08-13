public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 10;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = (double) sum / count;

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
        System.out.println("The average of numbers from 1 to 10 is: " + average);
    }
}
