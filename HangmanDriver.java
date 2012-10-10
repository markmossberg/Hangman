import java.lang.Math;
import java.util.*;

public class HangmanDriver{
        
    DrawMan man = new DrawMan();    
    
    public int numWrongGuess = 0; 
    private String randWord;   
    public boolean gameOver;
    public boolean didWin;
    public boolean wasWrong = true;
    private ArrayList<String> list = new ArrayList<String>();
    private ArrayList<String> answerList = new ArrayList<String>();
    private ArrayList<String> usedList = new ArrayList<String>();
    
    private String[] library = {"anger", "answer", "beauty", "blood", "captain", "legend", 
        "inch", "bracket", "geometry", "enterprise", 
        "priority", "initiative", "configuration", "word", "lightning", 
        "ingredient", "expert", "torque", "notification", "horse", 
        "elephant", "diamond" , "flower", "plant", "bottle", "watch", "lily", "guitar", 
        "bass", "drums", "cymbal", "building", "skyscraper", "computer", "android", "singer", 
        "concert", "boulevard", "avenue", "towel", "broom", "kitchen", 
        "foyer", "tissue", "notebook", "carpet", "shirt", "pants", "socks", "sunglasses", 
        "speaker", "hourglass", "songwriter", "guitarist", "drummer", "engineer", "scientist",  "employee", "commerical", "statistic", "fact", "media", "film", "sheep", "molecule", "onion", "sandwich"};

    public HangmanDriver(){}                                   
    
    
    public void getRandWord(){ // picks random word out of library
        int i = (int) (Math.random() * library.length);  
        randWord = library[i];        
    }
    
    public String getWord(){ return randWord; } // accessor to get the random word
       
    public void getStringUnderscore(){ // makes an arraylist with underscores for characters
        
        for (int i = 0; i < randWord.length(); i ++){
            list.add("_");
            list.add(" ");
        }
        
    }
            
    public ArrayList<String> getUnderscore(){ return list; } // returns the list
    
    public void getAnswerList(String str){ // makes an arraylist with underscores for characters
        
        for (int i = 0; i < str.length(); i ++){
            answerList.add(str.substring(i, i+1));
            answerList.add(" ");
        }
        
    }
    
    public ArrayList<String> getAnswer(){ return answerList; } // returns the answer in list form       
    
    public ArrayList<String> getUsed(){ return usedList; };
    
    public void printArrayList(ArrayList<String> list){ // prints any given list
        String s = "";
        
        for (int i = 0; i < list.size(); i++){
            s = s + list.get(i);
        }
        
        System.out.println(s);
        
    }
    
    public void makeGuess(String g){                        
        wasWrong = true; // resets mechanism to test if guess was right or wrong                        
        
        //for regular guesses, goes through the answer list and sees if the guess matches
        for (int i = 0; i < answerList.size(); i++){
            
            if (g.equals(answerList.get(i))){
                
                list.set(i, answerList.get(i));
                wasWrong = false;
                                
            }
        }
                
        //if they guessed the word correctly
        if (list.equals(answerList) || g.equals(randWord)){            
            gameOver = true;
            didWin = true;
            return;
        }
        
        //adds wrong guesses to list of wrong guesses
        if (wasWrong){
            usedList.add(g);
            usedList.add(" ");            
            numWrongGuess++;                         
        }
        
        System.out.print("\fWrong guesses: ");        
        printArrayList(usedList);
        
        switch (numWrongGuess){
            case 0: man.draw0();
                break;
            case 1: man.draw1();
                break;
            case 2: man.draw2();
                break;
            case 3: man.draw3();
                break; 
            case 4: man.draw4();
                break;
            case 5: man.draw5();
                break;
            case 6: man.draw6();
                break;
            case 7: man.draw7();
                break;
            case 8: man.draw8();
                break;
            case 9: man.draw9();
                break;
            case 10: man.draw10();
                break;    
        }                
        
        System.out.println("\n");
        printArrayList(list);
        
        
    }
    
    public void ifWon(){
        System.out.print("\fWrong guesses: ");        
        printArrayList(getUsed());
        man.drawWin();
        System.out.println("\n");
        printArrayList(getAnswer());
        System.out.println("\nThe hangman will live to see another day. Good work.");
    }

    public void ifLost(){
        System.out.print("\fWrong guesses: ");        
        printArrayList(getUsed());
        man.draw10();
        System.out.println("\n");
        printArrayList(getAnswer());
        System.out.println("\nYou killed the hangman.");//\nThe word was: " + getWord());
    }
    
}