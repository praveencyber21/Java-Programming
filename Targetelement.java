import java.util.*;


public class Targetelement{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        //Get array length
        System.out.println("Enter array length: ");
        int length = sc.nextInt();

        //Declare array
        int arr[] = new int[length];

        //Get array values
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        
        //Get target element
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        //Find index
        int index = -1;
        for(int i = 0; i < arr.length; i++){
           
            if (arr[i] == target){
                index = i;
                System.out.println("Index: "+ index);

        }
    }
    //if the target is not finded so index is not change
    if ( index == -1){
        System.out.println("-1");
    }
    
    sc.close();
    }
}

