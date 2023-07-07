import java.util.Scanner;

public class RideBill {

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in); 
        System.out.println("Start");
        System.out.println("Enter Your height :");
        int height = sc.nextInt();
        int bill = 0;

        if(height < 120){
            System.out.println("Can't Ride");
            System.exit(0);
        }
        else 
        {
            System.out.println("Can Ride");
            System.out.println("Enter your age : ");            
            int age = sc.nextInt();

            if(age<12){
                bill =  5;
            } else if(age>=12 && age<=18) {
                bill = 7;
            } 
            else if((age>=18 && age<=45)){
                bill = 12;
            }
            else if(age>=45 && age<=55){
                bill = 0;
            }
            System.out.println("Want Photos?");
            String ans = sc.next();
            if(ans.equals("No"))
            {
                System.out.println("The Total Bill amount is "+ bill);
            }
            else if(ans.equals("yes"))
            {
                System.out.println("The Total Bill amount is "+ (bill+3));
            }
        }

    }
}
