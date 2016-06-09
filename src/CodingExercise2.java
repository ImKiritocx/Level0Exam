
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("how old are you ?");
		int yearnow = 2016;
		int newage = Integer.parseInt(age);
		int year = yearnow -= newage;
		JOptionPane.showMessageDialog(null, "You are born on " + year);
		if (newage > 30) {
			JOptionPane.showMessageDialog(null, "You are to old to play this game");

		}
	}
}
