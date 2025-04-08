public class MinValue {
    public static void main(String[] args) {
        int[] arr={4,21,3,12,4,21,9,7,45};
        int index = findMin(arr);
        System.out.println("The smallest element in the array is "+arr[index]);
    }
    public static int findMin(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }return index;
    }
}
