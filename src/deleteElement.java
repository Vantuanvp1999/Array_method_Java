import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] arr = {3,45,5,21,2,4,7,9,6,5};
        int index_del = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index_del = i;
                break;
            }
        }
        for (int i =index_del; i < arr.length-1; i++) {
            arr[i] = arr[i+1];

        }
        for (int i =0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
