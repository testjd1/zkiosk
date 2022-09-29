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

public class PanelA extends JPanel{         //한식을 표시할 PanelA의 
   
   JButton aBt=new JButton("김치찌개 : 4,500원",new ImageIcon("src\\kiosk\\imgs\\k1.PNG"));
   JButton bBt=new JButton("된장찌개 : 4,500원",new ImageIcon("src\\kiosk\\imgs\\k2.PNG"));
   JButton cBt=new JButton("순두부찌개 : 5,000원",new ImageIcon("src\\kiosk\\imgs\\k3.PNG"));
   JButton dBt=new JButton("동태찌개 : 5,500원",new ImageIcon("src\\kiosk\\imgs\\k4.PNG"));
   JButton eBt=new JButton("비지찌개 : 5,500원",new ImageIcon("src\\kiosk\\imgs\\k5.PNG"));
   JButton fBt=new JButton("부대찌개 : 6,000원",new ImageIcon("src\\kiosk\\imgs\\k6.PNG"));
   JLabel la=new JLabel("(한식) 메뉴를 선택해주세요.");
   MainTest parent;
   Font font1=new Font("한컴산뜻돋움", Font.PLAIN, 20);
   Font font2=new Font("한컴산뜻돋움", Font.BOLD, 13);
   Font font3=new Font("한컴산뜻돋움", Font.BOLD, 40);

   public PanelA() {
      
   }
   public PanelA(MainTest mainTest) {
      parent=mainTest;
      //parent=new MainTest();             //A와 MainTest가 계속 무한루프
      setBackground(new Color(255,255,255));   //RGB(red, green, blue)      Max=255;
      addLayout();
      eventProc();
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

   void addLayout (){
      JPanel jpdown=new JPanel();            //버튼 올릴 패널 만들기
      setLayout(new BorderLayout());
      add(la, BorderLayout.NORTH);
      jpdown.setLayout(new GridLayout(2,3));
      jpdown.add(aBt);
      jpdown.add(bBt);
      jpdown.add(cBt);
      jpdown.add(dBt);
      jpdown.add(eBt);
      jpdown.add(fBt);
      aBt.setFont(font2);
      bBt.setFont(font2);
      cBt.setFont(font2);
      dBt.setFont(font2);
      eBt.setFont(font2);
      fBt.setFont(font2);
      la.setFont(font2);
      add(jpdown, BorderLayout.CENTER);
      
   }
   void eventProc(){
      aBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("김치찌개를 선택하셨습니다.");
                int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=4500;
                   parent.ta.append("김치찌개   | 4500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
      
      bBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("된장찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=4500;
                    parent.ta.append("된장찌개   | 4500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
      
      cBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("순두부찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5000;
                    parent.ta.append("순두부찌개   | 5000원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
      
      dBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("동태찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5500;
                    parent.ta.append("동태찌개   | 5500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
      
      eBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("비지찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=5500;
                    parent.ta.append("비지찌개   | 5500원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
      
      fBt.addActionListener(new ActionListener(){            //이너 클래스, 이벤트는 이너클래스로 많이 작업한다.
         public void actionPerformed(ActionEvent e) {      //액션리스너 클래스는 추상클래스라서 메소드를 똑같이 상속 받아서 쓴다.
            parent.la.setText("부대찌개를 선택하셨습니다.");
            int answer = JOptionPane.showConfirmDialog(null, "선택하시겠습니까?", "메뉴",JOptionPane.YES_NO_OPTION );
                if(answer == JOptionPane.YES_OPTION) {
                    parent.money +=6000;
                    parent.ta.append("부대찌개   | 6000원 \n");
                }else { 
                    System.out.print(" ");
                }
         }   
      });//bt.addActionListener END
            
   }
}