package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Cool303RootSummer extends Cool303Root implements Theme {

	
ArrayList<Cool303BoxSummer> boxes = new ArrayList<>();
	
	/**
	 * Class constructor
	 */
	public Cool303RootSummer(){
		super();
	}
	
	/**
	 * Method that adds a box to the root
	 * sets the summer theme	
	 * @param box box
	 */
	public void addBox(Cool303BoxSummer box){
		box.setPreferredSize(new Dimension(200, 200));
		Color newColor = new Color(0xfd, 0xb1, 0x47);
		box.setBackground(newColor);
		this.add(box);
		this.boxes.add(box);
	}

	/**
	 * getter
	 * @return ArrayList
	 */
	public ArrayList<Cool303BoxSummer> getBoxesPastel() {
		return boxes;
	}

	/**
	 * setter
	 * @param boxes boxes
	 */
	public void setBoxesPastel(ArrayList<Cool303BoxSummer> boxes) {
		this.boxes = boxes;
	}
	
	
	
	/**
	 * Method that adds a box to the root if the label was selected
	 * sets a summer theme
	 * @param box box 
	 * @param label String label
	 */
	public void addBox(Cool303BoxSummer box, String label){
		box.setPreferredSize(new Dimension(200, 200));
		Color newColor = new Color(0xc1, 0xc6, 0xfc);
		box.setBackground(newColor);
		JLabel name = new JLabel(label, JLabel.LEFT);
		box.add(name);
		this.add(box);
		this.boxes.add(box);
	}	
}
