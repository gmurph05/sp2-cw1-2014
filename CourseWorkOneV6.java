
/**
 * Problem description
 * 
 * author: Gary Murphy
 * version: 6.0
 * 1.   Create two empty integer arrays that will hold up to 100 integers. 
 * 2.   Then, repeatedly read integer values from the keyboard until    
 *      the user types "0" (zero, without the quotes) 
 *      and store those values in the first array.
 * 3.1   Ignore repeated occurrences of a particular value in the data, 
 *      so check each value to see whether it already occurs in the array
 *      before storing it.
*/
import java.util.Arrays;
import java.util.Scanner;

public class CourseWorkOneV6
{
    //declare constants
    final static int MAXARRAY = 4; //final version should have 100 indexes to hold 100 integers
    final static int SENTINEL = 0; // this value will be used by users to exit input loops.
    
    
    public static void main(String[] args){
        
        //create empty integer arrays with length driven by constant
        int x100[] = new int[MAXARRAY];
        //int y100[] = new int[MAXARRAY];
        
        fillArray(x100); // prompt user for input into array x100
        displayElements(x100);
        
        //fillArray(y100); // prompt user for input into array y100
        //displayElements(y100);
            
    }//end of main method
    
    public static void displayElements(int[] x){
        System.out.println(Arrays.toString(x));
    }//end of displayElements method
    
    public static int[] fillArray(int[] arrayIn)
    {
        Scanner in = new Scanner(System.in);
        int repeatVal = 0;
        int keyIn = -1;
        System.out.println("Enter data for array "
                        + "(0 to finish): ");
        keyIn = in.nextInt();
        arrayIn[0] = keyIn;

        for(int i = 1; i < arrayIn.length; i++)
        {
            //check for 0 to exit loop
            if(keyIn != SENTINEL && keyIn != arrayIn[i])
            {
                System.out.println("Enter data for array "
                        + "(0 to finish): ");
                keyIn = in.nextInt();
                for(int j = 1; j < arrayIn.length; j++)
                {
                        arrayIn[i] = keyIn;
                }
            }
            else
            {
                break;
            }
        }

        int[] result = new int[arrayIn.length];
        for(int i = 0; i < result.length; i++)
        {
            result[i] = arrayIn[i];
        }
        return result; // return the unique array
        
    }//end of fillArray method
    
    
}//end of CourseWorkOneV3 class

