package javaexample86catchblockthrowsanexception;

public class JavaExample86CatchBlockThrowsAnException {

    public static void main(String[] args) {

        int[] vector = {1, 2, 3, 4, 5, 6};

        System.out.print("Your original vector: ");
        PrintHelper.PrintArray(vector);

        System.out.println();
        System.out.println("Feeding with " + vector.length + " elements....");
        System.out.println();

        //while (true) {
            try {
                InputHelper.Feed(vector);
                //break;
            } catch (NumberFormatException ex) {
                System.out.println("Feed with valid integer!!!!");
            }
        //}// end-while
        System.out.print("Your array is: ");
        PrintHelper.PrintArray(vector);

    }
}
