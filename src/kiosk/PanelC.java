package kiosk;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelC extends JPanel{

   //직접 객체 생성
   JButton btn1 = new JButton("초밥",new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
   JButton btn2 = new JButton("돈까스",new ImageIcon("src\\kiosk\\imgs\\ggun.PNG") );
   JButton btn3 = new JButton("카레", new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
   JButton btn4 = new JButton("우동",new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
   JButton btn5 = new JButton("텐동", new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
   JButton btn6 = new JButton("라멘",new ImageIcon("src\\kiosk\\imgs\\ggun.PNG"));
   JLabel la=new JLabel("(일식) 메뉴를 선택해주세요.");
   MainTest parent;
   
   
   public PanelC() {
      
   }
   
   
   
   public PanelC(MainTest maintest) {
    parent = maintest;
    setBackground(new Color(255, 255, 255));
    addLayout();
    eventProc();
   
     //그림의 글자 위치
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
   
   
   void addLayout() {
      
      //Dimension btns = new Dimension(170,170);
      JPanel pcenter = new JPanel(); //버튼 올릴 패널
      pcenter.setLayout(new GridLayout(2,3));
      pcenter.add(btn1);
   //   btn1.setPreferredSize(btns);
      pcenter.add(btn2);
   //   btn2.setPreferredSize(btns);
      pcenter.add(btn3);
   //   btn3.setPreferredSize(btns);
      pcenter.add(btn4);
   //   btn1.setPreferredSize(btns);
      pcenter.add(btn5);
   //   btn1.setPreferredSize(btns);
      pcenter.add(btn6);
   //   btn1.setPreferredSize(btns);
      
       add(pcenter);
       
      

      
   }
   
   
   void eventProc() {
       btn1.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("초밥을 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "초밥 7,000원");
                parent.ta.append("초밥 ");
                parent.ta.append("7000원 \n");
             }   
          });//bt.addActionListener END
          
          btn2.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("돈까스를 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "돈까스 5,500원");
                parent.ta.append("돈까스 ");
                parent.ta.append("5500원 \n");
             }   
          });//bt.addActionListener END
          
          btn3.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("카레를 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "카레 4,000원");
                parent.ta.append("카레 ");
                parent.ta.append("4000원 \n");
             }   
          });//bt.addActionListener END
          
          btn4.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("우동을 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "우동 5,500원");
                parent.ta.append("우동 ");
                parent.ta.append("5500원 \n");
             }   
          });//bt.addActionListener END
          
          btn5.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("텐동을 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "텐동 9,500원");
                parent.ta.append("텐동 ");
                parent.ta.append("9500원 \n");
             }   
          });//bt.addActionListener END
          
          btn6.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                parent.la.setText("라멘을 선택하셨습니다.");
                JOptionPane.showMessageDialog(null, "라멘 6,000원");
                parent.ta.append("라멘 ");
                parent.ta.append("6000원 \n");
             }   
          });//bt.addActionListener END
          

 }
      
      
      
   
   public static void main(String[] args) {

      MainTest test = new MainTest();
      test.addLayout();
      test.eventProc();
      
      }

   
   
   
}
