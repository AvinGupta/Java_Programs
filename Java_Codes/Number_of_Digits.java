package Mathematics;
import java.util.Scanner;
public class Number_of_Digits {
    public static int iterative_sol(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static int recursive_sol(int num){
        if(num==0) return 0;
        return 1+recursive_sol(num/10);
    }
    public static int log_sol(int num){
        return (int)Math.log10(num)+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=iterative_sol(num);//using loops
        System.out.println(ans);
        int ans1=recursive_sol(num);//using recursion
        System.out.println(ans1);
        int ans2=log_sol(num);//using math function log10
        System.out.println(ans2);
        sc.close();
    }
}
