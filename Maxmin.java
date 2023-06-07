import java.util.Scanner;

public class Maxmin {
    
    
    static int maxValue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;

    }

    static int minValue(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;

    }







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

        int max = maxValue(arr);
        int min = minValue(arr);
        
        System.out.println("Max_Value: "+ max);
        System.out.println("Min_Value: " + min);
        
        sc.close();
    }
}
