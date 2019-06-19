package JavaCool303;

	import java.awt.Dimension;
	import java.util.ArrayList;

	import javax.swing.JLabel;

	public class Cool303BoxTheme extends Cool303Box implements Theme {
		private ArrayList<Cool303Button> buttons =  new ArrayList<>();
		
		/**
		 * Constructor for Cool303Box that implements a summer theme
		 */
		public Cool303BoxTheme(){
			super();
		}  
		
		/**
		 * getter
		 * @return ArrayList
		 */
		
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
		
		
		/**
		 * Method that adds a button to the box
		 * colours button in a summer theme
		 * @param i integer label
		 * @param button button
		 */
		public void addButton(int i, Cool303ButtonTheme button){
			String number = Integer.toString(i);
			JLabel label = new JLabel(number);
			button.add(label);
			button.setPreferredSize(new Dimension(40, 40));
			button.setColourThing();
			button.setColourThingy();
			this.add(button);
			this.buttons.add(button);
		} 
		

}

