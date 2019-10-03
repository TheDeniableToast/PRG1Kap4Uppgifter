import java.util.Scanner;
import javax.swing.*;

public class Ovning42 {
	
	public static void main(String[] args) {
		
		//Variables
		short Arskort;
		short Biljett;
		Arskort = 3600;
		Biljett = 70;
		
		String s = JOptionPane.showInputDialog(null,"Hur många gånger går du på gym per år");
		int min = Integer.parseInt(s);
		
		if (min < 52) {
			JOptionPane.showMessageDialog(null,"Du tjänar mer på att köpa biljetter vid varje besök");
		}
			else {
				JOptionPane.showMessageDialog(null,"Du tjänar mer på att köpa ett årskort");
		}
	}
}
		
		
		
		