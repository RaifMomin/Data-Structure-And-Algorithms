class binarysearch {
 public int binary(int arr[], int target) {
        int left = 0;
        int right = arr.length -1 ;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        binarysearch obj = new binarysearch();
        System.out.println(obj.binary(arr,8));

    }
}

