import java.io.*;
import java.util.*; 
public class Main
{
static void maj(int arr[], int n)  
{  
    int c = 0;  
    int index = -1;
    for(int i = 0; i < n; i++)  
    {  
        int count = 0;  
        for(int j = 0; j < n; j++)  
        {  
            if(arr[i] == arr[j])  
            count++;  
        } 
        if(count > c)  
        {  
            c = count;  
            index = i;  
        }  
    } 
    if (c > n/2)  
    System.out.println (arr[index] + " is the max votes");  
    else
    System.out.println ("No Max votes in this sequence");  
}

    public static void main (String[] args) { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Length of array:");
        int len=sc.nextInt();
        System.out.println("Enter elements in array");        
        int[] arr= new int[len]; 
        for(int i=0; i<len; i++)
            arr[i]=sc.nextInt();
        System.out.println();
        maj(arr, len);  
    } 
}
