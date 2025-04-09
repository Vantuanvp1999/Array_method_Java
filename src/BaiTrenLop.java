import java.lang.reflect.Array;
import java.util.ArrayList;

public class BaiTrenLop {
    public static void main(String[] args) {
        int arr[]={23,12,5,6,7,3,12,12};
       int[] arr2= changeFirstElement(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr[%d]=%d \n",i,arr2[i]);
        }
    }
    public static int[] changeFirstElement(int arr[]) {
        arr[0] = 100;
        return arr;
    }
}
