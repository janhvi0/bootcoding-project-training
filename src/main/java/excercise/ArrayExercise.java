package excercise;

public class ArrayExercise {
    public static void main(String[] args) {
        //array declare + initialization
        int[] numbers = {10, 20, 30, 40, 50};
        int[] ages = new int[5];
        // add element to array(initialization)
//        ages[0] = 10;
//        ages[1] = 20;
//        ages[2] = 30;
//        ages[3] = 40;
//        ages[4] = 50;

        for(int i=0; i<ages.length; i++){
            ages[i] = (i+1)*10;
        }
        // how to traverse array element \
        for (int i=0; i<ages.length; i++){
            System.out.println(i +"=" +ages[i]);
        }
        String[] months = {"jan","feb","march","april","may","jume","july","aug","sep","oct","nov","dec"};
         for(int i=0; i<months.length;i++){
             System.out.println();
         }

    }
}
