import java.util.*;

public class Abrar {
    public static int Average (int a , int b){
        int avg = (a+b)/2;
        System.out.println("The average of these number is ; "+ avg);
        return avg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();
        System.out.println(Average(a,b));
    }
}