import java.util.*;

public class Hangman{            
    
    public static void main(String args[]){
        
        //class declarations
        Scanner scan = new Scanner(System.in);
        HangmanDriver drive = new HangmanDriver();
        DrawMan man = new DrawMan();
        
        //variable declarations
        String guess = "";               
        
        //splash screen
        System.out.print("\f");
        System.out.println("   __                                   __");
        System.out.println("  |  |               __                |  |");
        System.out.println("  |  |__|  /\\  |\\ | / _`  |\\/|  /\\  |\\ |  |");
        System.out.println("  |  |  | /~~\\ | \\| \\__>  |  | /~~\\ | \\|  | "); 
        System.out.println("__|____                               ____|__");
        System.out.println("\nGame by Mark Mossberg\n5/22/12");
        System.out.print("\nINSTRUCTIONS:\nThe objective of this game is to guess a random word chosen by the computer.\nYou may guess individual letters, or the entire word, if you choose.\nYou have a maximum of 10 incorrect guesses, after which, the hangman dies. \nThe blood will be on your hands. \n\nDo not fail.");
        System.out.print("\n\nPress 'Enter' to continue...");
        scan.nextLine();
        
        //chooses hangman
        System.out.println("\f");
        man.chooseMan();
        
        //sets up the game
        System.out.print("\f");
        man.draw11(); // draws gallows
        drive.getRandWord(); //chooses what the word will be
        drive.getStringUnderscore(); // takes random word and makes underscore version
        drive.getAnswerList(drive.getWord()); // get answer to hangman
        
        System.out.println("\nYou have to guess the word: ");
        drive.printArrayList(drive.getUnderscore());
        //drive.printArrayList(drive.getAnswer()); // ***SOLELY FOR TESTING PURPOSES, DELETE AFTER GAME WORKS***
                
        //the actual game
        while (!drive.gameOver && drive.numWrongGuess < 10){                        
            System.out.print("\nYour guess: ");
            guess = scan.nextLine();            
            drive.makeGuess(guess);                                                                                      
        }
        
        if (!drive.didWin){            
            drive.ifLost();            
        }else{            
            drive.ifWon();            
        }
       
    
        
        
    }
    
}