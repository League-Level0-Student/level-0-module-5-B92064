import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class PracticeCodingExam {
public static void main(String[]args) {
	Robot cow = new Robot();
	cow.setX(10);
	cow.setY(500);
	cow.setSpeed(99999);
	for(int i=0; i < 5; i++) {
		cow.setPenWidth(10);
		cow.penDown();
	cow.move(100);
cow.turn(90);
	}
	String color = JOptionPane.showInputDialog("What color do you want to use?");
	String answer2 = JOptionPane.showInputDialog("How many shapes do you want");
	int answer2int = Integer.parseInt(answer2);
	if(color.equalsIgnoreCase("green")){
		cow.setPenColor(0, 255, 77);
		}
		else if(color.equalsIgnoreCase("blue")) {
		cow.setPenColor(47, 84, 188);
		}
		else if(color.equalsIgnoreCase("red")) {
			cow.setPenColor(148, 0, 0);
			}
		else if(color.equalsIgnoreCase("yellow")) {
			cow.setPenColor(240, 230, 140);
			}
		else if(color.equalsIgnoreCase("pink")) {
			cow.setPenColor(255, 47, 213);
			}
		else if(color.equalsIgnoreCase("black")) {
			cow.setPenColor(0, 0, 0);
			}
		else if(color.equalsIgnoreCase("purple")) {
			cow.setPenColor(123, 25, 188);
			}
		else if(color.equalsIgnoreCase("orange")) {
			cow.setPenColor(255, 94, 0);
			}
		else if(color.equalsIgnoreCase("")) {
			cow.setRandomPenColor();
			}
for(int o = 0; o < answer2int; o ++) {
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(90);
		cow.move(150);
		
	}
}}

