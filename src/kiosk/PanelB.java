package kiosk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

public class PanelB extends JPanel {// 1. 멤버 변수 선언
   JFrame f;
   // 사진넣기

   JButton btn1 = new JButton("짜장면 : 5,000원", new ImageIcon("src\\kiosk\\imgs\\c1.PNG"));
   JButton btn2 = new JButton("짬뽕 : 4,500원", new ImageIcon("src\\kiosk\\imgs\\c2.PNG"));
   JButton btn3 = new JButton("탕수육 : 7,500원", new ImageIcon("src\\kiosk\\imgs\\c3.PNG"));
   JButton btn4 = new JButton("군만두 : 5,500원", new ImageIcon("src\\kiosk\\imgs\\c4.PNG"));
   JButton btn5 = new JButton("꿔바로우 : 8,000원", new ImageIcon("src\\kiosk\\imgs\\c5.PNG"));
   JButton btn6 = new JButton("울면 : 5,000원", new ImageIcon("src\\kiosk\\imgs\\c6.PNG"));
   MainTest parent; // 메인 부분이랑 내용 공유
   // 사진 넣기 끝

   // 주문 값 넣을 공간 설정
   JTextArea ta = new JTextArea();

   // 글자 폰트 설정
   Font font1 = new Font("한컴산뜻돋움", Font.PLAIN, 20);
   Font font2 = new Font("한컴산뜻돋움", Font.BOLD, 13);

   // 중식 파트 글자 추가
   JLabel la = new JLabel("(중식) 메뉴를 선택해주세요.");

   PanelB() {
      // 기본 생성자
   }

   public PanelB(MainTest maintest) { // 2. 객체 생성,  메인 부분과 공유
      parent = maintest; // 메인 받음
      setBackground(new Color(255, 255, 255)); // 메인 배경 설정
      addLayout(); // 중식 파트의 버튼 추가
      eventProc(); // 중식 파트의 버튼 눌렀을 때 해당 이벤트 실행
      // 버튼 위치 지정
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

      // 버튼 추가
      btn1.setFont(font2);
      btn2.setFont(font2);
      btn3.setFont(font2);
      btn4.setFont(font2);
      btn5.setFont(font2);
      btn6.setFont(font2);
      la.setFont(font2);

   }

   void addLayout() { // 3.  화면 구성 및 화면 출력
      JPanel jpdown = new JPanel(); // 버튼 올릴 패널 만들기
      setLayout(new BorderLayout()); // 전체 레이아웃 설정
      add(la, BorderLayout.NORTH); // 상단부분에 주문 창 고정
      jpdown.setLayout(new GridLayout(2, 3)); // 그리드로 크기 고정
      jpdown.add(btn1);
      jpdown.add(btn2);
      jpdown.add(btn3);
      jpdown.add(btn4);
      jpdown.add(btn5);
      jpdown.add(btn6); // 그리드에 버튼 추가
      add(jpdown, BorderLayout.CENTER); // 가운데 지정

   }

   void eventProc() { // 4. 이벤트 처리
      // 해당 버튼 누를 시 이벤트 발생
      // 짜장면 파트 이벤트
      btn1.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("짜장면을 선택하셨습니다.");
            // 버튼 눌렀을 때 예스 / 노 정하기
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION) { // 예 눌렀을 때 해당 구문 발생
               parent.money += 5000; // 짜장면 값 추가
               parent.ta.append("짜장면	| "); // 오른쪽 화면 부분 표시
               
               parent.ta.append("5000원 \n");

            } else {
               System.out.print(" "); // 아니오 눌렀을 때 그냥 진행
            }
         }
      });// bt.addActionListener END

      // 짬뽕 파트 이벤트
      btn2.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("짬뽕을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 5000; // 짬뽕 값 추가
               parent.ta.append("짬뽕	| ");
               parent.ta.append("4500원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// bt.addActionListener END

      // 탕수육 파트 이벤트
      btn3.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("탕수육을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 7500; // 탕수육 값 추가
               parent.ta.append("탕수육	| ");
               parent.ta.append("7500원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// bt.addActionListener END

      // 군만두 파트 이벤트
      btn4.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("군만두를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 5000; // 군만두 값 추가
               parent.ta.append("군만두	| ");

               parent.ta.append("5500원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// bt.addActionListener END

      // 꿔바로우 파트 이벤트
      btn5.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("꿔바로우를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 8000; // 꿔바로우 값 추가
               parent.ta.append("꿔바로우	| ");
               parent.ta.append("8000원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// bt.addActionListener END

      // 울면 파트 이벤트
      btn6.addActionListener(new ActionListener() { // 이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) { // 액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("울면을 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
               parent.money += 5000; // 울면
               parent.ta.append("울면	| ");
               parent.ta.append("5000원 \n");

            } else {
               System.out.print(" ");
            }
         }
      });// bt.addActionListener END

   }

}