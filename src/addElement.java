import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,4,2,6,8,5,8,9,23,21};
        System.out.println("Enter the element to be added");
        int element = sc.nextInt();
        System.out.println("Enter the index of the element to be added");
        int index = sc.nextInt();
        if (index > arr.length&&index<0){
            System.out.println("The index is not in the array");
            System.out.println("Enter the index of the element to be added");
            index = sc.nextInt();
        }
       int[] newArr=new int[arr.length+1];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[index]=element;
        for (int i =index; i < arr.length; i++) {
            newArr[i+1]=arr[i];

        }
        for (int i =0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
