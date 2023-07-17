import java.util.Scanner;
public class IfElse {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Treasure Island. Your mission is to find the treasure");
        System.out.println("Left Or Right");

        Scanner sc = new Scanner(System.in);

        String val = sc.next();
        if(val.equals("Right"))
        {
            System.out.println("all into a hole. Game Over.");
        }

        else if(val.equals("left"))
        {
            System.out.println("swim Or wait");

            val=sc.next();

            if(val.equals("swim"))
            {
                 System.out.println("Attacked Game over");
            } 
            else if(val.equals("wait"))
            {
            System.out.println("Enter color :");
            val=sc.next();
            
            switch (val) {
                case "blue":
                    System.out.println("eaten game over");
                    break;

                case "red":
                    System.out.println("bunred game over");
                    break;
                
                case "yellow":
                    System.out.println("Winner game ");
                    break;
            
                default:
                    System.out.println("Game Over");
                    break;
            }
            
        }
            System.exit(0);
        }
        
    } 
    }
    
