public class QuickSort {
    public static int partition(int[] arr, int st, int end) {
        int pvt = arr[end];
        int idx = st-1;
        for( int i = st ; i < end ; i++ ) {
            if (arr[i] < pvt) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;
        return idx;
    }
    public static void quickSort(int[] arr, int st, int end) {
        if(st<=end){
            int pvtidx = partition(arr, st, end);
            quickSort(arr, st, pvtidx-1);
            quickSort(arr, pvtidx+1, end);
        }

    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        quickSort(arr, 0, arr.length-1);
        for(int i : arr) {
            System.out.println(i + " ");
        }

    }

}
