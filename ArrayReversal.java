public class ArrayReversal {
    public static int[] arrayReversal(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        int result[]=arrayReversal(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
    }
    
}
}
