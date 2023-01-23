import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();
        List<Integer> intList3 = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                intList2.add(intList.get(i));
            }
        }

        for (int i = 0; i < intList2.size(); i++) {
            if (intList2.get(i) % 2 == 0) {
                intList3.add(intList2.get(i));
            }
        }

        Collections.sort(intList3);
        System.out.println(intList3);

    }
}
