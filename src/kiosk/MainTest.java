package kiosk;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class MainTest {
   
   JFrame f;
   JButton bt;
   JButton bt2;
   JLabel la;
   PanelA panelA;
   PanelB panelB;
   PanelC panelC;
   JTextArea ta;
   
   public MainTest() {
      f=new JFrame("KOSMO 학생식당");
      bt=new JButton("결제");
      bt2=new JButton("전체 취소");
      la=new JLabel("메뉴를 선택해주세요.");
      panelA=new PanelA(this);   //A의 주소값을 MainTest에서 받고 싶을 때 this로 받기
      panelB=new PanelB(this);
      panelC=new PanelC(this);
      ta=new JTextArea();
   }
   
   void addLayout() {
      f.setLayout(new BorderLayout());
      JPanel jpdown=new JPanel();
      jpdown.setLayout(new GridLayout(3,1));
      jpdown.add(ta);      
      jpdown.add(bt);
      jpdown.add(bt2);
      f.add(jpdown, BorderLayout.EAST);      //프로그램의 기본 레이아웃이 보더레이아웃이라 선언해주지 않아도 사용 가능.
      f.add(la, BorderLayout.SOUTH);
      
      JTabbedPane tab=new JTabbedPane();
      tab.add("한식 메뉴",panelA);
      tab.add("중식 메뉴",panelB);
      tab.add("일본 메뉴",panelC);
      f.add(tab,BorderLayout.CENTER);
      
      f.setBounds(100,100,1000,500);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   void eventProc() {
      bt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            JOptionPane.showMessageDialog(null, "총 원, 결제하시겠습니까?");
         }   
      });//bt.addActionListener END
      
      bt2.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            JOptionPane.showMessageDialog(null, "취소되었습니다.");
            cancle();
         }   
      });//bt.addActionListener END
      
   }//eventProc() END

   void cancle() {
      ta.setText(null);
   }
   public static void main(String[] args) {
      
      MainTest test=new MainTest();
      test.addLayout();
      test.eventProc();
   }

}
