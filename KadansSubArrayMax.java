public class KadansSubArrayMax {
    public static void kadansSubArrayMax(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);
        }
        System.out.println("Maximum Subarray Sum is: "+maxSum);
    }
    public static void main(String[]args){
        int arr[]={2,5,3,-10,-1,6,4};
        kadansSubArrayMax(arr);
    }
    
}
