package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Cool303WindowSummer extends Cool303Window implements Theme {
	private ArrayList<Cool303RootSummer> roots = new ArrayList<>();
	
	/**
	 * Constructor for the Window in summer theme
	 */
	public Cool303WindowSummer(){
		super();
	}

	
	/**
	 * Method to add a root in a summer theme to the Window
	 * sets the colour of the theme
	 * @param root root
	 */
	public void addRoot(Cool303RootSummer root){
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
	public ArrayList<Cool303RootSummer> getRootsPastel() {
		return roots;
	}
	
	/**
	 * setter
	 * @param roots roots
	 */
	public void setRootsSummer(ArrayList<Cool303RootSummer> roots) {
		this.roots = roots;
	}


}
