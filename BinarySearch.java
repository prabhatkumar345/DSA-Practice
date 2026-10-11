public class BinarySearch {
    public static int binarysort(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid=(start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int key = 2;
        int result = binarysort(arr,key);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
    }
    
}

