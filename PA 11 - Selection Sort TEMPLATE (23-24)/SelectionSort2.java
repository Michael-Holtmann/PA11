import java.util.*;

/* Sort an array of Strings alphabetically  */

public class SelectionSort2
{
    public static void main(String[] args)
    {
        String[] x = {"CAT", "BAT", "SNAKE", "ZEBRA","MOOSE", "ARMADILLO" };
                
        System.out.print("BEFORE: ");
        printArray( x );
        
        //sort the list
        selectionSort(x);
        
        //display the list
        System.out.print("AFTER:  ");
        printArray( x );
    }
    
    public static void printArray( String[] x )
    {
        for(int i = 0; i < x.length; i++)
            System.out.printf( "%s ", x[i] );
        System.out.println();
    }
    
    public static void selectionSort( String[] x )
    {        
    	String largest = "";
    	int largestIndex = 0;
    	String control = "";
    	for (int i = x.length-1; i > 0; i--) {
    		control = x[i];
    		for (int j = 0; j < i; j++) {
    			if (x[j].compareTo(control) >= 1) {
    				largest  = x[j];
    				largestIndex = j;
    			}
    		}
    		x[i] = largest;
    		x[largestIndex] = control;    		
    	}
    }
    
}