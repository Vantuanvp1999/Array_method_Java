import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size >20) {
                System.out.println("The array is too large.");
            }
        }while(size>20);
        array = new int[size];
        int i=0;
        while(i<array.length){
            System.out.println("Enter the element "+(i+1)+": " );
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list is: ");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index=0;
        for(int k=0;k<array.length;k++){
            if(array[k]>max){
                max = array[k];
                index = k+1;
            }
        }
        System.out.println("Maximum element is "+max+" at index "+index);
    }
}
