
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
    final static int MAXARRAY = 8; //final version should have 100 indexes to hold 100 integers
    final static int SENTINEL = 0; // this value will be used by users to exit input loops.
    public static int arrayID = 1;
    
    public static void main(String[] args){
        
        //create empty integer arrays with length driven by constant
        int x100[] = new int[MAXARRAY];
        int y100[] = new int[MAXARRAY];
       
        fillArray(x100); // prompt user for input into array x100
        displayElements(x100);
        
        fillArray(y100); // prompt user for input into array y100
        displayElements(y100);
        
        displayCommon(x100,y100);
            
    }//end of main method
    
    public static void displayElements(int[] x){
        
        System.out.print("Values for array " + arrayID + " is: ");
        arrayID++;
        
        for(int i = 0; i < x.length; i++)
        {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }//end of displayElements method
    
    public static int[] fillArray(int[] arrayIn)
    {
        Scanner in = new Scanner(System.in);
        
        int repeatVal = 0;
        int uniqueVal = 0;
        int keyIn = -1;
        
        for(int i = 0; i < arrayIn.length; i++)
        {
            boolean found = false;
            System.out.print("Enter data for array " + arrayID
                        + "(0 to finish): ");
            keyIn = in.nextInt();
            //check for 0 to exit loop
            if(keyIn > SENTINEL)
            {  
                //check for repeat values by iterating through the array
                for(int j = 0; j < arrayIn.length; j++)
                {
//                     if(arrayIn[j] == keyIn)
//                     {
//                         found = true;
//                         repeatVal++; 
//                         break;
//                     }
//                     if(!found)
//                     {
                        arrayIn[i] = keyIn;
//                     }
                }
            }
            else
            {
                break;
            }
        }
        return arrayIn; // return the unique numbers array
        
    }//end of fillArray method
    
    public static void displayCommon(int[] x, int[] y)
    {
        //int[] z = new int[x.length + y.length];
        boolean found = false;
        int[] commonVal = new int[y.length];
        for(int i = 0; i < y.length; i++)
        {
            for(int j = 0; j < x.length; j++)
            {
                if(x[i] == y[j])
                {
                    found = true;
                    commonVal[i] = x[i];
                }
            }
        }

        System.out.print("Common data is: ");
        for(int i = 0; i < commonVal.length; i++)
        {
            if(commonVal[i] != 0)
            {
                System.out.print(commonVal[i]);
            }
        }
    }
    
 
}//end of CourseWorkOneV3 class

