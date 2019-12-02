import java.util.*;
public class FracCalc{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Fraction Calculator!");
        System.out.println("Type an input to begin.");
        String input = console.nextLine();

        do{
            System.out.println(processCommand(input));
            System.out.println("Enter a new input:");
            input = console.nextLine();


        }while(!input.equalsIgnoreCase("quit"));

        System.out.println("Goodbye!");
    }

    public static String processCommand(String input){
        String output = input;
        if(input.equalsIgnoreCase("help")){
            output = "Welcome to the help section.\n Type test number to test the calculator.";

        } else if(input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")){
            output = processExpression(input);
        }
        return output;
    }

    public static String processExpression(String input){
        String frac1 = input.substring(0, input.indexOf(" "));
        String op = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2);
        String frac2 = input.substring(input.indexOf(" ") + 3, input.length());
        String W = "0";
        String Num;
        String Den;
        if(frac2.contains("/")){
            Num = frac2.substring(0, frac2.indexOf("/"));
            Den = frac2.substring(frac2.indexOf("/") + 1, frac2.length());
            if(Num.contains("-") && Den.contains("-")){
                Num = frac2.substring(1, frac2.indexOf("/"));
                Den = frac2.substring(frac2.indexOf("/") + 2, frac2.length()); 
            }
            if(frac2.contains("_")){
                W = frac2.substring(0, frac2.indexOf("_"));
                Num = frac2.substring(frac2.indexOf("_") + 1, frac2.indexOf("/"));
                Den = frac2.substring(frac2.indexOf("/") + 1, frac2.length());
                if(Num.contains("-") && Den.contains("-")){
                    Num = frac2.substring(frac2.indexOf("_") + 2, frac2.indexOf("/"));
                    Den = frac2.substring(frac2.indexOf("/") + 2, frac2.length());
                }
            }

        }else{
            W =  frac2;
            Num = "0";
            Den = "1";
        }
        String express = "Op: " + op + " Whole: " + W + " Num: " + Num + " Den: " + Den;
        return express;
    }
}