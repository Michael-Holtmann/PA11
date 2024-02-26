import java.util.*; 

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] x = {1, 3, -2, 10, 5, 4, 7, 9 };
        
        System.out.print("BEFORE: ");
        printArray( x );
        
        //sort the list
        selectionSort(x);
        
        System.out.print("AFTER:  ");
        printArray( x );
        
    }
    
    public static void printArray( int[] x )
    {
        //display the list
        for(int i = 0; i < x.length; i++)
            System.out.printf( "%3d ", x[i]);
        System.out.println();
    }
    
    public static void selectionSort( int[] x)
    {  
    	int largest = 0;
    	int largestIndex = 0;
    	int control = 0;
    	for (int i = x.length-1; i > 0; i--) {
    		control = x[i];
    		for (int j = 0; j < i; j++) {
    			if (x[j] > control) {
    				largest  = x[j];
    				largestIndex = j;
    			}
    		}
    		x[i] = largest;
    		x[largestIndex] = control;    	

        System.out.println("Pass " + (x.length - i) + ":");
        printArray(x);
        System.out.println("\n");
    	}
    }
    
}