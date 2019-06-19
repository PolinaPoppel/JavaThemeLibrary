package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Cool303RootPastel extends Cool303Root implements Theme {
	
	private ArrayList<Cool303BoxPastel> boxes = new ArrayList<>();
	
	/**
	 * Constructor for Cool303RootPastel
	 */
	public Cool303RootPastel(){
		super();
	}
	
	/**
	 * Method that adds a pastel box to the root	
	 * sets the colour to beautiful pastel
	 * @param box Cool303Box
	 */
	public void addBox(Cool303BoxPastel box){
		box.setPreferredSize(new Dimension(200, 200));
		Color newColor = new Color(0xc1, 0xc6, 0xfc);
		box.setBackground(newColor);
		this.add(box);
		this.boxes.add(box);
	}

	/**
	 * getter
	 * @return ArrayList
	 */
	public ArrayList<Cool303BoxPastel> getBoxesPastel() {
		return boxes;
	}

	/**
	 * setter
	 * @param boxes boxes
	 */
	public void setBoxesPastel(ArrayList<Cool303BoxPastel> boxes) {
		this.boxes = boxes;
	}
	
	
	
	/**
	 * Method that adds box to a root if the optional String is passed as a title
	 * @param box Cool303Box
	 * @param label String label
	 */
	public void addBox(Cool303BoxPastel box, String label){
		box.setPreferredSize(new Dimension(200, 200));
		Color newColor = new Color(0xc1, 0xc6, 0xfc);
		box.setBackground(newColor);
		JLabel name = new JLabel(label, JLabel.LEFT);
		box.add(name);
		this.add(box);
		this.boxes.add(box);
	}

}

	
	


