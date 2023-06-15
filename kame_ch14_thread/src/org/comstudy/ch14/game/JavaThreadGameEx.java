package org.comstudy.ch14.game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Bullet extends JPanel implements Runnable {
   JLabel bullet;
   int x=400, y=400, w=150, h=150;
   boolean fire = false;
   
   public Bullet() {
	  bullet = new JLabel(new ImageIcon("src/org/comstudy/ch14/game/image1.png"));
      setBackground(Color.blue);
      setLayout(null);
      this.add(bullet);
      bullet.setBounds(x, y, w, h);      
      new Thread(this).start();
   }

   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(1000/60);
            if(fire) {
               y -= 20;
               if(y <= 0) {
                  y = 550;
                  fire = false;
               }
               bullet.setBounds(x,y,w,h);
            }
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
   
}

public class JavaThreadGameEx extends JFrame implements Runnable, ActionListener {
   Container contentPane;
   int x=50, y=50, w=150, h=150;
   JLabel bird;
   Bullet bullet = new Bullet();
   JButton fireBtn = new JButton("Fire");
   
   public JavaThreadGameEx() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      contentPane = getContentPane();
      contentPane.setLayout(null);
      
      ImageIcon birdIcon = new ImageIcon("src/org/comstudy/ch14/game/image2.png");
	  bird = new JLabel(birdIcon);
      contentPane.add(bird);
      bird.setBounds(x,y,w,h);
      
      contentPane.add(bullet);
      bullet.setBounds(0, 0, 800, 600);
      
      new Thread(this).start();
      
      contentPane.add(fireBtn);
      fireBtn.setBounds(700, 480, 70, 70);
      
      fireBtn.addActionListener(this);
      
      setSize(800, 600);
      setVisible(true);
   }
   
   @Override
   public void run() {
      while (true) {
         try {
            Thread.sleep(1000/20);
            x += 10;
            if(x >= 750) {
               x = 50;
            }
            bird.setBounds(x,y,w,h);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

   
   
   
   public static void main(String[] args) {
      new JavaThreadGameEx();
      
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      bullet.fire = true;
   }

}