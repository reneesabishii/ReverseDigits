import java.util.Scanner;

public class reverseDigits
{

     public static void main(String []args)
     {
         Scanner sc=new Scanner(System.in);
         int n;     //Declare array size
         System.out.println("Enter the size of the array");
         n=sc.nextInt();   //Initialize array size
         
         int arr[]=new int[n];   //Declare array 
         int revArray[]=new int[n]; //Declare reverse array

        System.out.println("Enter the array");  

        for(int i=0;i<n;i++)     //Initialize array
        {
            arr[i]=sc.nextInt();
        }
        int j=n-1;  //Initialize reverse array index
        for(int i=0;i<n;i++)
        {
            revArray[i]=arr[j];
            j--;
        }
        System.out.println("Original Array "); 
        for(int i=0; i<n; i++) 
        {
            System.out.print(arr[i] + " ");
        }  
        System.out.println();
        System.out.println("Reversed Array"); 
        for(int i=0; i<n; i++) 
        {
            System.out.print(revArray[i] + " ");
        } 
    }
}