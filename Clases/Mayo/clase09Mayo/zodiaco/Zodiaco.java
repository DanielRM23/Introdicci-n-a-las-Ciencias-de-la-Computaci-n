import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Zodiaco extends JFrame {

	public Zodiaco() {

		String valor1 = JOptionPane.showInputDialog("Fecha\nEscribe el dia de tu fecha de nacimiento");

		String valor2 = JOptionPane.showInputDialog("Escribe el mes en numero");

		JOptionPane.showMessageDialog(null,"Hola");



		int a = Integer.parseInt(valor1);
		int b = Integer.parseInt(valor2);

		String signo="";
		String personalidad="";

		String nombre_imagen="";


		if ((b==3 && a>=21) || (b==4 && a<=20)) {
            signo="Aries";
            personalidad="Animal: carnero Elemento: fuego";
			nombre_imagen="aries.jpg";
        } else if ((b==4 && a>=21) || (b==5 && a<=21)) {
            signo="Taurus";
            personalidad="Animal: toro Elemento: tierra";
			nombre_imagen="tauro.jpg";
        } else if ((b==5 && a>=22) || (b==6 && a<=21)) {
            signo="Geminis";
            personalidad="Animal: gemelos Elemento: aire";
			nombre_imagen="geminis.jpg";
        } else if ((b==6 && a>=22) || (b==7 && a<=22)) {
            signo = "Cancer";
            personalidad="Animal: cangrejo Elemento: agua";
			nombre_imagen="cancer.jpg";
        } else if ((b==7 && a>=22) || (b==8 && a<=23)){
            signo = "Leo";
            personalidad="Animal: león Elemento: fuego";
			nombre_imagen="leo.jpg";
        } else if ((b==8 && a>=23) || (b==9 && a<=22)){
            signo = "Virgo";
            personalidad="Animal: virgen Elemento: tierra";
			nombre_imagen="virgo.jpeg";
        } else if ((b==9 && a>=23) || (b==10 && a<=23)){
            signo = "Libra";
            personalidad="Animal: balanza Elemento: aire";
			nombre_imagen="libra.jpg";
        } else if ((b==10 && a>=23) || (b==11 && a<=21)){
            signo = "Escorpio";
            personalidad="Animal: escorpión Elemento: agua";
			nombre_imagen="scorpio.jpg";
        } else if ((b==11 && a>=22) || (b==12 && a<=21)){
            signo = "Sagitario";
            personalidad="Animal: arquero Elemento: fuego";
			nombre_imagen="sagitario.jpg";
        } else if ((b==12 && a>=22) || (b==1 && a<=21)){
            signo = "Capriconio";
            personalidad="Animal: cabra Elemento: tierra";
			nombre_imagen="capricornio.jpg";
        } else if ((b==1 && a>=22) || (b==2 && a<=21)){
            signo = "Acuario";
            personalidad="Animal: aguador Elemento: aire";
			nombre_imagen="acuario.jpg";
        } else if ((b==2 && a>=22) || (b==3 && a<=20)){
            signo = "Piscis";
            personalidad="Animal: peces Elemento: agua";
			nombre_imagen="piscis.jpg";
        }


		//dependiendo del signo es el nombre de la imagen que le pasas
		Icon imagen = new ImageIcon(getClass().getResource(nombre_imagen));
		//creas una etiqueta pasandole la imagen, indicas que ira al centro
		JLabel etiqueta = new JLabel(imagen,JLabel.CENTER);
		//Agregas texto
		//Las etiquetas no reconocer el \n para hacer saltos de linea, requieren un poco de notacion html
		etiqueta.setText("<html>" + "<center>"+signo +"</center>"+ "<br>" + personalidad +"</html>");
		//Indicas posicionamiento de la etiqueta
		etiqueta.setHorizontalTextPosition(JLabel.CENTER);
		etiqueta.setVerticalTextPosition(JLabel.TOP);
		//La agregas al frame
		add(etiqueta);


	}


}
