import java.util.Arrays;
import java.util.Scanner;

public class Arraydel {
    
     static public int[] removeTheElement( int arr1[], int index){
        int i, k;

        //Array is empty
        //Index value is less than 0
        //Index value greater than array length
        if ( arr1 == null || index < 0 || index >= arr1.length) {
            
            return arr1;
        }

        //Another array

        int arr2[] = new int[arr1.length -1];

        for ( i=0, k=0; i<arr1.length; i++) {

            if (i == index) {
                continue;
            }

            arr2[k] = arr1[i];
            k += 1;
        }

        return arr2;
        
    }




    public static void main(String args[]) {

        
        Scanner sc = new Scanner(System.in);

        //Array length
        System.out.println("Enter the array length: ");
        int num = sc.nextInt();
        //Create an array
        int arr1[] = new int[num];
        System.out.println("Enter the arrays: ");

        for (int i=0; i<arr1.length; i++) {

            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the index value (Start from 0): ");
        int index = sc.nextInt();


        
        arr1 = removeTheElement(arr1, index);

        System.out.println("After deletion\n"+ Arrays.toString(arr1));
    }
}
