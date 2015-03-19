import javax.swing.JOptionPane;
public class SwitchCase {

	public static void main(String[] args) {
		String choice []={ "Administrator","Faculty","Staff","Student","Guest"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choice,choice[1]); 
		switch(input.charAt(2)){
		case 'm': JOptionPane.showMessageDialog(null, "Welcome Administrator."); break;
		case 'c': JOptionPane.showMessageDialog(null, "Welcome Faculty."); break;
		case 'a':JOptionPane.showMessageDialog(null, "Welcome Staff."); break;
		case 'u':JOptionPane.showMessageDialog(null, "Welcome Student."); break;
		case 'e':JOptionPane.showMessageDialog(null, "Welcome Guest."); break;
		}

	}

}
