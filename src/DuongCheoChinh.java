import java.util.Scanner;

public class DuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the element "+(i+1)+","+(j+1));
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

                    sum += arr[i][i];

        }
        System.out.printf("The results is %d",sum);
    }
}
