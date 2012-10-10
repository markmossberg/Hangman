import java.util.Scanner;

public class DrawMan{
    Scanner scan = new Scanner(System.in);    

    private String[] men = {"(¬_¬) ~ Bored", "(-_-) ~ Sleepy", "(*_*) ~ Shocked", "(O_O) ~ Wide Eyed", "(T_T) ~ Crying"};
    private String[] heads = {"(¬_¬) |", "(-_-) |", "(*_*) |", "(O_O) |", "(T_T) |"};
    private String top, top2, head, head1, head2, head3, head4, head5, deadhead, body, leg, bottom, base, base2;
    private String noose, pole;
    private String body1, body2, leg2;
    private static int headChoice;
    
    public DrawMan(){
    
        top =      "   ___";
        top2 =     "  |   |";
        //head =     "(¬_¬) |";        
        deadhead = "(×_×) |";
        body =     " -|-  |";
        leg =      " / \\  |";
        bottom =   "      |";
        base =  "__________";
        base2 = "______|___";
        
        noose =   "  |";
        pole =    "      |";
        
        body2 =   " -|   |";
        body1 =   "  |   |";
        
        leg2 =    " /    |";
                
    }
          
    
    public void draw0(){
        for (int i = 0; i < 8; i++){
            System.out.print("\n");
        }
    }
     
    public void draw1(){        
        for(int i = 0; i < 7; i++){
            System.out.print("\n");
        }
        System.out.println(base);
    }
    
    public void draw2(){
        System.out.println("\n");
        for(int i = 0; i < 5; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw3(){        
        System.out.println(top);
        for(int i = 0; i < 6; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw4(){
        System.out.println(top + "\n" + top2);
        for(int i = 0; i < 5; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw5(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice]);
        for(int i = 0; i < 4; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw6(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice] + "\n" + body1);
        for(int i = 0; i < 3; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw7(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice] + "\n" + body2);
        for(int i = 0; i < 3; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw8(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice] + "\n" + body);
        for(int i = 0; i < 3; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw9(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice] + "\n" + body + "\n" + leg2);
        for(int i = 0; i < 2; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
     public void draw10(){
        System.out.println(top + "\n" + top2 + "\n" + deadhead + "\n" + body + "\n" + leg);
        for(int i = 0; i < 2; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void draw11(){
        System.out.println(top + "\n" + top2 + "\n" + heads[headChoice] + "\n" + body + "\n" + leg);
        for(int i = 0; i < 2; i++){
            System.out.println(pole);
        }
        System.out.println(base2);
    }
    
    public void drawWin(){
        System.out.println("\n(^_^)" + "\n -|-" + "\n / \\" );
    }
    
    public void chooseMan(){  
        int choice = 0;
        System.out.println("The Hangmen:\n-----------");
        for (int i = 0; i < men.length; i++){
            System.out.println(i + ": " + men[i]);
            
        }
        
        System.out.print("\nEnter the number of the hangman you want to be responsible for: ");
        choice = scan.nextInt();
        if (choice < 0 || choice > 4){
            while (choice < 0 || choice > 4){
                System.out.print("You must enter a number between 0 and 4.\nEnter again: ");
                choice = scan.nextInt();
            }
        }
        headChoice = choice;
        
    }
    
}