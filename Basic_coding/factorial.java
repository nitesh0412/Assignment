import java.util.Scanner;
public class factorial {

    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 1;
        for(int i=1;i<=num;i++)
        {
            sum = sum * i;
        }
        System.out.println("Factorial: "+ sum);
    }
}

/*
Output
Enter a number : 
5
Factorial: 120
 */