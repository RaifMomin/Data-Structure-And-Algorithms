public class SelectionSort {

    public void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }



    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        SelectionSort sort = new SelectionSort();
        sort.Selection(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print( arr[i]+" ");
        }
    }
}
