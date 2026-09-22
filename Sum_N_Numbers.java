import java.util.*;
public class Sum_N_Numbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //assigning value to n
        int sum=0;//initial value of sum
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first N number:"+ sum);
    }
}