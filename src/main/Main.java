package main;

import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {

		try{

			//Set x ms as delay for every robot's action
	        Robot robot = new Robot();
	        robot.setAutoDelay(100);

	        // Simulate a mouse click
//	        robot.mousePress(InputEvent.BUTTON1_MASK);
//	        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	        
	        //Generate a random number
	        Random r = new Random();
	        int x = 0;
	        
	        //Make a simple window for close the program
	        //1. Create the frame.
	        JFrame frame = new JFrame("Bot");
	        //2. Optional: What happens when the frame closes?
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //3. Create components and put them in the frame.
	        frame.getContentPane().add(new JPanel(), BorderLayout.CENTER);
	        //4. Size the frame.
	        frame.pack();
	        //5. Show it.
	        frame.setVisible(true);
	        
	        while(frame.isVisible()){
	        	
	        	//Generate a random number between 0 and 6 -- GB mode without select
	        	x = r.nextInt(7);
	        	
	        	//Make a input on keyboard
	        	switch (x) {
	        		//A button
					case 0:
						robot.keyPress(KeyEvent.VK_A);
				        robot.keyRelease(KeyEvent.VK_A);
						break;
					//B button
					case 1:
						robot.keyPress(KeyEvent.VK_B);
				        robot.keyRelease(KeyEvent.VK_B);
				        break;
				    //Up button
					case 2:
						robot.keyPress(KeyEvent.VK_U);
				        robot.keyRelease(KeyEvent.VK_U);
				        break;
				    //Down button
					case 3:
						robot.keyPress(KeyEvent.VK_D);
				        robot.keyRelease(KeyEvent.VK_D);
				        break;
				    //Left button
					case 4:
						robot.keyPress(KeyEvent.VK_L);
				        robot.keyRelease(KeyEvent.VK_L);
				        break;
				    //Right button
					case 5:
						robot.keyPress(KeyEvent.VK_R);
				        robot.keyRelease(KeyEvent.VK_R);
				        break;
				    //Start button -- more difficult to come out -- 1/35 to be a output
					case 6:
						x = r.nextInt(5);
						if (x == 0){
							robot.keyPress(KeyEvent.VK_S);
					        robot.keyRelease(KeyEvent.VK_S);
						}
				        break;
				    //Select button -- disabled
					case 7:
						robot.keyPress(KeyEvent.VK_X);
				        robot.keyRelease(KeyEvent.VK_X);
				        break;
				    //L button - only gba
					case 8:
						robot.keyPress(KeyEvent.VK_L);
				        robot.keyRelease(KeyEvent.VK_L);
				        break;
				    //R button - only gba
					case 9:
						robot.keyPress(KeyEvent.VK_R);
				        robot.keyRelease(KeyEvent.VK_R);
				        break;
					default:
						break;
				}
	        	
	        	//Only for console debug -- remember: 0 can be A or Start
	        	System.out.println(x);

	        }      
	        
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
