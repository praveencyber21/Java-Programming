import java.util.*;

public class Array_rotation{

    static int rotation, len;
    static int[] arr; 
   
    static int[] rotate(int[] arr) {


        
        if ( rotation > 0){
        rotation %= len;
        if (rotation > 0){
            int n = arr.length-1;
            for (int i=0; i<rotation; i++) {
                int temp = arr[n];
                for (int j=n; j > 0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
               
            }
           
        }
        return arr;
    }


        
        else if ( rotation < 0){
            rotation = rotation % len + len;
            
            if (rotation > 0){
                int n = arr.length-1;
                for (int i=0; i<rotation; i++) {
                    int temp = arr[0];
                    for (int j=0; j < n; j++){
                        arr[j] = arr[j+1];
                    }
                    arr[n] = temp;
                   
                }
            }
        }
                  return arr;
    }


  public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Get the array length
        System.out.println("Enter the array length: ");
        len = sc.nextInt();
        
        //Declare array
        int [] arr = new int[len];

        //Get the array values
        System.out.println("Enter the array numbers");
        for (int i=0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        //Get the rotation count
        System.out.println("Enter the no.of rotations: ");
        rotation = sc.nextInt();


        
        System.out.println("Before rotation: "+ Arrays.toString(arr));
        
        arr = rotate(arr);
        System.out.println("After rotation: "+ Arrays.toString(arr));        
            
        sc.close();

        }
    }







