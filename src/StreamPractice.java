import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        /*
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
 */

        // create some streams!
        int printNum = 10;
        int randomNumberLimit = 1000;
        Random generator = new Random();
        Stream<Integer> randomIntStream = Stream.generate(
                () -> generator.nextInt(randomNumberLimit)
        );
        randomIntStream.limit(printNum).forEach(System.out::println);

        // infinite stream of odd positive numbers:
        Stream.iterate(1, num -> num + 2).limit(printNum).forEach(System.out::println);






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


