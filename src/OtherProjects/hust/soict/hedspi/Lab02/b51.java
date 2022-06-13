package OtherProjects.hust.soict.hedspi.Lab02;

import javax.swing.JOptionPane;

public class b51 {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
	
		JOptionPane.showMessageDialog(null, "You 've chosen: " + 
				(option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}