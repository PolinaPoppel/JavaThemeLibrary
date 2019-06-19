package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Cool303WindowPastel extends Cool303Window implements Theme {
	
	ArrayList<Cool303RootPastel> roots = new ArrayList<>();
	
	/**
	 * Class constructor
	 */
	public Cool303WindowPastel(){
		super();
	}

	
	/**
	 * Method that adds root to a window
	 * applies a pastel theme
	 * @param root root
	 */
	public void addRoot(Cool303RootPastel root){
		Color  green2   =   new Color(0xcf, 0xfd, 0xbc);
		root.setBackground(green2);
		root.setPreferredSize(new Dimension(700, 700));
		this.add(root);
		roots.add(root);
	}
	
	/**
	 * getter
	 * @return ArrayList
	 */
	public ArrayList<Cool303RootPastel> getRootsPastel() {
		return roots;
	}
	
	/**
	 * setter
	 * @param roots roots
	 */
	public void setRootsPastel(ArrayList<Cool303RootPastel> roots) {
		this.roots = roots;
	}




}
