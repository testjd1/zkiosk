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

public class PanelA extends JPanel{         //한식을 표시할 PanelA 클래스, JPanel을 상속받는다. 
   //MainTest 클래스의 메소드들을 사용하기 위해 선언
   MainTest parent;
   //한식 메뉴를 넣을 버튼 선언, 안에 넣을 글씨와 그림을 함께 선언
   JButton aBt=new JButton("김치찌개 : 4,500원",new ImageIcon("src\\kiosk\\imgs\\k1.PNG"));
   JButton bBt=new JButton("된장찌개 : 4,500원",new ImageIcon("src\\kiosk\\imgs\\k2.PNG"));
   JButton cBt=new JButton("순두부찌개 : 5,000원",new ImageIcon("src\\kiosk\\imgs\\k3.PNG"));
   JButton dBt=new JButton("동태찌개 : 5,500원",new ImageIcon("src\\kiosk\\imgs\\k4.PNG"));
   JButton eBt=new JButton("비지찌개 : 5,500원",new ImageIcon("src\\kiosk\\imgs\\k5.PNG"));
   JButton fBt=new JButton("부대찌개 : 6,000원",new ImageIcon("src\\kiosk\\imgs\\k6.PNG"));
   //버튼 위에 출력할 문구를 선언
   JLabel la=new JLabel("(한식) 메뉴를 선택해주세요.");
   //폰트 설정하기 위한 선언
   Font font1=new Font("한컴산뜻돋움", Font.PLAIN, 20);
   Font font2=new Font("한컴산뜻돋움", Font.BOLD, 13);
   //기본 생성자 선언
   public PanelA() {
      
   }
   //변수 있는 생성자 선언
   public PanelA(MainTest mainTest) {      //메인테스트를 사용하기 위해 ()안에 넣어줌
      parent=mainTest;               //메인테스트 사용하기 위해 받을 변수 선언
      //parent=new MainTest();             //A와 MainTest가 계속 무한루프 돌기 때문에 
      //바탕화면 색 설정
      setBackground(new Color(255,255,255));   //RGB(red, green, blue)      Max=255;
      //PanelA의 함수 실행하기 위해 선언
      addLayout();
      eventProc();
      //버튼들 글자 가운데 맞춤으로 맞추고 밑으로 보내기.
      aBt.setHorizontalTextPosition(JButton.CENTER);   
      aBt.setVerticalTextPosition(JButton.BOTTOM);
      
      bBt.setHorizontalTextPosition(JButton.CENTER);   
      bBt.setVerticalTextPosition(JButton.BOTTOM);
      
      cBt.setHorizontalTextPosition(JButton.CENTER);   
      cBt.setVerticalTextPosition(JButton.BOTTOM);
      
      dBt.setHorizontalTextPosition(JButton.CENTER);   
      dBt.setVerticalTextPosition(JButton.BOTTOM);
      
      eBt.setHorizontalTextPosition(JButton.CENTER);   
      eBt.setVerticalTextPosition(JButton.BOTTOM);
      
      fBt.setHorizontalTextPosition(JButton.CENTER);   
      fBt.setVerticalTextPosition(JButton.BOTTOM);
   }

   //레이아웃을 붙힐 addLayout()메소드 선언
   void addLayout (){
      setLayout(new BorderLayout());         //전체 보더 레이아웃 설정
      JPanel jpdown=new JPanel();            //버튼 올릴 패널 만들기
      add(la, BorderLayout.NORTH);         //라벨을 전체 레이아웃의 아랫쪽에 배치
      jpdown.setLayout(new GridLayout(2,3));   //버튼 올릴 패널 jpdown의 레이아웃을 그리드로 설정
      jpdown.add(aBt);                  //패널에 버튼 추가
      jpdown.add(bBt);
      jpdown.add(cBt);
      jpdown.add(dBt);
      jpdown.add(eBt);
      jpdown.add(fBt);
      aBt.setFont(font2);                  //버튼들의 폰트 설정
      bBt.setFont(font2);
      cBt.setFont(font2);
      dBt.setFont(font2);
      eBt.setFont(font2);
      fBt.setFont(font2);
      la.setFont(font2);
      add(jpdown, BorderLayout.CENTER);      //패널을 전체 레이아웃의 가운데 배치
      
   }
   //이벤트 처리할 eventProc()메소드 선언
   void eventProc(){
      aBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("김치찌개를 선택하셨습니다.");      //버튼을 눌렀을 때 나올 멘트를 창 아래에 바꿔주기
                int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                //버튼을 눌렀을 때 나올 창에 띄울 멘트 설정 및 Y/N 설정하기
                if(answer == JOptionPane.YES_OPTION) {         //IF문으로 YES를 누른다는 조건 설정
                    parent.money +=4500;                  //static money 변수에 +4500
                   parent.ta.append("김치찌개	| 4500원 \n");      //TA에 문구 추가
                }else {                               //IF문으로 NO를 누른다는 조건 설정
                    System.out.print(" ");                  //선택하지 않고 나가면 null 값으로 끝
                }//if문 else END
         }//actionPerformed END
      });//김치찌개.addActionListener END
      
      bBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("된장찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=4500;
                    parent.ta.append("된장찌개	| 4500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//된장찌개.addActionListener END
      
      cBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("순두부찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5000;
                    parent.ta.append("순두부찌개	| 5000원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//순두부찌개.addActionListener END
      
      dBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("동태찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5500;
                    parent.ta.append("동태찌개	| 5500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//동태찌개.addActionListener END
      
      eBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("비지찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5500;
                    parent.ta.append("비지찌개	| 5500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//비지찌개.addActionListener END
      
      fBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("부대찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=6000;
                    parent.ta.append("부대찌개	| 6000원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//부대찌개.addActionListener END
            
   }//eventProc() End
}