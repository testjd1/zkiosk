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
   // 1 . 멤버 변수 선언 
   JFrame f;          // 기본 프레임
   JButton bt;          // 결제 버튼
   JButton bt2;          // 전체 취소 버튼
   JButton bt3;          // 관리자 호출 버튼
   JLabel la;          // 상단 메뉴 탭 밑 선택 라벨
   PanelA panelA;       // 한식 패널
   PanelB panelB;       // 중식 패널
   PanelC panelC;       // 일식 패널
   JTextArea ta;       // 고른 메뉴들 보여주는 메뉴판
   static int money = 0; // 고른 돈 누적
   Font font1, font2;    // 폰트 변수 선언
   
   
   public MainTest() { // 2. 객체 생성
      f=new JFrame("KOSMO 구내식당"); 
      bt=new JButton("결제");
      bt2=new JButton("전체 취소");
      bt3 = new JButton("관리자 호출");
      la=new JLabel("메뉴를 선택해주세요.");
      panelA=new PanelA(this);   //A의 주소값을 MainTest에서 받고 싶을 때 this로 받기
      panelB=new PanelB(this);    //B의 주소값을 MainTest에서 받고 싶을 때 this로 받기
      panelC=new PanelC(this);    //C의 주소값을 MainTest에서 받고 싶을 때 this로 받기
     
    //TA에 메뉴와 가격이 나오는 곳을 표시해주고 TA 크기가 변하지 않고 고정되게 해줌(크기 고정)
      ta=new JTextArea("=====메뉴====|===가격===\n");
      
      // 폰트 고정
      font1=new Font("한컴산뜻돋움", Font.PLAIN, 20);
      font2=new Font("한컴산뜻돋움", Font.BOLD, 13);
 
      
   }

   void addLayout() { // 3.  화면 구성 및 화면 출력
      f.setLayout(new BorderLayout());
      // 크게 그룹을 두개를 설정하여 우측 라인에 반반 그룹으로 [1,3]형식으로 묶어둠
      JPanel jpdown=new JPanel();      // 버튼을 묶어주는 그룹 생성
      JPanel jp=new JPanel();         // ta의 공간 설정

      jp.setLayout(new GridLayout(2,1));   // 크게 두그룹
      jpdown.setLayout(new GridLayout(3,1));   // 그 안에 1,3 형태 (위 / 아래 )
      // 버튼, 메뉴판 그룹화
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
      f.add(la, BorderLayout.SOUTH);    // 메뉴판 상단 고정(북동)
      

      JTabbedPane tab=new JTabbedPane();
      tab.add("한식 메뉴",panelA);            //  한식 메뉴 탭 추가
      tab.add("중식 메뉴",panelB);            //  중식 메뉴 탭 추가
      tab.add("일식 메뉴",panelC);            //  일식 메뉴 탭 추가
      f.add(tab,BorderLayout.CENTER);      // 메뉴 탭 상단 고정

      f.setBounds(100,100,1000,500);      // 파일 위치, 크기 지정
      f.setVisible(true);               // 파일 시각화
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         // 파일 종료
   }

   void eventProc() {// 4. 이벤트 처리
      
     // 결제 버튼 눌렀을 때 이벤트 발생 
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
      
      // 전체 취소 버튼 눌렀을 때 이벤트 발생
      bt2.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            JOptionPane.showMessageDialog(null, "전체 취소되었습니다.");
            delete();
         }   
      });//bt2.addActionListener END

      // 관리자 호출 버튼 눌렀을 때 이벤트 발생
       bt3.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
             public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
                JOptionPane.showMessageDialog(null, " 조금만 기다려 주세요. 금방 출동하겠습니다.");
             }   
          });//bt3.addActionListener END

   }//eventProc() END
   
   // 전체 취소 이벤트에 관한 내부 메소드
   void delete() {
      ta.setText("=====메뉴====|===가격===\n");
      money = 0;
   }

 
   public static void main(String[] args) {

      MainTest test=new MainTest();
      test.addLayout();   // 화면 구성 및 화면 출력 실행
      test.eventProc();   // 이벤트 실행
   }

}