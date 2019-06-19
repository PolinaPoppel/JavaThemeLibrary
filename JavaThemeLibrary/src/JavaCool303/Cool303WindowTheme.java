package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Cool303WindowTheme extends Cool303Window implements Theme {

private ArrayList<Cool303RootTheme> roots = new ArrayList<>();
	
	/**
	 * Constructor for the Window in summer theme
	 */
	public Cool303WindowTheme(){
		super();
	}

	
	/**
	 * Method to add a root in a summer theme to the Window
	 * sets the colour of the theme
	 * @param root root
	 */
	public void addRoot(Cool303RootTheme root){
		//set your size and colour:
		root.setPreferredSize(new Dimension(700, 700));	
		Color  green2   =   new Color(0x69, 0xd8, 0x4f);
		root.setBackground(green2);
		this.add(root);
		roots.add(root);
	}
	
	/**
	 * getter
	 * @return ArrayList
	 */
	public ArrayList<Cool303RootTheme> getRootsPastel() {
		return roots;
	}
	
	/**
	 * setter
	 * @param roots roots
	 */
	public void setRootsTheme(ArrayList<Cool303RootTheme> roots) {
		this.roots = roots;
	}


}

