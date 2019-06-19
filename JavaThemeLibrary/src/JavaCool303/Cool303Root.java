package JavaCool303;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cool303Root extends JPanel{
	ArrayList<Cool303Box> boxes = new ArrayList<>();
	
	/**
	 * Class constructor
	 */
	public Cool303Root(){
		super();
	}
	
	/**
	 * Method that adds box to a root
	 * @param box box
	 */
	public void addBox(Cool303Box box){
		box.setPreferredSize(new Dimension(400, 400));		
		this.add(box);
		this.boxes.add(box);
	}
	
	/**
	 * getter
	 * @return ArrayList
	 */
	public ArrayList<Cool303Box> getBoxes() {
		return boxes;
	}

	/**
	 * setter
	 * @param boxes boxes
	 */
	public void setBoxes(ArrayList<Cool303Box> boxes) {
		this.boxes = boxes;
	}
	
	
	/**
	 * Method that adds box with a label
	 * @param box box
	 * @param label String label
	 */
	public void addContainer(Cool303Box box, String label){
		//Cool303Box box = new Cool303Box();
		box.setPreferredSize(new Dimension(300, 300));	
		JLabel name = new JLabel(label, JLabel.LEFT);
		box.add(name);
		this.boxes.add(box);
	}
	
}
