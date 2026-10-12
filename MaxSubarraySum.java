public class MaxSubarraySum {
    public static void maxSubarraySum(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum +=arr[k];
            }
            System.out.println(currentSum);
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            }
        }
        System.out.println("Maximum Subarray Sum is: "+maxSum);
    }
    public static void main(String[]args){
        int arr[]={2,-3,2,-1,4,2};
        maxSubarraySum(arr);

    }
    
}
