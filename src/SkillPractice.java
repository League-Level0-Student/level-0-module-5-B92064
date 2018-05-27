
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int r = Integer.parseInt(dimes);
		// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "You have " + 10*r + " cents.");


		// Ask the user how tall they are (inches)

String tall = JOptionPane.showInputDialog("How tall are you in inches?");
int tall2 = Integer.parseInt(tall);


		// If they are shorter than 36 inches, tell them to eat their Wheaties

if(tall2 < 36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}


		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 



for(int i = 1; i < 30; i++) {
	if(i %3 ==0) {
		System.out.println(i);
	}
}



		}

		void skill3() { // Get a random number that is less than 20 and print it to the console 

Random r = new Random();
int t = r.nextInt(20);
System.out.println(t);
		// Get another random number that is less than 10 and print it to the console 
int q = r.nextInt(10);
System.out.println(q);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, "The difference is "+ (t-q));


		}

		void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog("What city do you live in?");


		// If they answered "San Diego", tell them they live in Americ's Finest City 

if(city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in Americ's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "You need to move to San Diego, Americ's Finest City");
}
		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

String cars = JOptionPane.showInputDialog("How many cars do you have");
int car =  Integer.parseInt(cars);
if(car == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation");
}
else if (car == 1) {
	JOptionPane.showMessageDialog(null, "Wow, were's the picture?");
}	
else if(car > 1) {
	JOptionPane.showMessageDialog(null, "There is "+ (4*car)+ " wheels in total.");
}
		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What is the name of your school?");
JOptionPane.showMessageDialog(null, school + " is a great school!?");

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		}

