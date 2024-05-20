import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JlabelDemo extends JFrame {

	public static void main(String[] args) {

		//Creas un objeto de tipo Zodiaco,
		Zodiaco etiquetas = new Zodiaco();
		//Metodos de tu frame para hacer visible el programa
		etiquetas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		etiquetas.setSize(500,500);
		etiquetas.setVisible(true);
		etiquetas.setResizable(true);
	}
}
