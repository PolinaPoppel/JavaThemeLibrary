package JavaCool303;


import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;


	
	public class Cool303Window extends JFrame{
		private ArrayList<Cool303Root> roots = new ArrayList<>();
		
		/**
		   *Constructor for Cool303Window
		   */
		public Cool303Window(){
				super();
		}
		
		/**
		 * Method that adds a root to the Window (JFrame)
		 * resizes the root
		 * @param root root
		 */
		public void addRoot(Cool303Root root){
			root.setPreferredSize(new Dimension(700, 700));	
			this.add(root);
			roots.add(root);
		}
		
		/**
		 * getter 
		 * @return nothing
		 */
		public ArrayList<Cool303Root> getRoots() {
			return roots;
		}
		
		/**
		 * setter
		 * @param roots roots
		 */
		public void setRoots(ArrayList<Cool303Root> roots) {
			this.roots = roots;
		}
		
	}


