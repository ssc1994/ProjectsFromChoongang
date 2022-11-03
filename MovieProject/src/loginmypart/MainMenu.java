package loginmypart;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainMenu {

	MainMenu(){
		JFrame j = new JFrame();
		JPanel row1 = new JPanel();
		JPanel row2 = new JPanel();
		JPanel pan1 = new JPanel();
		JButton loginbutton = new JButton("<html><body><center>로그인<br> <br>LOG IN</center></body></html>");
		JButton signinbutton = new JButton("<html><body><center>회원가입<br> <br>WELCOME!</center></body><html>");
		Font font1=new Font("맑은고딕",Font.BOLD,15);


		//프레임 조절
		j.setTitle("LogIn/SignUp");//프레임 타이틀
		j.setFont(font1);
		j.setSize(600,600);//프레임 사이즈 통일
		j.setLocationRelativeTo(null);//언제나 가운데에 뜨기
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 닫히면 종료
		j.setVisible(true);

		//패널조정	
		j.setLayout(new GridLayout(3,0));//프레임 3등분하여 패널 3개 넣기
		//버튼조정
		loginbutton.setFont(font1);
		signinbutton.setFont(font1);
		//프레임에 버튼과 패널 넣기
		pan1.add(loginbutton);
		pan1.add(signinbutton);
		j.add(row1);
		j.add(pan1);
		j.add(row2);
		
		signinbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j.setVisible(false);
				new SignInClass2();
			}
		});
		
		loginbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j.setVisible(false);
				new LogInSwing();
			}
		});
		
		
		
		
		
		
	}


	
	
	
	
	
	//실행용
	public static void main(String[] args) {
		new MainMenu();
	}











}
