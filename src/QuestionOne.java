import java.util.ArrayList;
import java.util.List;


// How to remove duplicate elements from ArrayList in java


public class QuestionOne {

    public static void main(String[] args) {



        List<Integer> data = new ArrayList<>();
        data.add(4);
        data.add(4);
        data.add(1);
        data.add(1);
        data.add(1);

        for (int i = 0; i < data.size(); i++) {

            if (data.lastIndexOf(data.get(i)) > i) {
                Integer val = data.remove(data.lastIndexOf(data.get(i)));

            }
            if (data.indexOf(data.get(i)) < i) {

                Integer val1 = data.remove(data.indexOf(data.get(i)));

            }

        }

        System.out.println(data);


    }
}