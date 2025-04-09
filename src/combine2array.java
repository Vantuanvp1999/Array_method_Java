import java.util.Scanner;

public class combine2array {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr2=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i =0; i < arr.length; i++) {
            System.out.println("Enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        for (int i =0; i < arr2.length; i++) {
            System.out.println("Enter element "+(i+1));
            arr2[i]=sc.nextInt();
        }
        int[] newArr=new int[arr.length+arr2.length];
        for (int i =0; i < arr.length; i++) {
            newArr[i]=arr[i];

        }
            for (int i = 5; i < 10; i++) {
         newArr[i]=arr2[i-5];
          }

        for (int i =0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
