package excercise;

import java.util.ArrayList;

public class ArrayLIstExercise {
    public static void main(String[] args) {
        ArrayList ages = new ArrayList();
        ages.add(18);
        ages.add(20);
        ages.add(30);
        ages.add(40);
        ages.add(50);
        for (int i=0; i<ages.size(); i++){
            System.out.println(ages.get(i));
        }

    }
}
