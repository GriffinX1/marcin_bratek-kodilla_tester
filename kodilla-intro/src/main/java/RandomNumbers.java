import java.util.Random;

public class RandomNumbers {
    private int sum;
    private int[] numbers;
    private int counter;
    private int randomNumber;
    private int sumOfNumbers;

    public RandomNumbers() {
        this.sum = 0;
        this.numbers = new int[counter];
        this.counter = 0;
        this.randomNumber = 0;
        this.sumOfNumbers = 0;

    }

    public int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(31);
        return number;
    }

    public int countNumbers() {
        if (this.sum <= 5000) {
            int random = randomNumber();
            this.sum += random;
            this.numbers[this.counter] = random;
            counter++;
        }
        return counter;


    }


}
