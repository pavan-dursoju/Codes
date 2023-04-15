import java.util.Scanner;
public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of an array:");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the elements of an array:");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.print("The sum of the array is:");
            arraySum(arr);
    }
    public static void arraySum(int[] arr)
    {
        int sum=0;
        
        
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
