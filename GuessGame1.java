import java.util.Random;
import java.util.Scanner;
/**
 * Java Basic. Homework Nr.4
 * 
 * @author Oxana
 * todo 14.09.2022
 * date 03.10.2022
 */
class GuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int guess = -1;

        do {
            number = random.nextInt(10);
            for (int i = 0; i < 3; i++) {  
                System.out.print("Guess the number [0..9]: ");
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Your number is less");
                } else if (guess > number){
                    System.out.println("Your number is more");
                }else{
                    System.out.println("Congratulations! You won!!!");
                    break;
                }
            }
            if (number != guess) {
                System.out.println("You lose(((((");
            }
            System.out.print("Repeat game? Yes -1, No - 0:");
        }while (scanner.nextInt() == 1);
    }
}