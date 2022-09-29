package kiosk;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class MainTest {

   JFrame f;
   JButton bt;
   JButton bt2;
   JButton bt3;
   JLabel la;
   PanelA panelA;
   PanelB panelB;
   PanelC panelC;
   JTextArea ta;
   static int money = 0;
   int money2 = 0;
   Font font1, font2, font3;
   
   
   public MainTest() {
      f=new JFrame("KOSMO 학생식당");
      bt=new JButton("결제");
      bt2=new JButton("전체 취소");
      bt3 = new JButton("관리자 호출");
      la=new JLabel("메뉴를 선택해주세요.");
      panelA=new PanelA(this);   //A의 주소값을 MainTest에서 받고 싶을 때 this로 받기
      panelB=new PanelB(this);
      panelC=new PanelC(this);
      ta=new JTextArea("=====메뉴====|===가격===\n");
      //TA에 메뉴와 가격이 나오는 곳을 표시해주고 TA 크기가 변하지 않고 고정되게 해줌(크기 고정)
      font1=new Font("한컴산뜻돋움", Font.PLAIN, 20);
      font2=new Font("한컴산뜻돋움", Font.BOLD, 13);
      font3=new Font("한컴산뜻돋움", Font.BOLD, 40);
      
   }

   void addLayout() {
      f.setLayout(new BorderLayout());
      JPanel jpdown=new JPanel();
      JPanel jp=new JPanel();

      jp.setLayout(new GridLayout(2,1));
      jpdown.setLayout(new GridLayout(3,1));
      jpdown.add(bt);
      bt.setFont(font1);
      jpdown.add(bt2);
      bt2.setFont(font1);
      jpdown.add(bt3);      
      bt3.setFont(font1);
      jp.add(ta);    
      la.setFont(font2);

      jp.add(jpdown);
      f.add(jp, BorderLayout.EAST);      //프로그램의 기본 레이아웃이 보더레이아웃이라 선언해주지 않아도 사용 가능.
      f.add(la, BorderLayout.SOUTH);
      

      JTabbedPane tab=new JTabbedPane();
      tab.add("한식 메뉴",panelA);
      tab.add("중식 메뉴",panelB);
      tab.add("일식 메뉴",panelC);
      f.add(tab,BorderLayout.CENTER);

      f.setBounds(100,100,1000,500);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   void eventProc() {
      bt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            int answer = JOptionPane.showConfirmDialog(null, "총"+money + "원, 결제하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
            if(answer == JOptionPane.YES_OPTION) {
               JOptionPane.showMessageDialog(null, "결제가 완료되었습니다.");
               delete();
            }else { 
               
            }
         }   
      });//bt.addActionListener END

      bt2.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            JOptionPane.showMessageDialog(null, "전체 취소되었습니다.");
            delete();
         }   
      });//bt2.addActionListener END


       bt3.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                JOptionPane.showMessageDialog(null, " 조금만 기다려 주세요. 금방 출동하겠습니다.");
             }   
          });//bt3.addActionListener END

   }//eventProc() END

   void delete() {
      ta.setText("=====메뉴====|===가격===\n");
      money = 0;
   }

   void namugi() {
      
   }
   public static void main(String[] args) {

      MainTest test=new MainTest();
      test.addLayout();
      test.eventProc();
   }

}