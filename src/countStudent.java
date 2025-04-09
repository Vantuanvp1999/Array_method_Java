import java.util.Scanner;

public class countStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the size of the array");
            size = sc.nextInt();
            if(size > 30){
                System.out.println("The size should not exceed 30");
            }
        }while(size > 30);
        arr = new int[size];
        int i=0;
        while(i < arr.length){
            System.out.printf("Enter the mark for student %d: \n", i+1);
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of marks:");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
            if(arr[j]>=5&&arr[j]<=10){
                count++;
            }
        }
        System.out.println("\nThe number of students pass the exam is "+count);
    }
}
