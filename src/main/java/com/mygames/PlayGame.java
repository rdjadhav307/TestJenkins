package com.mygames;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mygames.games.GuessTheNumber;
import com.mygames.games.RockPapaerSiscorrs;

public class PlayGame {

	private static Logger logger  = LogManager.getLogger(PlayGame.class.getName()); 
	
	public static void main(String[] args) {
		logger.info("Choose gaame A. Rock Papaer Siscorr, B. Guess The Number");
		Scanner sc= new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c == 'A') {
			logger.info("Rock Papaer Siscorr started");
			RockPapaerSiscorrs r= new RockPapaerSiscorrs();
			r.playRockPapaerSiscorrs();
			logger.info("Rock Papaer Siscorr ended");
		}
		else if(c == 'B') {
			logger.info("Guess the Number started");
			GuessTheNumber g = new GuessTheNumber();
			g.playGuessThenumber();
			logger.info("Guess the Number ended");
		}
		else {
			logger.info("Wrong choice");
		}
		
	}

}
