package Sorting;

public class Insertion {
    public static void ins(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        ins(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
