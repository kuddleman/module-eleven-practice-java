import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numberList = fillNumberList(10000, 1000);


    // count the number of times a target appears - iteration versus streams

        int target = 43;
        long count = 0;

        for(int number : numberList){
            if(number == target) {
                count++;
            }
        }
        System.out.println(target + " appears in the list " + count + " times.");

        // stream approach

        //convert list to stream:
        count = numberList.stream().filter((number) -> number == target).count();
        System.out.println(target + " appears in the list " + count + " times.");

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
