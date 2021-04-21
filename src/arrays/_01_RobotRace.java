package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
			robots[i].setSpeed(15);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].moveTo(500, 300);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random ran = new Random();
		boolean notFinished = true;
		boolean[] firstTurn = {false,false,false,false,false};
		boolean[] secondTurn = {false,false,false,false,false};
		boolean[] thirdTurn = {false,false,false,false,false};
		while(notFinished) {
		for (int i = 0; i < robots.length; i++) {
			robots[i].move(ran.nextInt(40));
			if(robots[i].getY() < 200 && firstTurn[i] == false) {
				firstTurn[i] = true;
				robots[i].turn(-90);
			}
			else if(robots[i].getX()< 200 && secondTurn[i] == false) {
				secondTurn[i] = true;
				robots[i].turn(-90);
				
			}
			else if(robots[i].getY() > 301 && thirdTurn[i] == false) {
				thirdTurn[i] = true;
				robots[i].turn(-90);
			}
			if(robots[i].getX() > 501) {
				notFinished = false;
				System.out.println(robots[i]);
			}
		}}
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
		
	}
}
