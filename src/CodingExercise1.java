import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot jerry = new Robot();
    	jerry.penDown();
   	 // 3. ask the user what color they would like the Robot to draw
    	String answer = JOptionPane.showInputDialog("what color would you like to use ? red or blue ?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	if (answer.equalsIgnoreCase("red")) {
			jerry.setPenColor(Color.RED);
		}
    	else if (answer.equalsIgnoreCase("Blue")) {
			jerry.setPenColor(Color.BLUE);
		}
   	 // 2. set the pen width to 10
    	 jerry.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	
   	 for (int i = 0; i < 4; i++) {
   		
   		jerry.move(30);
    	jerry.turn(90);
	}
    	
    }

}

