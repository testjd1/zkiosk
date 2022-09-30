package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelC extends JPanel {  //일식 패널C 설정하기!

   // 선언과 동시에 객체 생성
   JButton btn1 = new JButton("초밥 : 7,000원", new ImageIcon("src\\kiosk\\imgs\\j1.jpg")); //버튼1에 이미지 넣기
   JButton btn2 = new JButton("돈까스 : 5,500원", new ImageIcon("src\\kiosk\\imgs\\j2.jpg")); //버튼2에 이미지 넣기
   JButton btn3 = new JButton("카레 : 4,000원", new ImageIcon("src\\kiosk\\imgs\\j3.jpg")); //버튼3에 이미지 넣기
   JButton btn4 = new JButton("우동 : 5,500원", new ImageIcon("src\\kiosk\\imgs\\j4.jpg")); //버튼4에 이미지 넣기
   JButton btn5 = new JButton("텐동 : 9,500원", new ImageIcon("src\\kiosk\\imgs\\j5.jpg")); //버튼5에 이미지 넣기
   JButton btn6 = new JButton("라멘 : 6,000원", new ImageIcon("src\\kiosk\\imgs\\j6.jpg")); //버튼6에 이미지 넣기
   
   JLabel la = new JLabel("(일식) 메뉴를 선택해주세요.");  //라벨 설정
   
   MainTest parent; //메인에 있는 함수 사용할 수 있도록 선언
   Font font1 = new Font("한컴산뜻돋움", Font.PLAIN, 20);   
   Font font2 = new Font("한컴산뜻돋움", Font.BOLD, 13);


   public PanelC() {   //panelc의 기본생성자 함수 호출

   }// END of PanelC()

   public PanelC(MainTest maintest) {     
      parent = maintest;    //메인에 있는 함수 사용할수 있도록
      setBackground(new Color(255, 255, 255));  // 뒷배경 설정
      addLayout();   // panelc의 addLayout() 함수 호출
      eventProc();   // panelc의 eventProc() 함수 호출

      // 그림의 글자 위치 설정하기
      btn1.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn1.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn2.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn2.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn3.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn3.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn4.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn4.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn5.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn5.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn6.setHorizontalTextPosition(JButton.CENTER); // 수평 가운데
      btn6.setVerticalTextPosition(JButton.BOTTOM); // 수직가운데

      btn1.setFont(font2); // 버튼1에 폰트2 설정
      btn2.setFont(font2); // 버튼2에 폰트2 설정
      btn3.setFont(font2); // 버튼3에 폰트2 설정
      btn4.setFont(font2); // 버튼4에 폰트2 설정
      btn5.setFont(font2); // 버튼5에 폰트2 설정
      btn6.setFont(font2); // 버튼6에 폰트2 설정
      la.setFont(font2);   // 라벨에  폰트2 설정

   }// END of PanelC(MainTest maintest)

   void addLayout() {

      JPanel jpdown = new JPanel(); // 버튼 올릴 패널 만들기
      
      setLayout(new BorderLayout());
      add(la, BorderLayout.NORTH); // 메뉴를 선택해 주세요 라벨 >> 북쪽
      jpdown.setLayout(new GridLayout(2, 3)); // 버튼 6개 gridlayout으로 묶기
      jpdown.add(btn1);
      jpdown.add(btn2);
      jpdown.add(btn3);
      jpdown.add(btn4);
      jpdown.add(btn5);
      jpdown.add(btn6);
      add(jpdown, BorderLayout.CENTER);    // 묶은 버튼 >> 중앙에 묶기

   }// END of addLayout()

   void eventProc() {                                 
      btn1.addActionListener(new ActionListener() {  // 버튼 1 눌렀을 때 이벤트  이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("초밥을 선택하셨습니다.");   // 선택했을 때 메인의 la 뜨게끔 >>남쪽에서 뜬다
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);  // yes,no 2개 선택 옵션 주고
            if (answer == JOptionPane.YES_OPTION) {    // 대답이 yes면
               parent.money += 7000;                  // 메인의 money를 불러와서 money = money +7000 
               parent.ta.append("초밥	| ");          // textfield에 초밥
               parent.ta.append("7000원 \n");          // 7000원 띄우기   --> 사라지면 안되니까 append 사용

            } else {                                   // 대답이 no면
               System.out.print(" ");                 // 아무것도 나오지 않게
            }

         }
      });// END of bt.addActionListener 

      btn2.addActionListener(new ActionListener() { // 버튼 2 눌렀을 때 이벤트     
         public void actionPerformed(ActionEvent e) { 
            parent.la.setText("돈까스를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 5500;
               parent.ta.append("돈까스	| ");
               parent.ta.append("5500원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// END of bt.addActionListener 

      btn3.addActionListener(new ActionListener() { // 버튼 3 눌렀을 때 이벤트 
         public void actionPerformed(ActionEvent e) { 
            parent.la.setText("카레를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 4000;
               parent.ta.append("카레	| ");
               parent.ta.append("4000원 \n");
            } else {
               System.out.print(" ");
            }

         }
      });// END of bt.addActionListener 

      btn4.addActionListener(new ActionListener() { // 버튼 4 눌렀을 때 이벤트 
         public void actionPerformed(ActionEvent e) {
            parent.la.setText("우동을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 5500;
               parent.ta.append("우동	| ");
               parent.ta.append("5500원 \n");
            } else {
               System.out.print(" ");
            }
         }
      });// END of bt.addActionListener 

      btn5.addActionListener(new ActionListener() { // 버튼 5 눌렀을 때 이벤트 
         public void actionPerformed(ActionEvent e) {
            parent.la.setText("텐동을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 9500;
               parent.ta.append("텐동	| ");
               parent.ta.append("9500원 \n");
            } else {
               System.out.print(" ");
            }
         }
      });// END of bt.addActionListener 

      btn6.addActionListener(new ActionListener() { // 버튼 6 눌렀을 때 이벤트 
         public void actionPerformed(ActionEvent e) { 
            parent.la.setText("라멘을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 6000;
               parent.ta.append("라멘	| ");
               parent.ta.append("6000원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// END of bt.addActionListener 

   }

   public static void main(String[] args) {

      MainTest test = new MainTest();
      test.addLayout();
      test.eventProc();

   }

}