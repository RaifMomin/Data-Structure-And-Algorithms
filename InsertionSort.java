public class InsertionSort {
    public void Insertion(int[] arr) {
        for(int i = 1 ; i < arr.length ; i++) {
            int curr = arr[i];
            int j = i-1;
            while (j>=0 && curr < arr[j] ) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }


    }
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int arr[] = {7,9,3,1,2};
        sort.Insertion(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print( arr[i]+" ");
        }

    }
}
