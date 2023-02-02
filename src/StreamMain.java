import java.util.Arrays;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> Number= Arrays.asList(1,2,3,4,5);
        Number.forEach(x-> System.out.println("Through ForLoop: "+x));
        for (Integer integer : Number) {
            System.out.println(integer);
        }
    }
}