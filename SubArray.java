public class SubArray {
    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("["+" ");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        subArray(arr);
    }

    
}
