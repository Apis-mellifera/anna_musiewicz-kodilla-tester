import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    private int maxNumber;
    private int minNumber;
    private List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generate();
        int max = randomNumbers.getMaxNumber();
        int min = randomNumbers.getMinNumber();
        System.out.println("The min random number is " + min + ", the max random number is " + max);
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void generate() {
        Random random = new Random();

        int firstNumber = random.nextInt(31);
        System.out.println("The first random number is " + firstNumber);

        numbers.add(firstNumber);
        maxNumber = firstNumber;
        minNumber = firstNumber;

        int sum = firstNumber;

        while (sum <= 5000) {
           int number = random.nextInt(31);
            System.out.println("The next random number is " + number);
            numbers.add(number);

            if (number > maxNumber) {
                System.out.println("The previous max number is " + maxNumber + ", the new max number is " + number );

                maxNumber = number;
            }

            if (number < minNumber) {
                System.out.println("The previous min number is " + minNumber + ", the new min number is " + number );

                minNumber = number;
            }

            sum = sum + number;
            System.out.println(" The sum is: " + sum);
        }
    }
}






