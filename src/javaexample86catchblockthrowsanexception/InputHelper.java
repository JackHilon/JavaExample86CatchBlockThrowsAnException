
package javaexample86catchblockthrowsanexception;

import java.util.Scanner;


public class InputHelper {
    
    
    public static void Feed(int[] array)
    {
        Scanner in = new Scanner(System.in);
        
        int[] temp= CopyArray(array);
        
        String str=" ";
        
        try{
            for (int i = 0; i < array.length; i++) {
            str=in.nextLine();
            array[i]=Integer.parseInt(str);
        }// end-for
        }// end-try
        catch(NumberFormatException e)
        {
            System.out.println("Catch-block....");
            //array = temp; // return to previous state
            TakeValue(array, temp);
            throw e;
        }
    }
    
    private static int[] CopyArray(int[] array)
    {
        int[] res = new int[array.length];
        
        for (int i = 0; i < res.length; i++) {
            res[i]=array[i];
        }
        return res;
    }
    
    private static void TakeValue(int[] taker, int[] giver)
    {
        if(taker.length != giver.length)
            return;
        for (int i = 0; i < giver.length; i++) {
            taker[i]=giver[i];
        }
    }
}
