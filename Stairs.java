public class Stairs{
    public static final int STEPS = 12;
    public static void main(String[] args){
        for(int i = 1; i<=STEPS; i++){
            for (int spaces = (STEPS - i)*5; spaces>=1; spaces--){
                System.out.print(" ");
            }
            System.out.print("  O  ******");
            for (int rspaces = 1; rspaces<=(i-1)*5; rspaces++){
                System.out.print(" ");
            }
            System.out.println("*");
            for (int spaces = (STEPS-i)*5; spaces>=1; spaces--){
                System.out.print(" ");
            }
            System.out.print(" /|\\ *");
            for (int rspaces = 1; rspaces<=(i)*5; rspaces++){
                System.out.print(" ");
            }
            System.out.println("*");
            for (int spaces = (STEPS-i)*5; spaces>=1; spaces--){
                System.out.print(" ");
            }
            System.out.print(" / \\ *");
            for (int rspaces = 1; rspaces<=(i)*5; rspaces++){
                System.out.print(" ");
            }
            System.out.println("*");
            }
        for (int star = 1; star<=(STEPS+1)*5+2; star++){
            System.out.print("*");
        }
    }
}
   
