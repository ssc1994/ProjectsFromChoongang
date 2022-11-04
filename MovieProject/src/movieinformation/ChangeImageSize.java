package movieinformation;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChangeImageSize extends JFrame{
	
	public ChangeImageSize() {
		
	
	ImageIcon icon = new ImageIcon(ChangeImageSize.class.getResource("C:\\Users\\user\\git\\MovieProject\\MovieProject\\movie_image\\블랙아담.jpg"));
	
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lbl = new JLabel(changeIcon);
		
		add(lbl);
		setTitle("영화");
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChangeImageSize();
	}
	
}
