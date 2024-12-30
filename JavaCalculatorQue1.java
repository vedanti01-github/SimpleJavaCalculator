import java.util.*;
public class JavaCalculatorQue1 {
    public static void main(String[] args){
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Available Operations : + , - , * , /");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the First number : ");
            double n1 = sc.nextDouble();

            System.out.println("Enter an Operator (+, -, *, /) : ");
            char operator = sc.next().charAt(0);
            
            System.out.println("Enter the second number : ");
            double n2 = sc.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch(operator){
                case '+' :
                    result = n1 + n2;
                    break;
                case '-' :
                    result = n1 - n2;
                    break;
                case '*' :
                    result = n1 * n2;
                    break;
                case '/' :
                    if(n2 == 0){
                        System.out.println("Error: Divison by zero is not allowed.");
                        validOperation = false;
                    } else{
                        result = n1/n2;
                    }
                    break;
                default : 
                System.out.println("Error: Invalid Operation");
                validOperation = false;
            }
            if(validOperation){
                System.out.println("Result : " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid number.");
        }
        System.out.println("Thankyou for using Simple Calculator!");
    }
}
