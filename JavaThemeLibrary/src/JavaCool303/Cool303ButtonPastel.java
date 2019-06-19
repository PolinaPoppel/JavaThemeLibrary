package JavaCool303;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.Dimension;

public class Cool303ButtonPastel extends Cool303Button implements Theme {
	
	/**
	 * Class constructor
	 */
	public Cool303ButtonPastel(){
		super();
	}
	
	/**
	 * Method that sets a background colour to a button
	 	 */
	public void setColourThing(){
		Color pink2 =  new Color(0xff, 0xd1, 0xdf);
		this.setBackground(pink2);
	}
	
	/**
	 * Method that sets a foreground colour to a button
	 */
	public void setColourThingy(){
		Color pink2 = new Color(0xff, 0xd1, 0xdf);
		this.setForeground(pink2);
	}

	
	/**
	 * Method that applies a colour and a shape to the button
	 * @input Graphics g
	 */
	@Override
	protected void paintComponent(Graphics g) {
	     
	     g.setColor(getBackground());
	     g.fillOval(0, 0, getSize().width-1, getSize().height-1);
	     super.paintComponent(g);
	}  
	
	/**
	 * Method that applies a colour and a shape to the border of the button
	 * takes Graphics g
	 */
	
	@Override
	public void paintBorder(Graphics g) {
	     g.setColor(getForeground());
	     g.drawOval(0, 0, getSize().width-1, getSize().height-1);
	}	  
}



