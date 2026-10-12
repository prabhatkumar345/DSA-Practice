public class PrefixSubArraySum {
    public static void maxSubarraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int j=0;j<arr.length;j++){
            int start=j;
            for(int k=j;k<arr.length;k++){
                int end=k;
                currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
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
