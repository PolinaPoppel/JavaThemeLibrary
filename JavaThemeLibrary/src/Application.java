import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
* Creates an application that uses my Cool303Package. 
* Selects the number of roots, boxes and buttons; promts a user to select a theme
* @author  Poppel Polina 260606583
* @since   2018-04-16 
*/

import JavaCool303.*;
 

public class Application {
	
	public static void main(String[] args){
		boolean setlabel = false;
		int heightWindow = 1000;
		int widthWindow = 1000;
		String input3 = "";
		String input;
		System.out.println("Select the theme: pastel or summer");
		Scanner sc=new Scanner(System.in); 
		input=sc.next();
		if(input.equals(null)){
			System.out.println("oops, have to select a theme");
		}
		System.out.println("Would you like to add label to your box? (yes/no)");
		String input2=sc.next();
		if(input2.equals("yes")){
			System.out.println("Please enter a string that would be your label");
			input3 = sc.next();
			setlabel = true;
		}
		
		//if we want to apply a pastel theme:
		if(input.equals("pastel")){
			Cool303WindowPastel myWindow = new Cool303WindowPastel();
			myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myWindow.setSize(heightWindow, widthWindow);
			myWindow.setLayout(new FlowLayout());
			myWindow.getContentPane().setBackground(Color.BLACK);
			//one root:
			for(int i = 0; i<1; i++){
				Cool303RootPastel root1 = new Cool303RootPastel();
				myWindow.addRoot(root1);
					//4 boxes
					for(int j=0; j<4; j++){
						Cool303BoxPastel box1 = new Cool303BoxPastel();
						if(setlabel == false){
							root1.addBox(box1);
						}
						else{
							root1.addBox(box1, input3);
						}
						//5 buttons per box
						for(int k=1; k<6; k++){
							Cool303ButtonPastel button1 = new Cool303ButtonPastel();
							button1.setOpaque(false);
							button1.setContentAreaFilled(false);
							button1.setBorderPainted(false);

							box1.addButton(k, button1);
						}
					}			
			}
			myWindow.setVisible(true);
		}
		
		else if(input.equals("summer")){
			
			Cool303WindowSummer myWindow = new Cool303WindowSummer();
			myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myWindow.setSize(heightWindow, widthWindow);
			myWindow.setLayout(new FlowLayout());
			myWindow.getContentPane().setBackground(Color.BLACK);
			for(int i = 0; i<1; i++){

				Cool303RootSummer root1 = new Cool303RootSummer();
				myWindow.addRoot(root1);
					for(int j=0; j<4; j++){
						Cool303BoxSummer box1 = new Cool303BoxSummer();
						if(setlabel == false){
							root1.addBox(box1);
						}
						else{
							root1.addBox(box1, input3);
						}
						for(int k=1; k<6; k++){
							Cool303ButtonSummer button1 = new Cool303ButtonSummer();
							button1.setOpaque(false);
							button1.setContentAreaFilled(false);
							button1.setBorderPainted(false);
							box1.addButton(k, button1);
						}
					}			
			}
			myWindow.setVisible(true);		
		}
		
		else if(input.equals("theme")){	
			Cool303WindowSummer myWindow = new Cool303WindowSummer();
			myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myWindow.setSize(heightWindow, widthWindow);
			myWindow.setLayout(new FlowLayout());
			myWindow.getContentPane().setBackground(Color.BLACK);
			for(int i = 0; i<1; i++){
				//select your number of roots^
				Cool303RootSummer root1 = new Cool303RootSummer();
				myWindow.addRoot(root1);
					//select your number of boxes:
					for(int j=0; j<4; j++){
						Cool303BoxSummer box1 = new Cool303BoxSummer();
						if(setlabel == false){
							root1.addBox(box1);
						}
						else{
							root1.addBox(box1, input3);
						}
						//select a number of buttons per button
						for(int k=1; k<6; k++){
							Cool303ButtonSummer button1 = new Cool303ButtonSummer();
							button1.setOpaque(false);
							button1.setContentAreaFilled(false);
							button1.setBorderPainted(false);
							box1.addButton(k, button1);
						}
					}			
			}
			myWindow.setVisible(true);
		}

		
		else{
			Cool303Window myWindow = new Cool303Window();
			myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myWindow.setSize(heightWindow, widthWindow);
			myWindow.setLayout(new FlowLayout());
			myWindow.getContentPane().setBackground(Color.BLACK);

			for(int i = 0; i<1; i++){
		

			Cool303Root root1 = new Cool303Root();
			//root1 = myWindow.getRoots().get(i);
			root1.setPreferredSize(new Dimension(700, 700));	
			myWindow.addRoot(root1);
				//for(int j=0; j<root1.getBoxes().size(); j++)
				for(int j=0; j<4; j++){
					Cool303Box box1 = new Cool303Box();
					root1.addBox(box1);
					for(int k=0; k<5; k++){
						Cool303Button button1 = new Cool303Button();
						box1.addButton(k, button1);
					}
				}
			}
		myWindow.setVisible(true);
		}
	}
}
