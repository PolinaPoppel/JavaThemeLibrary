package JavaCool303;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cool303Box extends JPanel{
	
	ArrayList<Cool303Button> buttons =  new ArrayList<>();
	
	/**
	 * Class constructor
	 */
	public Cool303Box(){
		super();
	}
	
	/**
	 * getter 
	 * @return ArrayList
	 */
	public ArrayList<Cool303Button> getButtons() {
		return buttons;
	}
	
	/**
	 * setter
	 * @param buttons buttons
	 */
	public void setButtons(ArrayList<Cool303Button> buttons) {
		this.buttons = buttons;
	}
	
	/**
	 * Method that adds button to a box, sets a numerical label
	 * @param i integer
	 * @param button buttons
	 */
	public void addButton(int i, Cool303Button button){
		//Cool303Button button = new Cool303Button();
		String number = Integer.toString(i);
		JLabel label = new JLabel(number);
		button.add(label);
		button.setPreferredSize(new Dimension(45, 45));
		this.add(button);
		this.buttons.add(button);
		
	}
}