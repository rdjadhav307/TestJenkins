package com.mygames.games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	
	 private int guessCount, yourGuess, compGuess;
	    public GuessTheNumber()
	    {
	        guessCount = 0;
	        Random rn = new Random();
	        compGuess = rn.nextInt(101);
	    }
	    public void takeUserInput()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Guess The number (1 to 100) : ");
	        while (true) {
	            yourGuess = sc.nextInt();
	            if(yourGuess <= 100 && yourGuess >= 1)
	                break;
	            System.out.print("Invalid input.\nGuess the Number (between 1 to 100) : ");
	        }
	    }
	    public void setGuessCount()
	    {
	        guessCount = getGuessCount()+1;
	    }
	    public int getGuessCount()
	    {
	        return guessCount;
	    }
	    public boolean isCorrectNumber()
	    {
	        do{
	            if(yourGuess == compGuess)
	            {
	                setGuessCount();
	                return true;
	            }
	            else if(yourGuess < compGuess)
	            {
	                setGuessCount();
	                System.out.println("Your Number is Smaller");
	                takeUserInput();
	            }
	            else
	            {
	                setGuessCount();
	                System.out.println("Your Number is Greater");
	                takeUserInput();
	            }

	        }while(true);
	    }
	    
	    public void playGuessThenumber() {
	    	GuessTheNumber g = new GuessTheNumber();
	          g.takeUserInput();
	          if(g.isCorrectNumber())
	          {
	              System.out.println("Your Score is  "+g.getGuessCount());
	          }
	    }

}
