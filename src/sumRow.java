import java.util.Scanner;

public class sumRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum =0;
        int row;
        do {
            System.out.println("Enter the row number");
             row = sc.nextInt();
             if(row>m||row<0) {
                 System.out.println("Wrong row number");
             }
        }while(row>m||row<0);
        for (int i = 0; i < n; i++) {
            sum+=arr[i][row];
        }
        System.out.printf("The sum of %d numbers is %d",row,sum);
    }
}
