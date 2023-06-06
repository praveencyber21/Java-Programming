import java.util.Scanner;

public class Array{

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int num = sc.nextInt();

        //Array declaration
        int arr[] = new int[num];
        //Get the values from user
        System.out.println("Enter the values: ");
        for (int i=0; i<arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        
        //Delete the given index 
        System.out.println("Enter the index value for deletion (Starts from 0): ");
        int index = sc.nextInt();
      

        for (int i=index; i < arr.length; i++) {

            if ( arr[i] == arr.length) {
                break;
            }
            else {
            arr[i] = arr[i+1];
           
            }
        }

        //Create another array
        int arr2[] = new int[arr.length-1];
        

        for (int i=0; i<arr2.length; i++) {

            if (arr2[i] == arr2.length){
                break;
            }
            else {
                arr2[i] = arr[i];
            }
            
        }
        
        //Print the array
        System.out.println("After Deletion");

        for (int i=0; i<arr2.length; i++){

            System.out.println(arr2[i]);
        }
    }
}