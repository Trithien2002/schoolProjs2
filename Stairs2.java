/*public class Stairs2{
    public static final int STEPS = 5;
    public static void main(String[] args){ 
        for(int i = 1; i<=STEPS; i++){
            spaces();
            System.out.print("  O  ******");
            rspaces();
            System.out.println("*");            
            spaces();
            System.out.print(" /|\\ *");
            rspaces();
            System.out.println("*");            
            spaces();
            System.out.print(" / \\ *");            
            rspaces(); 
            System.out.println("*"); 
        }
        for (int star = 1; star<=(STEPS)*6+2; star++){
            System.out.print("*");
        }
    }
    public static void spaces() {
        for (int spaces = (STEPS - i)*5; spaces>=1; spaces--){
             System.out.print(" ");
        }        
    }
    public static void rspaces() {    
        for (int rspaces = 1; rspaces<=(i)*5; rspaces++){
             System.out.print(" ");
        } 
    }
}*/