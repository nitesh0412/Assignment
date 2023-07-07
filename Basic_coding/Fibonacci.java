import java.util.Scanner;
public class Fibonacci {
 
    public static void main(String[] args)
    {   System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a + " " + b);
        for(int i=2;i< num;i++)
        {
            c = a+b;
            a = b;
            b = c ;
            System.out.println(c);                
        } 
    }
}
/*
Output 
Enter a number : 8
0
1
1
2
3
5
8
13
 */