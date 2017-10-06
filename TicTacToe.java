import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TicTacToe   implements   ActionListener
{
    JFrame f,f2,f3;
    JButton  jb[],jdecide,jdecide2;
    JButton   b[],b2[],b3[];    
    JPanel jp1,jp2,jp3,jp4,jpadd;
    CardLayout cl;
    Icon  icut,idelete,icon;
     int lock=1,jack=0;
    TicTacToe()
     {
           f=  new  JFrame("  'The Tic Tac Toe Game'  ");
           f2=  new  JFrame();
           f3=  new  JFrame();
     
          
           f.setLayout(new GridLayout(3,1));
           f.setSize(400,400);
           f.setSize(50,50);
           jdecide=new JButton("White Android wins the game::");
             jdecide2=new JButton("Green Monster wins the game:: ");
       
           f2.add(jdecide);
           f3.add(jdecide2);
           f2.setSize(300,100);
           f3.setSize(300,100); 
           //buttons for X,O  on jp1
            jb=new JButton[2];
           jp1=new JPanel();
           cl=new CardLayout();
           jp1.setLayout(cl);
           String s1[]={"Player X turns","Player  O  turns"};
           for(int  i=0;i<jb.length;i++)
           {
               jb[i]=new JButton(s1[i]);
               jb[i].addActionListener(this);
               jp1.add(jb[i]);
           }
            f.add(jp1);
        
           icut=new ImageIcon("D:\\TicTacToe\\android.png");                   
           idelete=new ImageIcon("D:\\TicTacToe\\greenmonster.png");                   
             icon=icut;
        //  button for playing
            jp2=new JPanel(new GridLayout(1,3));
            b=new JButton[3];
            for(int  i=0;i<b.length;i++)
             {
                  b[i]=new JButton();
                  b[i].addActionListener(this);
                  jp2.add(b[i]);
            }
           f.add(jp2);
          
            jp3=new JPanel(new GridLayout(1,3));
            b2=new JButton[3];
            for(int  i=0;i<b2.length;i++)
             {
                  b2[i]=new JButton();
                  b2[i].addActionListener(this);
                  jp3.add(b2[i]);
            }
           f.add(jp3);
        
            jp4=new JPanel(new GridLayout(1,3));
            b3=new JButton[3];
            for(int  i=0;i<b3.length;i++)
             {
                  b3[i]=new JButton();
                  b3[i].addActionListener(this);
                  jp4.add(b3[i]);
            }
           f.add(jp4);
             
          jpadd=new JPanel(new GridLayout(3,3));
          jpadd.add(jp2);jpadd.add(jp3);jpadd.add(jp4);
          f.add(jpadd);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setSize(400,400); 
           f.setVisible(true);
     }
    public void actionPerformed(ActionEvent e)
    {    if(jack==0||jack==2||jack==4||jack==6||jack==8){ icon=icut;  lock=1;}
         else{icon=idelete;lock=1;}
            
         for(int i=0;i<=2;i++)
         {  
              if(e.getSource()==b[i])
                       {                                              
                              if(b[i].getIcon()==null&&lock==1)
                                {
                                           lock=0;
                                           b[i].setIcon(icon);jack++;    
                                 }
                         }
                   if(e.getSource()==b2[i]) 
                     {                                                          
                         if(b2[i].getIcon()==null&&lock==1)
                          {
                                 lock=0;
                                 b2[i].setIcon(icon);jack++;
                           }
                        }
                      if(e.getSource()==b3[i])  
                      {                                                        
                         if(b3[i].getIcon()==null&&lock==1)
                          {               
                                     lock=0;jack++; 
                                     b3[i].setIcon(icon);
                           } 
                      }   
                 }
         
    if(((b[0].getIcon()==icut)&&(b[1].getIcon()==icut)&&(b[2].getIcon()==icut))||((b[0].getIcon()==idelete)&&(b[1].getIcon()==idelete)&&(b[2].getIcon()==idelete)))
           {   
               if(b[0].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
   else if(((b2[0].getIcon()==icut)&&(b2[1].getIcon()==icut)&&(b2[2].getIcon()==icut))||((b2[0].getIcon()==idelete)&&(b2[1].getIcon()==idelete)&&(b2[2].getIcon()==idelete)))
           {       
                 if(b2[0].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
   else if(((b3[0].getIcon()==icut)&&(b3[1].getIcon()==icut)&&(b3[2].getIcon()==icut))||((b3[0].getIcon()==idelete)&&(b3[1].getIcon()==idelete)&&(b3[2].getIcon()==idelete)))
           {       
                if(b3[0].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
   else if(((b[0].getIcon()==icut)&&(b2[0].getIcon()==icut)&&(b3[0].getIcon()==icut))||((b[0].getIcon()==idelete)&&(b2[0].getIcon()==idelete)&&(b3[0].getIcon()==idelete)))
           {       
             if(b[0].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
     else if(((b[1].getIcon()==icut)&&(b2[1].getIcon()==icut)&&(b3[1].getIcon()==icut))||((b[1].getIcon()==idelete)&&(b2[1].getIcon()==idelete)&&(b3[1].getIcon()==idelete)))
           {       
             if(b[1].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
     else if(((b[2].getIcon()==icut)&&(b2[2].getIcon()==icut)&&(b3[2].getIcon()==icut))||((b[2].getIcon()==idelete)&&(b2[2].getIcon()==idelete)&&(b3[2].getIcon()==idelete)))
           {       
             if(b[2].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}            }
    else if(((b[0].getIcon()==icut)&&(b2[1].getIcon()==icut)&&(b3[2].getIcon()==icut))||((b[0].getIcon()==idelete)&&(b2[1].getIcon()==idelete)&&(b3[2].getIcon()==idelete)))
           {       
                   if(b[0].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}            }
    else if(((b[2].getIcon()==icut)&&(b2[1].getIcon()==icut)&&(b3[0].getIcon()==icut))||((b[2].getIcon()==idelete)&&(b2[1].getIcon()==idelete)&&(b3[0].getIcon()==idelete)))
           {       
                   if(b[2].getIcon()==icut) {  f2.setVisible(true);}
               else{f3.setVisible(true);}
            }
  
          cl.next(jp1);
 }    
      public static void main(String...s)
     {
       new TicTacToe();
     }
}