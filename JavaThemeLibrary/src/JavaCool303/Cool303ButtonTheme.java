package JavaCool303;

import java.awt.Color;
import java.awt.Graphics;

public class Cool303ButtonTheme extends Cool303Button implements Theme {

	/**
	 * Class constructor
	 */
	public Cool303ButtonTheme(){
		super();		
	}
	
	/**
	 * Method that assigns a colour to the button
	 */
	public void setColourThing(){
		//here you will add your colour
		//example: Color pink2 =  new Color(0x7b, 0xf2, 0xda);
		//this.setBackground(pink2);
	}
	
	/**
	 * Method that sets a foreground colour to the button
	 */
	public void setColourThingy(){
		//here you will add your coloud
		//Color pink2 =  new Color(0x7b, 0xf2, 0xda);
		//this.setForeground(pink2);
	}

	
	/**
	 * Overriding a method that sets a shape and a colour of the button
	 * @input Graphics
	 */
	@Override
	protected void paintComponent(Graphics g) {
		//here you'll select a shape, exaple
		/*g.setColor(getBackground());
	     g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	     super.paintComponent(g);*/
	}
	
	/**
	 * Overriding a method that sets a shape and a colour of the button's border
	 * @input Graphics
	 */
	@Override
	protected void paintBorder(Graphics g) {
		//here you'll paint a border
	     /* example: g.setColor(getForeground());
	     g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);*/
	}
}


