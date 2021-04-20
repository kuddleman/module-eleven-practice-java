import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numberList = fillNumberList(10000, 1000);
    }

    private static List<Integer> fillNumberList(int size, int max) {
        Random generator = new Random();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            numbers.add(generator.nextInt(max));
        }
        return numbers;
    }
}
