package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String question1 = JOptionPane.showInputDialog("What is 8+12");
				// 3.  Use an if statement to check if their answer is correct
				if(question1.equals("20")) {
					score += 1;
					JOptionPane.showMessageDialog(null, " :) Correct!!");
				} 
				else {
					JOptionPane.showMessageDialog(null,":( Sorry, The correct answer is 20" );
					score -=1;
				}
				JOptionPane.showMessageDialog(null, "Your score is:" + score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		String Q2= JOptionPane.showInputDialog("Who is going to be our next president");
		if(Q2.equals("Joe Biden")) {
			score +=1;
			JOptionPane.showMessageDialog(null, " :) Correct!!");
		}
		else {
			JOptionPane.showMessageDialog(null,":( Sorry, The correct answer is Joe Biden" );
			score -= 1 ;
		}
		JOptionPane.showMessageDialog(null, "Your score is:" + score);
		
		String Q3= JOptionPane.showInputDialog("Why Can You NOT Breath in Space");
		
		if(Q3.equals("There is no air")) {
			score +=99999999;
			JOptionPane.showMessageDialog(null, " :) Correct!!");
		}
		else {
			JOptionPane.showMessageDialog(null,":( Sorry, The correct answer is There is no air" );
			score -=999999999;
		}
		JOptionPane.showMessageDialog(null, "Your score is:" + score);
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your Final Score is:" + score);
	}
}
