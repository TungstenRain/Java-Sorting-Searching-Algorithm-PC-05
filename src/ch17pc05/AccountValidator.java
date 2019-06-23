package ch17pc05;

/**
 * 
 * @author frank
 */
public class AccountValidator {

    public static boolean validated(int[] validNumbers, int value) {
        
        if (binarySearch(validNumbers, value) != -1){
           return true; 
        } else {
            return false;
        }
    }
    
    static int binarySearch(int[] array, int value) { 
        int first = 0;
        int last = array.length - 1;
        int position = -1;
        int middle;
        boolean found = false;
        
        while (!found && (first <= last)) { 
            middle = first + (last - first) / 2; 
  
            // Check if x is present at mid 
            if (array[middle] == 0) {
                found = true;
                position = middle;
            } else if (array[middle] > value) { // If x greater, ignore left half 
                last = middle -1;
            } else {
                first = middle +1;
            }
        } 
  
        return position;
    }
}
