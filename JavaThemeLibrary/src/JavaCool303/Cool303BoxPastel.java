package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Cool303BoxPastel extends Cool303Box implements Theme {
ArrayList<Cool303Button> buttons =  new ArrayList<>();
	
	/**
	 * Class constructor
	 */
	public Cool303BoxPastel(){
		super();
	}  
	
	/**
	 * getter
	 * @return ArrayList
	 */
	@Override
	public ArrayList<Cool303Button> getButtons() {
		return buttons;
	}

	/**
	 * setter
	 */
	@Override
	public void setButtons(ArrayList<Cool303Button> buttons) {
		this.buttons = buttons;
	}
	


	
		//setLabel.
		//setPreferredSize(new Dimension (150, 150));
	
	/*public static void creatBox(String label, ArrayList<Cool303Button> buttons){
		//Box myBox = new Box(1);
		//setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		Box myBox = Box.createHorizontalBox();
		myBox.setPreferredSize(new Dimension (150, 150));
		for(int i=0; i<buttons.size(); i++){
			myBox.add(buttons.get(i));
		}
		
	}*/ 
	 
	public void addButton(int i, Cool303ButtonPastel button){
		//Cool303Button button = new Cool303Button();
		String number = Integer.toString(i);
		JLabel label = new JLabel(number);
		button.add(label);
		button.setPreferredSize(new Dimension(50, 50));
		button.setColourThing();
		button.setColourThingy();
		this.add(button);
		this.buttons.add(button);
		
	} 
	
	public void boxShape(){
		
	}

}
