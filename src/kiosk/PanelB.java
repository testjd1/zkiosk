package kiosk;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelB extends JPanel{
	JFrame f;
	// 사진넣기
/*	
	ImageIcon icon = new ImageIcon("src\\kiosk\\imgs\\jjz.PNG");
	Image img = icon.getImage();
	Image changeImg = img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
	ImageIcon changejjz = new ImageIcon(changeImg);
*/	
	JButton btn1 = new JButton("짜장면",new ImageIcon("src\\kiosk\\imgs\\jjz.PNG"));
	JButton btn2 = new JButton("짬뽕",new ImageIcon("src\\kiosk\\imgs\\jjam.PNG"));
	JButton btn3 = new JButton("탕수육",new ImageIcon("src\\kiosk\\imgs\\tsu.PNG"));
	JButton btn4 = new JButton("군만두",new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
	JButton btn5 = new JButton("꿔바로우",new ImageIcon("src\\kiosk\\imgs\\qwu.PNG"));
	JButton btn6 = new JButton("울면",new ImageIcon("src\\kiosk\\imgs\\ul.PNG"));
	JTextArea ta = new JTextArea();
	
	JLabel la = new JLabel("중식을 선택해주세요.");
	MainTest parent;
	PanelB(){
		
	}
	
	public PanelB(MainTest maintest) {
		parent = maintest;
		setBackground(new Color(255,255,255));
		addLayout();
		eventProc();
		btn1.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn1.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	     
	    btn2.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn2.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	     
	    btn3.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn3.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	    
	    btn4.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn4.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	     
	    btn5.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn5.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	     
	    btn6.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
	    btn6.setVerticalTextPosition(JButton.BOTTOM);  // 수직가운데
	}
	
	public void addLayout() {
//		Dimension btns = new Dimension(1000,1000);
		JPanel jpdown=new JPanel();				 //버튼 올릴 패널 만들기
		jpdown.setLayout(new GridLayout(2,3));   //패널을 행,열 순서대로 나오게 배치 출력
		jpdown.add(btn1);
		jpdown.add(btn2);
		jpdown.add(btn3);
		jpdown.add(btn4);
		jpdown.add(btn5);
		jpdown.add(btn6);
	/*	
		btn6.setPreferredSize(btns);
		btn1.setPreferredSize(btns);
		btn2.setPreferredSize(btns);
		btn3.setPreferredSize(btns);
		btn4.setPreferredSize(btns);
		btn5.setPreferredSize(btns);
		*/
		add(jpdown);   //보더 레이아웃의 아래쪽에 위치 선언
	
	}
	
	void eventProc(){
	      btn1.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("짜장면을 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "짜장면 4,500원");
	            parent.ta.append("짜장면 ");
	            parent.ta.append("4500원 \n");
	         }   
	      });//bt.addActionListener END
	      
	      btn2.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("짬뽕을 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "짬뽕 5,000원");
	            parent.ta.append("짬뽕 ");
	            parent.ta.append("5000원 \n");
	         }   
	      });//bt.addActionListener END
	      
	      btn3.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("탕수육을 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "탕수육 7,500원");
	            parent.ta.append("탕수육 ");
	            parent.ta.append("7500원 \n");
	         }   
	      });//bt.addActionListener END
	      
	      btn4.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("군만두를 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "군만두 5,500원");
	            parent.ta.append("군만두 ");
	            parent.ta.append("5500원 \n");
	         }   
	      });//bt.addActionListener END
	      
	      btn5.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("꿔바로우를 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "꿔바로우 8,000원");
	            parent.ta.append("꿔바로우 ");
	            parent.ta.append("8000원 \n");
	         }   
	      });//bt.addActionListener END
	      
	      btn6.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
	         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
	            parent.la.setText("울면을 선택하셨습니다.");
	            JOptionPane.showMessageDialog(null, "울면 5,000원");
	            parent.ta.append("울면 ");
	            parent.ta.append("5000원 \n");
	         }   
	      });//bt.addActionListener END
	      
	            
	   }
	
	
	
	

}
