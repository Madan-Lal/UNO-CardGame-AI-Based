package uno;

import java.util.*;
import java.awt.Point;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Madan and Hallar
 */
public class Mianframe extends javax.swing.JFrame {
      
    Scanner in=new Scanner(System.in);
    
         String[] array = new String[]{"1112","321","942","431","712","342","1221","031","011","021","132","041","111","1231","341","221","831","521","411","732","512","231","1221","1241","811","621","1032","541","1011","741","421","932","1211","","722","1142","212","921","242","1232","422","312","1132","841","622","432","612","642","1012","922","531","941","522","112","1041","131","821","332","1212","441","1121","721","1111","241","631","222","731","511","1021","542","931","412","1122","1042","1131","611","1031","121","141","142","532","322","211","331","442","912","832","641","822","742","232","842","1022","632","311","911","1141","122","711","1242"};
  
         
        int comp1x1[]={30,30,30,30,30,30,90,90,90,90,90,90};//X-cordinate of computer-1
        int comp1y1[]={130,220,310,400,490,580,130,220,310,400,490,580};//Y-cordinate of computer-1
        int comp2x1[]={280,350,420,490,560,630,700,280,350,420,490,560,};//X-cordinate of computer-2
        int comp2y1[]={80,80,80,80,80,80,80,170,170,170,170,170};//Y-cordinate of computer-2
        int comp3x1[]={950,950,950,950,950,950,890,890,890,890,890,890};//X-cordinate of computer-2
        int comp3y1[]={130,220,310,400,490,580,130,220,310,400,490,580};//Y-cordinate of computer-2
        int userx1[] ={280,350,420,490,560,630,700,280,350,420,490,560};//X-cordinate of User
        int usery1[] ={605,605,605,605,605,605,605,515,515,515,515,515};//Y-cordinate of User
       
    Vector<String> deck=new Vector(100,0); 
    
    boolean Your_turn=true;//This checks whether its User's turn or not, initially it is User's turn
    String center;
    boolean skip=false,draw=false,reverse=false; //These booleans to check the type of trun.
    int center_x=500,center_y=370;
            int comecall=0;
    //Containers for cards
    Vector<String> computer1=new Vector(12,0);
    Vector<String> computer2=new Vector(12,0);
    Vector<String> computer3=new Vector(12,0);
    Vector<String> user=new Vector(12);
    
    
     class thread1 extends Thread //Thread used for computer-players
    {
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mianframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        com1(); //Calling computer 1 AI
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mianframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        com2(); //Calling computer 2 AI
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mianframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        com3(); //Calling computer 3 AI
        
    
    }
    
    }
    
    public Mianframe() {
        
      this.setTitle("UNO -Card Game");
        for(int i=0;i<100;i++){deck.add(array[i]);} //Filling vector with all cards
       
        Random rand = new Random();
         int x= (rand.nextInt(100));//Random number at center initially
        
        String initial_deck=deck.elementAt(x);
        
        center=initial_deck;//1st for digit, 2nd for color, 3rd for its its copy
        deck.remove(center);
        initComponents();
        initRounds();
        
        place_to_center(center, 1,500,370);//Place this card to center
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        Deck = new javax.swing.JLabel();
        real_deck = new javax.swing.JLabel();
        R0 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        R5 = new javax.swing.JLabel();
        R6 = new javax.swing.JLabel();
        R7 = new javax.swing.JLabel();
        R8 = new javax.swing.JLabel();
        R9 = new javax.swing.JLabel();
        R_skip = new javax.swing.JLabel();
        R_draw2 = new javax.swing.JLabel();
        R_rev = new javax.swing.JLabel();
        R12 = new javax.swing.JLabel();
        R22 = new javax.swing.JLabel();
        R32 = new javax.swing.JLabel();
        R42 = new javax.swing.JLabel();
        R52 = new javax.swing.JLabel();
        R62 = new javax.swing.JLabel();
        R72 = new javax.swing.JLabel();
        R82 = new javax.swing.JLabel();
        R92 = new javax.swing.JLabel();
        R_skip2 = new javax.swing.JLabel();
        R_draw22 = new javax.swing.JLabel();
        R_rev2 = new javax.swing.JLabel();
        G0 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        G7 = new javax.swing.JLabel();
        G8 = new javax.swing.JLabel();
        G9 = new javax.swing.JLabel();
        G_skip = new javax.swing.JLabel();
        G_draw2 = new javax.swing.JLabel();
        G_rev = new javax.swing.JLabel();
        G12 = new javax.swing.JLabel();
        G22 = new javax.swing.JLabel();
        G32 = new javax.swing.JLabel();
        G42 = new javax.swing.JLabel();
        G52 = new javax.swing.JLabel();
        G62 = new javax.swing.JLabel();
        G72 = new javax.swing.JLabel();
        G82 = new javax.swing.JLabel();
        G92 = new javax.swing.JLabel();
        G_skip2 = new javax.swing.JLabel();
        G_draw22 = new javax.swing.JLabel();
        G_rev2 = new javax.swing.JLabel();
        B0 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B_skip = new javax.swing.JLabel();
        B_draw2 = new javax.swing.JLabel();
        B_rev = new javax.swing.JLabel();
        B12 = new javax.swing.JLabel();
        B22 = new javax.swing.JLabel();
        B32 = new javax.swing.JLabel();
        B42 = new javax.swing.JLabel();
        B52 = new javax.swing.JLabel();
        B62 = new javax.swing.JLabel();
        B72 = new javax.swing.JLabel();
        B82 = new javax.swing.JLabel();
        B92 = new javax.swing.JLabel();
        B_skip2 = new javax.swing.JLabel();
        B_draw22 = new javax.swing.JLabel();
        B_rev2 = new javax.swing.JLabel();
        Y0 = new javax.swing.JLabel();
        Y1 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        Y3 = new javax.swing.JLabel();
        Y4 = new javax.swing.JLabel();
        Y5 = new javax.swing.JLabel();
        Y6 = new javax.swing.JLabel();
        Y7 = new javax.swing.JLabel();
        Y8 = new javax.swing.JLabel();
        Y9 = new javax.swing.JLabel();
        Y_skip = new javax.swing.JLabel();
        Y_draw2 = new javax.swing.JLabel();
        Y_rev = new javax.swing.JLabel();
        Y12 = new javax.swing.JLabel();
        Y22 = new javax.swing.JLabel();
        Y32 = new javax.swing.JLabel();
        Y42 = new javax.swing.JLabel();
        Y52 = new javax.swing.JLabel();
        Y62 = new javax.swing.JLabel();
        Y72 = new javax.swing.JLabel();
        Y82 = new javax.swing.JLabel();
        Y92 = new javax.swing.JLabel();
        Y_skip2 = new javax.swing.JLabel();
        Y_draw22 = new javax.swing.JLabel();
        Y_rev2 = new javax.swing.JLabel();
        draw41 = new javax.swing.JLabel();
        draw42 = new javax.swing.JLabel();
        draw43 = new javax.swing.JLabel();
        draw44 = new javax.swing.JLabel();
        wild1 = new javax.swing.JLabel();
        wild2 = new javax.swing.JLabel();
        wild3 = new javax.swing.JLabel();
        wild4 = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card10 = new javax.swing.JLabel();
        card11 = new javax.swing.JLabel();
        card12 = new javax.swing.JLabel();
        card13 = new javax.swing.JLabel();
        card14 = new javax.swing.JLabel();
        card15 = new javax.swing.JLabel();
        card16 = new javax.swing.JLabel();
        card17 = new javax.swing.JLabel();
        card18 = new javax.swing.JLabel();
        card19 = new javax.swing.JLabel();
        card20 = new javax.swing.JLabel();
        card21 = new javax.swing.JLabel();
        Round1 = new javax.swing.JLabel();
        Round2 = new javax.swing.JLabel();
        Round3 = new javax.swing.JLabel();
        Round4 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        e8 = new javax.swing.JLabel();
        e9 = new javax.swing.JLabel();
        e10 = new javax.swing.JLabel();
        e11 = new javax.swing.JLabel();
        e12 = new javax.swing.JLabel();
        e13 = new javax.swing.JLabel();
        e14 = new javax.swing.JLabel();
        e15 = new javax.swing.JLabel();
        manu = new javax.swing.JLabel();

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/UNO_back1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        Deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/UNO_back1.jpg"))); // NOI18N
        Deck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeckMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeckMousePressed(evt);
            }
        });
        getContentPane().add(Deck);
        Deck.setBounds(250, 360, 140, 120);

        real_deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/UNO_back2.png"))); // NOI18N
        real_deck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                real_deckMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                real_deckMousePressed(evt);
            }
        });
        getContentPane().add(real_deck);
        real_deck.setBounds(240, 350, 150, 140);

        R0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/011.png"))); // NOI18N
        R0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R0MousePressed(evt);
            }
        });
        getContentPane().add(R0);
        R0.setBounds(290, 380, 50, 90);

        R1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/111.png"))); // NOI18N
        R1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R1MousePressed(evt);
            }
        });
        getContentPane().add(R1);
        R1.setBounds(290, 380, 50, 90);

        R2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/211.png"))); // NOI18N
        R2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R2MousePressed(evt);
            }
        });
        getContentPane().add(R2);
        R2.setBounds(290, 380, 50, 90);

        R3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/311.png"))); // NOI18N
        R3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R3MousePressed(evt);
            }
        });
        getContentPane().add(R3);
        R3.setBounds(290, 380, 50, 90);

        R4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/411.png"))); // NOI18N
        R4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R4MousePressed(evt);
            }
        });
        getContentPane().add(R4);
        R4.setBounds(290, 380, 50, 90);

        R5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/511.png"))); // NOI18N
        R5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R5MousePressed(evt);
            }
        });
        getContentPane().add(R5);
        R5.setBounds(290, 380, 50, 90);

        R6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/611.png"))); // NOI18N
        R6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R6MousePressed(evt);
            }
        });
        getContentPane().add(R6);
        R6.setBounds(290, 380, 50, 90);

        R7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/711.png"))); // NOI18N
        R7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R7MousePressed(evt);
            }
        });
        getContentPane().add(R7);
        R7.setBounds(290, 380, 50, 90);

        R8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/811.png"))); // NOI18N
        R8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R8MousePressed(evt);
            }
        });
        getContentPane().add(R8);
        R8.setBounds(290, 380, 50, 90);

        R9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/911.png"))); // NOI18N
        R9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R9MousePressed(evt);
            }
        });
        getContentPane().add(R9);
        R9.setBounds(290, 380, 50, 90);

        R_skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1111.png"))); // NOI18N
        R_skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_skipMousePressed(evt);
            }
        });
        getContentPane().add(R_skip);
        R_skip.setBounds(290, 380, 50, 90);

        R_draw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1011.png"))); // NOI18N
        R_draw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_draw2MousePressed(evt);
            }
        });
        getContentPane().add(R_draw2);
        R_draw2.setBounds(290, 380, 50, 90);

        R_rev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1211.png"))); // NOI18N
        R_rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_revMousePressed(evt);
            }
        });
        getContentPane().add(R_rev);
        R_rev.setBounds(290, 380, 50, 90);

        R12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/111.png"))); // NOI18N
        R12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R12MousePressed(evt);
            }
        });
        getContentPane().add(R12);
        R12.setBounds(290, 380, 50, 90);

        R22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/211.png"))); // NOI18N
        R22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R22MousePressed(evt);
            }
        });
        getContentPane().add(R22);
        R22.setBounds(290, 380, 50, 90);

        R32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/311.png"))); // NOI18N
        R32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R32MousePressed(evt);
            }
        });
        getContentPane().add(R32);
        R32.setBounds(290, 380, 50, 90);

        R42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/411.png"))); // NOI18N
        R42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R42MousePressed(evt);
            }
        });
        getContentPane().add(R42);
        R42.setBounds(290, 380, 50, 90);

        R52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/511.png"))); // NOI18N
        R52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R52MousePressed(evt);
            }
        });
        getContentPane().add(R52);
        R52.setBounds(290, 380, 50, 90);

        R62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/611.png"))); // NOI18N
        R62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R62MousePressed(evt);
            }
        });
        getContentPane().add(R62);
        R62.setBounds(290, 380, 50, 90);

        R72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/711.png"))); // NOI18N
        R72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R72MousePressed(evt);
            }
        });
        getContentPane().add(R72);
        R72.setBounds(290, 380, 50, 90);

        R82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/811.png"))); // NOI18N
        R82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R82MousePressed(evt);
            }
        });
        getContentPane().add(R82);
        R82.setBounds(290, 380, 50, 90);

        R92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/911.png"))); // NOI18N
        R92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R92MousePressed(evt);
            }
        });
        getContentPane().add(R92);
        R92.setBounds(290, 380, 50, 90);

        R_skip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1111.png"))); // NOI18N
        R_skip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_skip2MousePressed(evt);
            }
        });
        getContentPane().add(R_skip2);
        R_skip2.setBounds(290, 380, 50, 90);

        R_draw22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1011.png"))); // NOI18N
        R_draw22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_draw22MousePressed(evt);
            }
        });
        getContentPane().add(R_draw22);
        R_draw22.setBounds(290, 380, 50, 90);

        R_rev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1211.png"))); // NOI18N
        R_rev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R_rev2MousePressed(evt);
            }
        });
        getContentPane().add(R_rev2);
        R_rev2.setBounds(290, 380, 50, 90);

        G0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/021.png"))); // NOI18N
        G0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G0MousePressed(evt);
            }
        });
        getContentPane().add(G0);
        G0.setBounds(290, 380, 50, 90);

        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/121.png"))); // NOI18N
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G1MousePressed(evt);
            }
        });
        getContentPane().add(G1);
        G1.setBounds(290, 380, 50, 90);

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/221.png"))); // NOI18N
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G2MousePressed(evt);
            }
        });
        getContentPane().add(G2);
        G2.setBounds(290, 380, 50, 90);

        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/321.png"))); // NOI18N
        G3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G3MousePressed(evt);
            }
        });
        getContentPane().add(G3);
        G3.setBounds(290, 380, 50, 90);

        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/421.png"))); // NOI18N
        G4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G4MousePressed(evt);
            }
        });
        getContentPane().add(G4);
        G4.setBounds(290, 380, 50, 90);

        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/521.png"))); // NOI18N
        G5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G5MousePressed(evt);
            }
        });
        getContentPane().add(G5);
        G5.setBounds(290, 380, 50, 90);

        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/621.png"))); // NOI18N
        G6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G6MousePressed(evt);
            }
        });
        getContentPane().add(G6);
        G6.setBounds(290, 380, 50, 90);

        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/721.png"))); // NOI18N
        G7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G7MousePressed(evt);
            }
        });
        getContentPane().add(G7);
        G7.setBounds(290, 380, 50, 90);

        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/821.png"))); // NOI18N
        G8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G8MousePressed(evt);
            }
        });
        getContentPane().add(G8);
        G8.setBounds(290, 380, 50, 90);

        G9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/921.png"))); // NOI18N
        G9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G9MousePressed(evt);
            }
        });
        getContentPane().add(G9);
        G9.setBounds(290, 380, 50, 90);

        G_skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1121.png"))); // NOI18N
        G_skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_skipMousePressed(evt);
            }
        });
        getContentPane().add(G_skip);
        G_skip.setBounds(290, 380, 50, 90);

        G_draw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1021.png"))); // NOI18N
        G_draw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_draw2MousePressed(evt);
            }
        });
        getContentPane().add(G_draw2);
        G_draw2.setBounds(290, 380, 50, 90);

        G_rev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1221.png"))); // NOI18N
        G_rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_revMousePressed(evt);
            }
        });
        getContentPane().add(G_rev);
        G_rev.setBounds(290, 380, 50, 90);

        G12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/121.png"))); // NOI18N
        G12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G12MousePressed(evt);
            }
        });
        getContentPane().add(G12);
        G12.setBounds(290, 380, 50, 90);

        G22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/221.png"))); // NOI18N
        G22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G22MousePressed(evt);
            }
        });
        getContentPane().add(G22);
        G22.setBounds(290, 380, 50, 90);

        G32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/321.png"))); // NOI18N
        G32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G32MousePressed(evt);
            }
        });
        getContentPane().add(G32);
        G32.setBounds(290, 380, 50, 90);

        G42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/421.png"))); // NOI18N
        G42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G42MousePressed(evt);
            }
        });
        getContentPane().add(G42);
        G42.setBounds(290, 380, 50, 90);

        G52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/521.png"))); // NOI18N
        G52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G52MousePressed(evt);
            }
        });
        getContentPane().add(G52);
        G52.setBounds(290, 380, 50, 90);

        G62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/621.png"))); // NOI18N
        G62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G62MousePressed(evt);
            }
        });
        getContentPane().add(G62);
        G62.setBounds(290, 380, 50, 90);

        G72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/721.png"))); // NOI18N
        G72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G72MousePressed(evt);
            }
        });
        getContentPane().add(G72);
        G72.setBounds(290, 380, 50, 90);

        G82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/821.png"))); // NOI18N
        G82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G82MousePressed(evt);
            }
        });
        getContentPane().add(G82);
        G82.setBounds(290, 380, 50, 90);

        G92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/921.png"))); // NOI18N
        G92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G92MousePressed(evt);
            }
        });
        getContentPane().add(G92);
        G92.setBounds(290, 380, 50, 90);

        G_skip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1121.png"))); // NOI18N
        G_skip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_skip2MousePressed(evt);
            }
        });
        getContentPane().add(G_skip2);
        G_skip2.setBounds(290, 380, 50, 90);

        G_draw22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1021.png"))); // NOI18N
        G_draw22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_draw22MousePressed(evt);
            }
        });
        getContentPane().add(G_draw22);
        G_draw22.setBounds(290, 380, 50, 90);

        G_rev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1221.png"))); // NOI18N
        G_rev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                G_rev2MousePressed(evt);
            }
        });
        getContentPane().add(G_rev2);
        G_rev2.setBounds(290, 380, 50, 90);

        B0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/031.png"))); // NOI18N
        B0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B0MousePressed(evt);
            }
        });
        getContentPane().add(B0);
        B0.setBounds(290, 380, 50, 90);

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/131.png"))); // NOI18N
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B1MousePressed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(290, 380, 50, 90);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/231.png"))); // NOI18N
        B2.setText("jLabel2");
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B2MousePressed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(290, 380, 50, 90);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/331.png"))); // NOI18N
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B3MousePressed(evt);
            }
        });
        getContentPane().add(B3);
        B3.setBounds(290, 380, 50, 90);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/431.png"))); // NOI18N
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B4MousePressed(evt);
            }
        });
        getContentPane().add(B4);
        B4.setBounds(290, 380, 50, 90);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/531.png"))); // NOI18N
        B5.setText("jLabel4");
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B5MousePressed(evt);
            }
        });
        getContentPane().add(B5);
        B5.setBounds(290, 380, 50, 90);

        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/631.png"))); // NOI18N
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B6MousePressed(evt);
            }
        });
        getContentPane().add(B6);
        B6.setBounds(290, 380, 50, 90);

        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/731.png"))); // NOI18N
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B7MousePressed(evt);
            }
        });
        getContentPane().add(B7);
        B7.setBounds(290, 380, 50, 90);

        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/831.png"))); // NOI18N
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B8MousePressed(evt);
            }
        });
        getContentPane().add(B8);
        B8.setBounds(290, 380, 50, 90);

        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/931.png"))); // NOI18N
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B9MousePressed(evt);
            }
        });
        getContentPane().add(B9);
        B9.setBounds(290, 380, 50, 90);

        B_skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1131.png"))); // NOI18N
        B_skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_skipMousePressed(evt);
            }
        });
        getContentPane().add(B_skip);
        B_skip.setBounds(290, 380, 50, 90);

        B_draw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1031.png"))); // NOI18N
        B_draw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_draw2MousePressed(evt);
            }
        });
        getContentPane().add(B_draw2);
        B_draw2.setBounds(290, 380, 50, 90);

        B_rev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1231.png"))); // NOI18N
        B_rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_revMousePressed(evt);
            }
        });
        getContentPane().add(B_rev);
        B_rev.setBounds(290, 380, 50, 90);

        B12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/131.png"))); // NOI18N
        B12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B12MousePressed(evt);
            }
        });
        getContentPane().add(B12);
        B12.setBounds(290, 380, 50, 90);

        B22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/231.png"))); // NOI18N
        B22.setText("jLabel2");
        B22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B22MousePressed(evt);
            }
        });
        getContentPane().add(B22);
        B22.setBounds(290, 380, 50, 90);

        B32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/331.png"))); // NOI18N
        B32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B32MousePressed(evt);
            }
        });
        getContentPane().add(B32);
        B32.setBounds(290, 380, 50, 90);

        B42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/431.png"))); // NOI18N
        B42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B42MousePressed(evt);
            }
        });
        getContentPane().add(B42);
        B42.setBounds(290, 380, 50, 90);

        B52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/531.png"))); // NOI18N
        B52.setText("jLabel4");
        B52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B52MousePressed(evt);
            }
        });
        getContentPane().add(B52);
        B52.setBounds(290, 380, 50, 90);

        B62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/631.png"))); // NOI18N
        B62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B62MousePressed(evt);
            }
        });
        getContentPane().add(B62);
        B62.setBounds(290, 380, 50, 90);

        B72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/731.png"))); // NOI18N
        B72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B72MousePressed(evt);
            }
        });
        getContentPane().add(B72);
        B72.setBounds(290, 380, 50, 90);

        B82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/831.png"))); // NOI18N
        B82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B82MousePressed(evt);
            }
        });
        getContentPane().add(B82);
        B82.setBounds(290, 380, 50, 90);

        B92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/931.png"))); // NOI18N
        B92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B92MousePressed(evt);
            }
        });
        getContentPane().add(B92);
        B92.setBounds(290, 380, 50, 90);

        B_skip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1131.png"))); // NOI18N
        B_skip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_skip2MousePressed(evt);
            }
        });
        getContentPane().add(B_skip2);
        B_skip2.setBounds(290, 380, 50, 90);

        B_draw22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1031.png"))); // NOI18N
        B_draw22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_draw22MousePressed(evt);
            }
        });
        getContentPane().add(B_draw22);
        B_draw22.setBounds(290, 380, 50, 90);

        B_rev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1231.png"))); // NOI18N
        B_rev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                B_rev2MousePressed(evt);
            }
        });
        getContentPane().add(B_rev2);
        B_rev2.setBounds(290, 380, 50, 90);

        Y0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/041.png"))); // NOI18N
        Y0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y0MousePressed(evt);
            }
        });
        getContentPane().add(Y0);
        Y0.setBounds(290, 380, 50, 90);

        Y1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/141.png"))); // NOI18N
        Y1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y1MousePressed(evt);
            }
        });
        getContentPane().add(Y1);
        Y1.setBounds(290, 380, 50, 90);

        Y2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/241.png"))); // NOI18N
        Y2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y2MousePressed(evt);
            }
        });
        getContentPane().add(Y2);
        Y2.setBounds(290, 380, 50, 90);

        Y3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/341.png"))); // NOI18N
        Y3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y3MousePressed(evt);
            }
        });
        getContentPane().add(Y3);
        Y3.setBounds(290, 380, 50, 90);

        Y4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/441.png"))); // NOI18N
        Y4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y4MousePressed(evt);
            }
        });
        getContentPane().add(Y4);
        Y4.setBounds(290, 380, 50, 90);

        Y5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/541.png"))); // NOI18N
        Y5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y5MousePressed(evt);
            }
        });
        getContentPane().add(Y5);
        Y5.setBounds(290, 380, 50, 90);

        Y6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/641.png"))); // NOI18N
        Y6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y6MousePressed(evt);
            }
        });
        getContentPane().add(Y6);
        Y6.setBounds(290, 380, 50, 90);

        Y7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/741.png"))); // NOI18N
        Y7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y7MousePressed(evt);
            }
        });
        getContentPane().add(Y7);
        Y7.setBounds(290, 380, 50, 90);

        Y8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/841.png"))); // NOI18N
        Y8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y8MousePressed(evt);
            }
        });
        getContentPane().add(Y8);
        Y8.setBounds(290, 380, 50, 90);

        Y9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/941.png"))); // NOI18N
        Y9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y9MousePressed(evt);
            }
        });
        getContentPane().add(Y9);
        Y9.setBounds(290, 380, 50, 90);

        Y_skip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1141.png"))); // NOI18N
        Y_skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_skipMousePressed(evt);
            }
        });
        getContentPane().add(Y_skip);
        Y_skip.setBounds(290, 380, 50, 90);

        Y_draw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1041.png"))); // NOI18N
        Y_draw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_draw2MousePressed(evt);
            }
        });
        getContentPane().add(Y_draw2);
        Y_draw2.setBounds(290, 380, 50, 90);

        Y_rev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1241.png"))); // NOI18N
        Y_rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_revMousePressed(evt);
            }
        });
        getContentPane().add(Y_rev);
        Y_rev.setBounds(290, 380, 50, 90);

        Y12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/141.png"))); // NOI18N
        Y12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y12MousePressed(evt);
            }
        });
        getContentPane().add(Y12);
        Y12.setBounds(290, 380, 50, 90);

        Y22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/241.png"))); // NOI18N
        Y22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y22MousePressed(evt);
            }
        });
        getContentPane().add(Y22);
        Y22.setBounds(290, 380, 50, 90);

        Y32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/341.png"))); // NOI18N
        Y32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y32MousePressed(evt);
            }
        });
        getContentPane().add(Y32);
        Y32.setBounds(290, 380, 50, 90);

        Y42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/441.png"))); // NOI18N
        Y42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y42MousePressed(evt);
            }
        });
        getContentPane().add(Y42);
        Y42.setBounds(290, 380, 50, 90);

        Y52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/541.png"))); // NOI18N
        Y52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y52MousePressed(evt);
            }
        });
        getContentPane().add(Y52);
        Y52.setBounds(290, 380, 50, 90);

        Y62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/641.png"))); // NOI18N
        Y62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y62MousePressed(evt);
            }
        });
        getContentPane().add(Y62);
        Y62.setBounds(290, 380, 50, 90);

        Y72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/741.png"))); // NOI18N
        Y72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y72MousePressed(evt);
            }
        });
        getContentPane().add(Y72);
        Y72.setBounds(290, 380, 50, 90);

        Y82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/841.png"))); // NOI18N
        Y82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y82MousePressed(evt);
            }
        });
        getContentPane().add(Y82);
        Y82.setBounds(290, 380, 50, 90);

        Y92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/941.png"))); // NOI18N
        Y92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y92MousePressed(evt);
            }
        });
        getContentPane().add(Y92);
        Y92.setBounds(290, 380, 50, 90);

        Y_skip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1141.png"))); // NOI18N
        Y_skip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_skip2MousePressed(evt);
            }
        });
        getContentPane().add(Y_skip2);
        Y_skip2.setBounds(290, 380, 50, 90);

        Y_draw22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1041.png"))); // NOI18N
        Y_draw22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_draw22MousePressed(evt);
            }
        });
        getContentPane().add(Y_draw22);
        Y_draw22.setBounds(290, 380, 50, 90);

        Y_rev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/1241.png"))); // NOI18N
        Y_rev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Y_rev2MousePressed(evt);
            }
        });
        getContentPane().add(Y_rev2);
        Y_rev2.setBounds(290, 380, 50, 90);

        draw41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/0000.png"))); // NOI18N
        draw41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw41MousePressed(evt);
            }
        });
        getContentPane().add(draw41);
        draw41.setBounds(290, 380, 50, 90);

        draw42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/0000.png"))); // NOI18N
        draw42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw42MousePressed(evt);
            }
        });
        getContentPane().add(draw42);
        draw42.setBounds(290, 380, 50, 90);

        draw43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/0000.png"))); // NOI18N
        draw43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw43MousePressed(evt);
            }
        });
        getContentPane().add(draw43);
        draw43.setBounds(290, 380, 50, 90);

        draw44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/0000.png"))); // NOI18N
        draw44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw44MousePressed(evt);
            }
        });
        getContentPane().add(draw44);
        draw44.setBounds(290, 380, 50, 90);

        wild1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/101010.png"))); // NOI18N
        wild1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wild1MousePressed(evt);
            }
        });
        getContentPane().add(wild1);
        wild1.setBounds(290, 380, 50, 90);

        wild2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/101010.png"))); // NOI18N
        wild2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wild2MousePressed(evt);
            }
        });
        getContentPane().add(wild2);
        wild2.setBounds(290, 380, 50, 90);

        wild3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/101010.png"))); // NOI18N
        wild3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wild3MousePressed(evt);
            }
        });
        getContentPane().add(wild3);
        wild3.setBounds(290, 380, 50, 90);

        wild4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/101010.png"))); // NOI18N
        wild4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wild4MousePressed(evt);
            }
        });
        getContentPane().add(wild4);
        wild4.setBounds(290, 380, 50, 90);

        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card1.setText("jLabel2");
        getContentPane().add(card1);
        card1.setBounds(290, 380, 50, 90);

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card2.setText("jLabel2");
        getContentPane().add(card2);
        card2.setBounds(290, 380, 50, 90);

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card3.setText("jLabel2");
        getContentPane().add(card3);
        card3.setBounds(290, 380, 50, 90);

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card4.setText("jLabel2");
        getContentPane().add(card4);
        card4.setBounds(290, 380, 50, 90);

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card5.setText("jLabel2");
        getContentPane().add(card5);
        card5.setBounds(290, 380, 50, 90);

        card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card6.setText("jLabel2");
        getContentPane().add(card6);
        card6.setBounds(290, 380, 50, 90);

        card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        card7.setText("jLabel2");
        getContentPane().add(card7);
        card7.setBounds(290, 380, 50, 90);

        card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card8);
        card8.setBounds(290, 380, 50, 90);

        card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card9);
        card9.setBounds(290, 380, 50, 90);

        card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card10);
        card10.setBounds(290, 380, 50, 90);

        card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card11);
        card11.setBounds(290, 380, 50, 90);

        card12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card12);
        card12.setBounds(290, 380, 50, 90);

        card13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card13);
        card13.setBounds(290, 380, 50, 90);

        card14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card14);
        card14.setBounds(290, 380, 50, 90);

        card15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card15);
        card15.setBounds(290, 380, 50, 90);

        card16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card16);
        card16.setBounds(290, 380, 50, 90);

        card17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card17);
        card17.setBounds(290, 380, 50, 90);

        card18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card18);
        card18.setBounds(290, 380, 50, 90);

        card19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card19);
        card19.setBounds(290, 380, 50, 90);

        card20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card20);
        card20.setBounds(290, 380, 50, 90);

        card21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(card21);
        card21.setBounds(290, 380, 50, 90);

        Round1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/round.png"))); // NOI18N
        getContentPane().add(Round1);
        Round1.setBounds(20, 20, 140, 40);

        Round2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/round2.png"))); // NOI18N
        getContentPane().add(Round2);
        Round2.setBounds(20, 20, 140, 40);

        Round3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/round3.png"))); // NOI18N
        getContentPane().add(Round3);
        Round3.setBounds(20, 20, 140, 40);

        Round4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Cards/round4.png"))); // NOI18N
        getContentPane().add(Round4);
        Round4.setBounds(20, 20, 150, 40);

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e1);
        e1.setBounds(290, 380, 50, 90);

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e2);
        e2.setBounds(290, 380, 50, 90);

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e3);
        e3.setBounds(290, 380, 50, 90);

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e4);
        e4.setBounds(290, 380, 50, 90);

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e5);
        e5.setBounds(290, 380, 50, 90);

        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e6);
        e6.setBounds(290, 380, 50, 90);

        e7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e7);
        e7.setBounds(290, 380, 50, 90);

        e8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e8);
        e8.setBounds(290, 380, 50, 90);

        e9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e9);
        e9.setBounds(290, 380, 50, 90);

        e10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e10);
        e10.setBounds(290, 380, 50, 90);

        e11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e11);
        e11.setBounds(290, 380, 50, 90);

        e12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e12);
        e12.setBounds(290, 380, 50, 90);

        e13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e13);
        e13.setBounds(290, 380, 50, 90);

        e14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e14);
        e14.setBounds(290, 380, 50, 90);

        e15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/Backsmall_updated.png"))); // NOI18N
        getContentPane().add(e15);
        e15.setBounds(290, 380, 50, 90);

        manu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno/manu.jpg"))); // NOI18N
        manu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manuMousePressed(evt);
            }
        });
        manu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                manuKeyPressed(evt);
            }
        });
        getContentPane().add(manu);
        manu.setBounds(0, 0, 1020, 770);
        manu.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("main_frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initRounds() //Disappear all rounds
    {
       
        Round1.setVisible(false);
        Round2.setVisible(false);
        Round3.setVisible(false);
        Round4.setVisible(false);
    }
    
    
    
    private void function(int x,String c,int r)
    {
    skip=false;//Because center dont have skip card
        if(x==500){
            
        center=c;
        initRounds();
        if(r==1){Round1.setVisible(true);}
        else if(r==2){Round2.setVisible(true);}
        else if(r==3){Round3.setVisible(true);}
        else if(r==4){Round4.setVisible(true);}
        }//set center only when card moved to location (500,370) that is of center
       
    }
    
    /*
     This function has 100 conditions and this function set card at location x,y of c=1 and it disappear card if c=2.
     */
    private void place_to_center(String check,int c,int x,int y)
    {
        
        if(check=="011")
        {
            if(c==1){
            R0.setLocation(x,y);    
            function(x, check, 1);
            }
            else if(c==2){R0.setVisible(false);}
        }
        else if(check=="111")
        {
            if(c==1){
            R1.setLocation(x,y);
                function(x, check, 1);}
             else if(c==2){R1.setVisible(false);}
        }
        else if(check=="211")
        {
            
            if(c==1){
            R2.setLocation(x,y);
            function(x, check, 1);
            }
             else if(c==2){R2.setVisible(false);}
        }
        else if(check=="311")
        {
            if(c==1){
            R3.setLocation(x,y);
            function(x, check, 1);
            }
             else if(c==2){R3.setVisible(false);}
        }
        else if(check=="411")
        {
            if(c==1){
            R4.setLocation(x,y);
            function(x, check, 1);
              }
             else if(c==2){R4.setVisible(false);}
        }
        else if(check=="511")
        {
            if(c==1){
            R5.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R5.setVisible(false);}
        }
        else if(check=="611")
        {
            if(c==1){
            R6.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R6.setVisible(false);}
        }
        else if(check=="711")
        {
            if(c==1){
            R7.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R7.setVisible(false);}
        }
        else if(check=="811")
        {
            if(c==1){
            R8.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R8.setVisible(false);}
        }
        else if(check=="911")
        {
            if(c==1){
            R9.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R9.setVisible(false);}
        }
        else if(check=="1011")
        {
            if(c==1){
            R_draw2.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R_draw2.setVisible(false);}
        }
        else if(check=="1111")//This is skip card
        {
            if(c==1){
               
            R_skip.setLocation(x,y);
            function(x, check, 1);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){R_skip.setVisible(false);}
        }
        else if(check=="1211")
        {
            if(c==1){
            R_rev.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R_rev.setVisible(false);}
        }
        else if(check=="112")
        {
            if(c==1){
            R12.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R12.setVisible(false);}
        }
        else if(check=="212")
        {
            if(c==1){
            R22.setLocation(x,y);
            function(x, check, 1);}
             else if(c==2){R22.setVisible(false);}
        }
        else if(check=="312"){
            if(c==1){
            R32.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R32.setVisible(false);}
        }
        else if(check=="412")
        {
            if(c==1){
            R42.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R42.setVisible(false);}
        }
        else if(check=="512")
        {
            if(c==1){
            R52.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R52.setVisible(false);}
        }
        else if(check=="612")
        {
            if(c==1){
            R62.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R62.setVisible(false);}
        }
        else if(check=="712")
        {
            if(c==1){
            R72.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R72.setVisible(false);}
        }
        else if(check=="812")
        {
            if(c==1){
            R82.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R82.setVisible(false);}
        }
        else if(check=="912")
        {
            if(c==1){
            R92.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R92.setVisible(false);}
        }
        else if(check=="1012")
        {
            if(c==1){
            R_draw22.setLocation(x ,y);
            function(x, check, 1);}
             else if(c==2){R_draw22.setVisible(false);}
        }
        else if(check=="1112")//This is skip card
        {
            if(c==1){
                
            R_skip2.setLocation(x ,y);
            function(x, check, 1);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
             skip=true;//Because center has skip card
            }
             else if(c==2){R_skip2.setVisible(false);}
        }
        else if(check=="1212")
        {
            if(c==1){
            R_rev2.setLocation(x ,y);
                function(x, check, 1);
            }
             else if(c==2){R_rev2.setVisible(false);}
        }
        else if(check=="021")
        {
             if(c==1){
            G0.setLocation(x ,y);
            function(x, check, 2);}
             else if(c==2){G0.setVisible(false);}
        }
        else if(check=="121")
        {
            if(c==1){
            G1.setLocation(x ,y);
            function(x, check, 2);}
             else if(c==2){
                G1.setVisible(false);}
        }
        else if(check=="221")
        {
            if(c==1){
            G2.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G2.setVisible(false);}
        }
        else if(check=="321")
        {
            if(c==1){
            G3.setLocation(x ,y);
            function(x, check, 2);}
             else if(c==2){
                
                G3.setVisible(false);}
        }
        else if(check=="421")
        {
            if(c==1){
            G4.setLocation(x ,y);
            function(x, check, 2);}
             else if(c==2){
                G4.setVisible(false);}
        }
        else if(check=="521")
        {
            if(c==1){
            G5.setLocation(x ,y);
            function(x, check, 2);}
             else if(c==2){
                
                G5.setVisible(false);}
        }
        else if(check=="621")
        {
            if(c==1){
            G6.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                
                G6.setVisible(false);}
        }
        else if(check=="721")
        {
            if(c==1){
            G7.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                 G7.setVisible(false);}
        }
        else if(check=="821")
        {
            if(c==1){
            G8.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                 G8.setVisible(false);}
        }
        else if(check=="921")
        {
            if(c==1){
            G9.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G9.setVisible(false);}
        }
        else if(check=="1021")
        {
            if(c==1){
            G_draw2.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G_draw2.setVisible(false);}
        }
        else if(check=="1121")
        {
            if(c==1){
                 
            G_skip.setLocation(x,y);
                function(x, check, 2);
                if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
                skip=true;//Because center has skip card
            }
             else if(c==2){
                G_skip.setVisible(false);}
        }
        else if(check=="1221")
        {
            if(c==1){
            G_rev.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G_rev.setVisible(false);}
        }
        else if(check=="122")
        {
            if(c==1){
            G12.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G12.setVisible(false);}
        }
        else if(check=="222")
        {
            if(c==1){
            G22.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G22.setVisible(false);}
        }
        else if(check=="322")
        {
            if(c==1){
            G32.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G32.setVisible(false);}
        }
        else if(check=="422")
        {
            if(c==1){
            G42.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G42.setVisible(false);}
        }
        else if(check=="522")
        {
            if(c==1){
            G52.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G52.setVisible(false);}
        }
        else if(check=="622")
        {
            if(c==1){
            G62.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G62.setVisible(false);}
        }
        else if(check=="722")
        {
            if(c==1){
            G72.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G72.setVisible(false);}
        }
        else if(check=="822")
        {
            if(c==1){
            G82.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G82.setVisible(false);}
        }
        else if(check=="922")
        {
            if(c==1){
            G92.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G92.setVisible(false);}
        }
        else if(check=="1022")
        {
            if(c==1){
            G_draw22.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G_draw22.setVisible(false);}
        }
        else if(check=="1122")
        {
            if(c==1){
                
            G_skip2.setLocation(x,y);
            function(x, check, 2);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){
                G_skip2.setVisible(false);}
        }
        else if(check=="1222")
        {
            if(c==1){
            G_rev2.setLocation(x,y);
            function(x, check, 2);}
             else if(c==2){
                G_rev2.setVisible(false);}
        }
        else if(check=="031")
        {
            if(c==1){
            B0.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B0.setVisible(false);}
        }
        else if(check=="131")
        {
            if(c==1){
            B1.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B1.setVisible(false);}
        }
        else if(check=="231")
        {
            if(c==1){
            B2.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B2.setVisible(false);}
        }
        else if(check=="331")
        {
            if(c==1){
            B3.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B3.setVisible(false);}
        }
        else if(check=="431")
        {
            if(c==1){
            B4.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B4.setVisible(false);}
        }
        else if(check=="531")
        {
            if(c==1){
            B5.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B5.setVisible(false);}
        }
        else if(check=="631")
        {
            if(c==1){
            B6.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B6.setVisible(false);}
        }
        else if(check=="731")
        {
            if(c==1){
            B7.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B7.setVisible(false);}
        }
        else if(check=="831")
        {
            if(c==1){
            B8.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B8.setVisible(false);}
        }
        else if(check=="931")
        {
            if(c==1){
            B9.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B9.setVisible(false);}
        }
        else if(check=="1031")
        {
            if(c==1){
            B_draw2.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B_draw2.setVisible(false);}
        }
        else if(check=="1131")
        {
            if(c==1){
                
            B_skip.setLocation(x,y);
            function(x, check, 3);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){
               B_skip.setVisible(false);}
        }
        else if(check=="1231")
        {
            if(c==1){
            B_rev.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B_rev.setVisible(false);}
        }
        else if(check=="132")
        {
            if(c==1){
            B12.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B12.setVisible(false);}
        }
        else if(check=="232")
        {
            if(c==1){
            B22.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B22.setVisible(false);}
        }
        else if(check=="332")
        {
            if(c==1){
            B32.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B32.setVisible(false);}
        }
        else if(check=="432")
        {
            if(c==1){
            B42.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
               B42.setVisible(false);}
        }
        else if(check=="532")
        {
            if(c==1){
            B52.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B52.setVisible(false);}
        }
        else if(check=="632")
        {
            if(c==1){
            B62.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B62.setVisible(false);}
        }
        else if(check=="732")
        {
            if(c==1){
            B72.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B72.setVisible(false);}
        }
        else if(check=="832")
        {
            if(c==1){
            B82.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B82.setVisible(false);}
        }
        else if(check=="932")
        {
            if(c==1){
            B92.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B92.setVisible(false);}
        }
        else if(check=="1032")
        {
            if(c==1){
            B_draw22.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B_draw22.setVisible(false);}
        }
        else if(check=="1132")
        {
            if(c==1){
            
            B_skip2.setLocation(x,y);
            function(x, check, 3);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){
                B_skip2.setVisible(false);}
        }
        else if(check=="1232")
        {
            if(c==1){
            B_rev2.setLocation(x,y);
            function(x, check, 3);}
             else if(c==2){
                B_rev2.setVisible(false);}
        }
        else if(check=="041")
        {
            if(c==1){
            Y0.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y0.setVisible(false);}
        }
        else if(check=="141")
        {
            if(c==1){
            Y1.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y1.setVisible(false);}
        }
        else if(check=="241")
        {
            if(c==1){
            Y2.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y2.setVisible(false);}
        }
        else if(check=="341")
        {
            if(c==1){
            Y3.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y3.setVisible(false);}
        }
        else if(check=="441")
        {
            if(c==1){
            Y4.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y4.setVisible(false);}
        }
        else if(check=="541")
        {
            if(c==1){
            Y5.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y5.setVisible(false);}
        }
        else if(check=="641")
        {
            if(c==1){
            Y6.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y6.setVisible(false);}
        }
        else if(check=="741")
        {
            if(c==1){
            Y7.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y7.setVisible(false);}
        }
        else if(check=="841")
        {
            if(c==1){
            Y8.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y8.setVisible(false);}
        }
        else if(check=="941")
        {
            if(c==1){
            Y9.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y9.setVisible(false);}
        }
        else if(check=="1041")
        {
            if(c==1){
            Y_draw2.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
               Y_draw2.setVisible(false);}
        }
        else if(check=="1141")
        {
            if(c==1){
               
            Y_skip.setLocation(x,y);
            function(x, check, 4);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){
               Y_skip.setVisible(false);}
        }
        else if(check=="1241")
        {
            if(c==1){
            Y_rev2.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
               Y_rev2.setVisible(false);}
        }
        else if(check=="142")
        {
            if(c==1){
            Y12.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
               Y12.setVisible(false);}
        }
        else if(check=="242")
        {
            if(c==1){
            Y22.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
               Y22.setVisible(false);}
        }
        else if(check=="342")
        {
            if(c==1){
            Y32.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
               Y32.setVisible(false);}
        }
        else if(check=="442")
        {
            if(c==1){
            Y42.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y42.setVisible(false);}
        }
        else if(check=="542")
        {
            if(c==1){
            Y52.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y52.setVisible(false);}
        }
        else if(check=="642")
        {
            if(c==1){
            Y62.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y62.setVisible(false);}
        }
        else if(check=="742")
        {
            if(c==1){
            Y72.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y72.setVisible(false);}
        }
        else if(check=="842")
        {
            if(c==1){
            Y82.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y82.setVisible(false);}
        }
        else if(check=="942")
        {
            if(c==1){
            Y92.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y92.setVisible(false);}
        }
        else if(check=="1042")
        {
            if(c==1){
            Y_draw22.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y_draw22.setVisible(false);}
        }
        else if(check=="1142")
        {
            if(c==1){
               
            Y_skip2.setLocation(x,y);
            function(x, check, 4);
            if(x==500)//Checking whether this function call for center or not.if x=500 means yes for center.
            skip=true;//Because center has skip card
            }
             else if(c==2){
                Y_skip2.setVisible(false);}
        }
        else if(check=="1242")
        {
            if(c==1){
            Y_rev2.setLocation(x,y);
            function(x, check, 4);}
             else if(c==2){
                Y_rev2.setVisible(false);}
        }
        
        ///////
        else if(check=="1001")
        {
            if(c==1){
             draw41.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            draw41.setVisible(false);
            }
        }
        
        else if(check=="1002")
        {
            if(c==1){
             draw42.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            draw42.setVisible(false);
            }
        }
    
        else if(check=="1003")
        {
            if(c==1){
             draw43.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            draw43.setVisible(false);
            }
        }
        else if(check=="1004")
        {
            if(c==1){
             draw44.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            draw44.setVisible(false);
            }
        }
        
        else if(check=="4401")  ///WILD
        {
            if(c==1){
             wild1.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            wild1.setVisible(false);
            }
        }
        else if(check=="4402")  ///WILD
        {
            if(c==1){
             wild2.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            wild2.setVisible(false);
            }
        }
        else if(check=="4403")  ///WILD
        {
            if(c==1){
             wild3.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            wild3.setVisible(false);
            }
        }
        else if(check=="4404")  ///WILD
        {
            if(c==1){
             wild4.setLocation(x, y);
            function(x, check, 0);
            }
            else if(c==2){
            wild4.setVisible(false);
            }
        }
    }
    // This function appear card, which is at index
    private void set_back1(int x,int y,int index)
    {
    
        if(index==0){card8.setVisible(true);}
        else if(index==1){card9.setVisible(true);}
        else if(index==2){card10.setVisible(true);}
        else if(index==3){card11.setVisible(true);}
        else if(index==4){card12.setVisible(true);}
        else if(index==5){card13.setVisible(true);}
        else if(index==6){card14.setVisible(true);}
        else if(index==7){e1.setLocation(x, y); e1.setVisible(true);}
        else if(index==8){e2.setLocation(x, y); e2.setVisible(true);}
        else if(index==9){e3.setLocation(x, y); e3.setVisible(true);}
        else if(index==10){e4.setLocation(x, y); e4.setVisible(true);}
        else if(index==11){e5.setLocation(x, y); e5.setVisible(true);}
        
    }
    
    // This function appear card, which is at index
    private void set_back2(int x,int y,int index)
    {
    
        if(index==0){card1.setVisible(true);}
        else if(index==1){card2.setVisible(true);}
        else if(index==2){card3.setVisible(true);}
        else if(index==3){card4.setVisible(true);}
        else if(index==4){card5.setVisible(true);}
        else if(index==5){card6.setVisible(true);}
        else if(index==6){card7.setVisible(true);}
        else if(index==7){e6.setLocation(x, y); e1.setVisible(true);}
        else if(index==8){e7.setLocation(x, y); e2.setVisible(true);}
        else if(index==9){e8.setLocation(x, y); e3.setVisible(true);}
        else if(index==10){e9.setLocation(x, y); e4.setVisible(true);}
        else if(index==11){e10.setLocation(x, y); e5.setVisible(true);}
        
    }
    
    // This function appear card, which is at index
    private void set_back3(int x,int y,int index)
    {
    
        if(index==0){card15.setVisible(true);}
        else if(index==1){card16.setVisible(true);}
        else if(index==2){card17.setVisible(true);}
        else if(index==3){card18.setVisible(true);}
        else if(index==4){card19.setVisible(true);}
        else if(index==5){card20.setVisible(true);}
        else if(index==6){card21.setVisible(true);}
        else if(index==7){e11.setLocation(x, y); e1.setVisible(true);}
        else if(index==8){e12.setLocation(x, y); e2.setVisible(true);}
        else if(index==9){e13.setLocation(x, y); e3.setVisible(true);}
        else if(index==10){e14.setLocation(x, y); e4.setVisible(true);}
        else if(index==11){e15.setLocation(x, y); e5.setVisible(true);}
        
    }
    
    private void com1()//Computer player 1
    {
        if(skip==false) //If it is not skip then do working
        {
            if(draw==true) // if it is draw card then pick 2 cards from deck
            {
                int count=0,c=0;
            Enumeration c1=computer1.elements();
            while(c1.hasMoreElements())
            {
                String t=(String) c1.nextElement();
                
            if(t=="0"&&c<2)//If it is empty index and moved cards are less than 2 then pick card
            {
                computer1.add(count, deck.firstElement());//insert a number from deck to computer 1's deck
                computer1.remove(0);//remove first element from deck
                set_back1(comp1x1[count], comp1y1[count], count); //Appear the back of card at index count
                c++; // Increase c to show that you have picked one card out of two 
                
            }
                count++;// Count index
            }
                
                draw=false;
            }
            else
            {
            boolean not_found=true;
        char dig1='0',cen_dig1='0',dig2='0',cen_dig2='0';//These characters are for comparison of the digits between Computer's current card and current card of the center
        
        
        
        int counter=0;char col_center='0';
        
       
        char arr[]=center.toCharArray();
        
        if(center.length()==3) //Read instruction.txt section:A attached
        {
            col_center=arr[1];
        }
        else if(center.length()==4) col_center=arr[2];//Color of the card, which is at center
        Enumeration E=computer1.elements();
        
        while(E.hasMoreElements())
        {
            counter++;//This counter is for deleting specific position
            char col_current = '0';
            String original=(String) E.nextElement();
            String rough=original;
            char temp[]=rough.toCharArray();//Current card
            if(center.length()==3){cen_dig1=arr[0];}
            else if(center.length()==4){cen_dig1=arr[0];cen_dig2=arr[1];}
            
            if(rough.length()==3){col_current= temp[1];dig1=temp[0];}
            else if(rough.length()==4) {col_current= temp[2];dig1=temp[0];dig2=temp[1];}
            
            if((col_current==col_center||(dig1==cen_dig1&&dig2==cen_dig2))&& original!="0")
            {
               not_found=false;
                place_to_center(center,2,0,0);//Hide back of card
                place_to_center(original,1,500,370);//1 means setlocation
                
                //Disappear back of card accordingly 
                if(counter==1){card8.setVisible(false);}
                else if(counter==2){card9.setVisible(false);}
                else if(counter==3){card10.setVisible(false);}
                else if(counter==4){card11.setVisible(false);}
                else if(counter==5){card12.setVisible(false);}
                else if(counter==6){card13.setVisible(false);}
                else if(counter==7){card14.setVisible(false);}
                computer1.remove(counter-1);//Remove the card
                computer1.add(counter-1, "0");//Insert 0 here as coming card can come here
             
                //Set round
                if(col_current=='1'){Round1.setVisible(true);}
                else if(col_current=='2'){Round2.setVisible(true);}
                else if(col_current=='3'){Round3.setVisible(true);}
                else if(col_current=='4'){Round4.setVisible(true);}
                
                break;
            
            }
            
        }
       
        if(not_found==true)  // now its time to pick card now, because you dont have any such card to play further
        {
            
            {
            
        String empty="0",element="0";
        int empty_index=-1;
        boolean Have_0=false;
        Enumeration vec=computer1.elements();
        while(vec.hasMoreElements()){
            empty_index++;
            empty=(String) vec.nextElement();
        if(empty=="0")//If we found empty index the place picked card overthere.
        {
        
        computer1.add(empty_index,element=deck.lastElement());
        computer1.remove(empty_index+1);
        deck.remove(element);
        set_back1(comp1x1[empty_index], comp1y1[empty_index],empty_index);
        Have_0=true;
        break;
        }
        
        }
        if(Have_0==false) //We have capacity of 12-cards, now its overflow you cant pick further cards
        {
            JOptionPane.showMessageDialog(this, "Dont Have Enough Space.", "Deck", JOptionPane.ERROR_MESSAGE);}
            
        }
        
        }
        
        
        //Winning decision 
        
        Enumeration E1=computer1.elements();
        int winC1=0;
                String temp=" ";
        while(E1.hasMoreElements())
        {
            temp=(String) E1.nextElement();
        if(temp=="0")//Checking empty indices
            winC1++;
        }
    if(winC1==12)//If they are 12 means computer 1 is winner
    {
        
       int c=JOptionPane.showConfirmDialog(this, "Do You Want To Play Again?", "Winner is Computer 1",0 , 3);
        dispose();
        if(c==0){
        Mianframe obj=new Mianframe();obj.main(array);}
        else System.exit(0);
    
    }
        
        }
        }
        else
        {
        skip=false;
        }
        Your_turn=true;
    
    }
    
    private void com2()//Computer player 2
    {
    if(skip==false)//If it is not skip then do working
        
        {
            if(draw==true) // if it is draw card then pick 2 cards from deck
    
            {
                int count=0,c=0;
            Enumeration c2=computer2.elements();
            while(c2.hasMoreElements())
            {
                String t=(String) c2.nextElement();
            if(t=="0"&&c<2)//If it is empty index and moved cards are less than 2 then pick card
            
            {
                computer2.add(count, deck.firstElement());//insert a number from deck to computer 2's deck
              
                computer2.remove(0);//remove first element from deck
                set_back2(comp2x1[count], comp2y1[count], count); //Appear the back of card at index count
               
                c++; // Increase c to show that you have picked one card out of two 
               
                
            }
                count++;// Count index
            }
                
                draw=false;
            }
            else
            {
        boolean not_found=true;
        char dig1='0',cen_dig1='0',dig2='0',cen_dig2='0';//These characters are for comparison of the digits between Computer's current card and current card of the center
        
        
        int counter=0;char col_center='0';
        char arr[]=center.toCharArray();
        if(center.length()==3) //Read instruction.txt section:A attached
        {
        col_center=arr[1];}
        else if(center.length()==4) col_center=arr[2];//Color of the card, which is at center
        Enumeration E=computer2.elements();
        
        while(E.hasMoreElements())
        {
            counter++;//This counter is for deleting specific position
            char col_current = '0';
            String original=(String) E.nextElement();
            String rough=original;
            char temp[]=rough.toCharArray();//Current card
            if(center.length()==3){cen_dig1=arr[0];}
            else if(center.length()==4){cen_dig1=arr[0];cen_dig2=arr[1];}
            
            if(rough.length()==3){col_current= temp[1];dig1=temp[0];}
            else if(rough.length()==4) {col_current= temp[2];dig1=temp[0];dig2=temp[1];}
            if((col_current==col_center||(dig1==cen_dig1&&dig2==cen_dig2)) && original!="0")
            {
               not_found=false;
                
                place_to_center(center,2,0,0);//Hide back of card
                place_to_center(original,1,500,370);//1 means setlocation
                //2 means hide center
                
                if(counter==1){card1.setVisible(false);}
                else if(counter==2){card2.setVisible(false);}
                else if(counter==3){card3.setVisible(false);}
                else if(counter==4){card4.setVisible(false);}
                else if(counter==5){card5.setVisible(false);}
                else if(counter==6){card6.setVisible(false);}
                else if(counter==7){card7.setVisible(false);}
                computer2.remove(counter-1);//Remove the card
                computer2.add(counter-1, "0");//Insert 0 here as coming card can come here
             
                if(col_current=='1'){Round1.setVisible(true);}
                else if(col_current=='2'){Round2.setVisible(true);}
                else if(col_current=='3'){Round3.setVisible(true);}
                else if(col_current=='4'){Round4.setVisible(true);}
                
                break;
            
            }
        }
        if(not_found==true) {
            
            {
        String empty="0",element="0";
        int empty_index=-1;
        boolean Have_0=false;
        Enumeration vec=computer2.elements();
        while(vec.hasMoreElements()){
            empty_index++;
            empty=(String) vec.nextElement();
        if(empty=="0")
        {
        
        computer2.add(empty_index,element=deck.lastElement());
        computer2.remove(empty_index+1);
        deck.remove(element);
        
        set_back2(comp2x1[empty_index], comp2y1[empty_index],empty_index);
        
        Have_0=true;
        break;
        }
        
        }
        //We have capacity of 12-cards, now its overflow you cant pick further cards
        
        if(Have_0==false){JOptionPane.showMessageDialog(this, "Dont Have Enough Space.", "Deck", JOptionPane.ERROR_MESSAGE);}
        }
        
        }
        //Winning decision 
        
        Enumeration E1=computer2.elements();
        int winC2=0;
                String temp=" ";
        while(E1.hasMoreElements()){
            temp=(String) E1.nextElement();
        if(temp=="0") //Checking empty indices
           
            winC2++;
        }
        
    if(winC2==12) //Winning decision, show message if computer 2 wins
    {
       int c=JOptionPane.showConfirmDialog(this, "Do You Want To Play Again?", "Winner is Computer 2",0 , 3);
        dispose();
        if(c==0){
        Mianframe obj=new Mianframe();obj.main(array);}
        else System.exit(0);
        
    }
          //Print
    
        }
        }
    else
        skip=false;
        Your_turn=true;
    
        
    }
    private void com3()
    {
    if(skip==false) //If it is not skip then do working
       
        {
            if(draw==true) // if it is draw card then pick 2 cards from deck
    
            {
                int count=0,c=0;
            Enumeration c3=computer3.elements();
            while(c3.hasMoreElements())
            {
                String t=(String) c3.nextElement();
            if(t=="0"&&c<2)//If it is empty index and moved cards are less than 2 then pick card
            
            {
                computer3.add(count, deck.firstElement()); //insert a number from deck to computer 3's deck
              
                computer3.remove(0); //remove first element from deck
                set_back3(comp3x1[count], comp3y1[count], count);//Appear the back of card at index count
               
                c++; // Increase c to show that you have picked one card out of two 
            
            }
                count++;// Count index
            }
                
                draw=false;
            }
            else
            {
        boolean not_found=true;
        char dig1='0',cen_dig1='0',dig2='0',cen_dig2='0';//These characters are for comparison of the digits between Computer's current card and current card of the center
        
        
        int counter=0;char col_center='0';
        
        char arr[]=center.toCharArray();
        if(center.length()==3){
        col_center=arr[1];}
        else if(center.length()==4) col_center=arr[2];//Color of the card, which is at center
        Enumeration E=computer3.elements();
        
        while(E.hasMoreElements())
        {
            counter++;//This counter is for deleting specific position
            char col_current = '0';
            String original=(String) E.nextElement();
            String rough=original;
            char temp[]=rough.toCharArray();//Current card
            if(center.length()==3){cen_dig1=arr[0];}
            else if(center.length()==4){cen_dig1=arr[0];cen_dig2=arr[1];}
            
            if(rough.length()==3){col_current= temp[1];dig1=temp[0];}
            else if(rough.length()==4) {col_current= temp[2];dig1=temp[0];dig2=temp[1];}
            if((col_current==col_center||(dig1==cen_dig1&&dig2==cen_dig2))&& original!="0")
            {
               not_found=false;
                
                place_to_center(center,2,0,0);//Hide back of card
                place_to_center(original,1,500,370);//1 means setlocation
                //2 means hide center
                
                if(counter==1){card15.setVisible(false);}
                else if(counter==2){card16.setVisible(false);}
                else if(counter==3){card17.setVisible(false);}
                else if(counter==4){card18.setVisible(false);}
                else if(counter==5){card19.setVisible(false);}
                else if(counter==6){card20.setVisible(false);}
                else if(counter==7){card21.setVisible(false);}
                computer3.remove(counter-1);//Remove the card
                computer3.add(counter-1, "0");//Insert 0 here as coming card can come here
             
                if(col_current=='1'){Round1.setVisible(true);}
                else if(col_current=='2'){Round2.setVisible(true);}
                else if(col_current=='3'){Round3.setVisible(true);}
                else if(col_current=='4'){Round4.setVisible(true);}
            break;
            
            }
        }
        if(not_found==true) {
        String empty="0",element="0";
        int empty_index=-1;
        boolean Have_0=false;
        Enumeration vec=computer3.elements();
        while(vec.hasMoreElements()){
            empty_index++;
            empty=(String) vec.nextElement();
        if(empty=="0")
        {
        
        computer3.add(empty_index,element=deck.lastElement());
        computer3.remove(empty_index+1);
        deck.remove(element);
       
        set_back3(comp3x1[empty_index], comp3y1[empty_index],empty_index);
        
        Have_0=true;
        break;
        }
        
        }
         //We have capacity of 12-cards, now its overflow you cant pick further cards
       
        if(Have_0==false){JOptionPane.showMessageDialog(this, "Dont Have Enough Space.", "Deck", JOptionPane.ERROR_MESSAGE);}
        }
        Enumeration E1=computer3.elements();
        int winC3=0;
                String temp=" ";
        while(E1.hasMoreElements()){
            temp=(String) E1.nextElement();
        if(temp=="0")//Checking empty indices
           
            winC3++;
        }
    if(winC3==12)//If they are 12 means computer 3 is winner
    
    { 
       int c=JOptionPane.showConfirmDialog(this, "Do You Want To Play Again?", "Winner is Computer 3",0 , 3);
        dispose();
        if(c==0){
        Mianframe obj=new Mianframe();obj.main(array);}
        else System.exit(0);
    }
          
        }
        }
    else
        skip=false;
        Your_turn=true;
    } 
    
    
    
    private void DeckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMousePressed
      
    }//GEN-LAST:event_DeckMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        SoundClipTest obj=new SoundClipTest(); //Sound object here
        
        this.setSize(1040, 768);
        this.setLocation(150, 0);
        Random rando=new Random();
        int a=rando.nextInt(107);
        
        //Computer 1
        card1.setLocation(comp2x1[0], comp2y1[0]);  ///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card2.setLocation(comp2x1[1], comp2y1[1]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card3.setLocation(comp2x1[2], comp2y1[2]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card4.setLocation(comp2x1[3], comp2y1[3]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card5.setLocation(comp2x1[4], comp2y1[4]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card6.setLocation(comp2x1[5], comp2y1[5]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        
        card7.setLocation(comp2x1[6], comp2y1[6]);///Place 7 cards initially
        computer1.add(deck.firstElement());
        deck.remove(0);
        computer1.add("0"); ///Place 4 cards 0 initially
        computer1.add("0");
        computer1.add("0");
        computer1.add("0");
        computer1.add("0");
        //Computer 2
        card8.setLocation(comp1x1[0], comp1y1[0]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        
        card9.setLocation(comp1x1[1], comp1y1[1]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        card10.setLocation(comp1x1[2],comp1y1[2]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        card11.setLocation(comp1x1[3], comp1y1[3]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        card12.setLocation(comp1x1[4], comp1y1[4]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        card13.setLocation(comp1x1[5], comp1y1[5]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        card14.setLocation(comp1x1[6], comp1y1[6]);///Place 7 cards initially
        computer2.add(deck.firstElement());
        deck.remove(0);
        computer2.add("0");///Place 4 cards 0 initially
        computer2.add("0");
        computer2.add("0");
        computer2.add("0");
        computer2.add("0");
        //Computer 3
        card15.setLocation(comp3x1[0], comp3y1[0]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card16.setLocation(comp3x1[1], comp3y1[1]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card17.setLocation(comp3x1[2], comp3y1[2]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card18.setLocation(comp3x1[3], comp3y1[3]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card19.setLocation(comp3x1[4], comp3y1[4]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card20.setLocation(comp3x1[5], comp3y1[5]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        card21.setLocation(comp3x1[6], comp3y1[6]);///Place 7 cards initially
        computer3.add(deck.firstElement());
        deck.remove(0);
        computer3.add("0");///Place 4 cards 0 initially
        computer3.add("0");
        computer3.add("0");
        computer3.add("0");
        computer3.add("0");
       
        //USER
        String x;
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[0], usery1[0]);
        
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[1], usery1[1]);
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[2], usery1[2]);
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[3], usery1[3]);
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[4], usery1[4]);
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[5], usery1[5]);
        
        user.add(x=deck.lastElement());///Place 7 cards initially
        deck.remove(x);
        place_to_center(x,1,userx1[6], usery1[6]);
        
        user.add("0");///Place 4 cards 0 initially
        user.add("0");
        user.add("0");
        user.add("0");
        user.add("0");
        
    }//GEN-LAST:event_formWindowOpened

    
    //This function is to check whether the clicked card should move or not
    private boolean mouse_pressed(String cntr,int round)
    {
        
        skip=false;
        Enumeration num = user.elements();
        int index=0;
         boolean move=false;
        if(Your_turn==true)
        {
            char color='0',digit1='0',digit2='0',center_col='0',center_digit1='0',center_digit2='0';
        char[] temarr=cntr.toCharArray();
        char[] cen=center.toCharArray();
        
        if(cntr.length()==3){color=temarr[1];digit1=temarr[0];}
        else if(cntr.length()==4){color=temarr[2];digit1=cen[0];digit2=cen[1];}
        
        if(center.length()==3){center_col=cen[1];center_digit1=cen[0];}
        else if(center.length()==4){center_col=cen[2];center_digit1=cen[0];center_digit2=cen[1];}
        
        if(center_col==color||(digit1==center_digit1&&digit2==center_digit2))
        {
            move=true;
        place_to_center(center, 2,0,0);
        center=cntr;
        
        if(temarr[0]=='1'&&temarr[1]=='0'){draw=true;}
        
        for(int c=0;c<7;c++)
        {
            if(num.nextElement()==center)
            {
            index=c;
            }
        }
        user.remove(index);
        user.add(index, "0");
        num=user.elements();
      
        if(round==1){Round1.setVisible(true);}
        else if(round==2){Round2.setVisible(true);}
        else if(round==3){Round3.setVisible(true);}
        else if(round==4){Round4.setVisible(true);}
       
        new thread1().start();//Calling other computers
        
        }
        
    }
        // winning decision
        int zero=0;
         for(int check=0;check<12;check++)
        {
            if(num.nextElement()=="0") 
                zero++;
        }
        
        if(zero==12)
        {
            
            int c=JOptionPane.showConfirmDialog(this, "YOU WIN!", "Do you want to play again?",0 , 3);
           dispose();//To close previous jFrame
        
           if(c==0)//If yes 
           {
        Mianframe obj=new Mianframe();obj.main(array);}//Restart game
        else System.exit(0);//Close game
        }
        else{
            
        if(move==true) Your_turn=false;
        }
        
        return (move==true) ?true:false;
}
    private void R0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R0MousePressed

        boolean check=mouse_pressed("011", 1);
        if(check==true){R0.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R0MousePressed

    private void R1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R1MousePressed
        boolean check=mouse_pressed("111", 1); 
         if(check==true){R1.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R1MousePressed

    private void R2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R2MousePressed
    
        
        boolean check=mouse_pressed("211", 1);
        if(check==true){R2.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R2MousePressed

    private void R3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R3MousePressed
        
        boolean check=mouse_pressed("311", 1);
        if(check==true){R3.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R3MousePressed

    private void R4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R4MousePressed

        boolean check=mouse_pressed("411", 1);
        if(check==true){R4.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R4MousePressed

    private void R5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R5MousePressed

       boolean check=mouse_pressed("511", 1);
        if(check==true){R5.setLocation(500, 370);Your_turn=false;}
    }//GEN-LAST:event_R5MousePressed

    private void R6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R6MousePressed

        boolean check=mouse_pressed("611", 1);
        if(check==true){R6.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R6MousePressed

    private void R7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R7MousePressed

        boolean check=mouse_pressed("711", 1);
        if(check==true){R7.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R7MousePressed

    private void R8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R8MousePressed
   
        boolean check=mouse_pressed("811", 1);
        if(check==true){R8.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R8MousePressed

    private void R9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R9MousePressed

        boolean check=mouse_pressed("911", 1);
        if(check==true){R9.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R9MousePressed

    private void R_skipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_skipMousePressed

        boolean check=mouse_pressed("1111", 1);
        if(check==true){R_skip.setLocation(500, 370);Your_turn=false;skip=true;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R_skipMousePressed

    private void R_draw2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_draw2MousePressed

        boolean check=mouse_pressed("1011", 1);
        if(check==true){R_draw2.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R_draw2MousePressed

    private void R_revMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_revMousePressed

        boolean check=mouse_pressed("1211", 1);
        if(check==true){R_rev.setLocation(500, 370);Your_turn=false;}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_R_revMousePressed

    private void R12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R12MousePressed

        boolean check=mouse_pressed("112", 1);
        if(check==true){R12.setLocation(500, 370);Your_turn=false;}
        // TODO add your handling code here:
    }//GEN-LAST:event_R12MousePressed

    private void R22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R22MousePressed

        boolean check=mouse_pressed("212", 1);
        if(check==true){R22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R22MousePressed

    private void R32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R32MousePressed

        boolean check=mouse_pressed("312", 1);
        if(check==true){R32.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R32MousePressed

    
    private void G3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G3MousePressed
        
        boolean check=mouse_pressed("321", 2);
        if(check==true){G3.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G3MousePressed

    private void R42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R42MousePressed

        boolean check=mouse_pressed("412", 1);
        if(check==true){R42.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R42MousePressed

    private void R52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R52MousePressed

       boolean check=mouse_pressed("512", 1);
        if(check==true){R52.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R52MousePressed

    private void R62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R62MousePressed

      boolean check=mouse_pressed("612", 1);
        if(check==true){R62.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R62MousePressed

    private void R72MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R72MousePressed

       boolean check=mouse_pressed("712", 1);
        if(check==true){R72.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R72MousePressed

    private void R82MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R82MousePressed

        boolean check=mouse_pressed("812", 1);
        if(check==true){R82.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R82MousePressed

    private void R92MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R92MousePressed
       
        boolean check=mouse_pressed("912", 1);
        if(check==true){R92.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R92MousePressed

    private void R_skip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_skip2MousePressed

        boolean check=mouse_pressed("1112", 1);
        if(check==true){R_skip2.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_R_skip2MousePressed

    private void R_draw22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_draw22MousePressed

        
        boolean check=mouse_pressed("1012", 1);
        if(check==true){R_draw22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R_draw22MousePressed

    private void R_rev2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_rev2MousePressed

        boolean check=mouse_pressed("1212", 1);
        if(check==true){R_rev2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_R_rev2MousePressed

    private void G0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G0MousePressed

        boolean check=mouse_pressed("021", 2);
        if(check==true){G0.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G0MousePressed

    private void G1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G1MousePressed
    
       boolean check=mouse_pressed("121", 2);
        if(check==true){G1.setLocation(500, 370);Your_turn=false;} // TODO add your handling code here:
    }//GEN-LAST:event_G1MousePressed

    private void G2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MousePressed

        boolean check=mouse_pressed("221", 2);
        if(check==true){G2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G2MousePressed

    private void G4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G4MousePressed

        boolean check=mouse_pressed("421", 2);
        if(check==true){G4.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G4MousePressed

    private void G5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G5MousePressed

        boolean check=mouse_pressed("521", 2);
        if(check==true){G5.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G5MousePressed

    private void G6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G6MousePressed

        boolean check=mouse_pressed("621", 2);
        if(check==true){G6.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G6MousePressed

    private void G7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G7MousePressed

        boolean check=mouse_pressed("721", 2);
        if(check==true){G7.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G7MousePressed

    private void G8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G8MousePressed
    
        boolean check=mouse_pressed("821", 2);
        if(check==true){G8.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G8MousePressed

    private void G9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G9MousePressed

        boolean check=mouse_pressed("921", 2);
        if(check==true){G9.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G9MousePressed

    private void G_skipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_skipMousePressed

        boolean check=mouse_pressed("1121", 2);
        if(check==true){G_skip.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_G_skipMousePressed

    private void G_draw2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_draw2MousePressed

        boolean check=mouse_pressed("1021", 2);
        if(check==true){G_draw2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G_draw2MousePressed

    private void G_revMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_revMousePressed

        boolean check=mouse_pressed("1221", 2);
        if(check==true){G_rev.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G_revMousePressed

    private void G12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G12MousePressed

        boolean check=mouse_pressed("122", 2);
        if(check==true){G12.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G12MousePressed

    private void G22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G22MousePressed

        boolean check=mouse_pressed("222", 2);
        if(check==true){G22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G22MousePressed

    private void G32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G32MousePressed

        boolean check=mouse_pressed("322", 2);
        if(check==true){G32.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G32MousePressed

    private void G42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G42MousePressed

         boolean check=mouse_pressed("422", 2);
        if(check==true){G42.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G42MousePressed

    private void G52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G52MousePressed

         boolean check=mouse_pressed("522", 2);
        if(check==true){G52.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G52MousePressed

    private void G62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G62MousePressed

         boolean check=mouse_pressed("622", 2);
        if(check==true){G62.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G62MousePressed

    private void G72MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G72MousePressed

        boolean check=mouse_pressed("722", 2);
        if(check==true){G72.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G72MousePressed

    private void G82MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G82MousePressed

         boolean check=mouse_pressed("822", 2);
        if(check==true){G82.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G82MousePressed

    private void G92MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G92MousePressed

         boolean check=mouse_pressed("922", 2);
        if(check==true){G92.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G92MousePressed

    private void G_skip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_skip2MousePressed

         boolean check=mouse_pressed("1122", 2);
        if(check==true){G_skip2.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_G_skip2MousePressed

    private void G_draw22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_draw22MousePressed

         boolean check=mouse_pressed("1022", 2);
        if(check==true){G_draw22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G_draw22MousePressed

    private void G_rev2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_rev2MousePressed

         boolean check=mouse_pressed("1222", 2);
        if(check==true){G_rev2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_G_rev2MousePressed

    private void B0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B0MousePressed

         boolean check=mouse_pressed("031", 3);
        if(check==true){B0.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B0MousePressed

    private void B1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MousePressed
    
         boolean check=mouse_pressed("131", 3);
        if(check==true){B1.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B1MousePressed

    private void B2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MousePressed

         boolean check=mouse_pressed("231", 3);
        if(check==true){B2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B2MousePressed

    private void B3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MousePressed

         boolean check=mouse_pressed("331", 3);
        if(check==true){B3.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B3MousePressed

    private void B4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MousePressed

        boolean check=mouse_pressed("431", 3);
        if(check==true){B4.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B4MousePressed

    private void B5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MousePressed

         boolean check=mouse_pressed("531", 3);
        if(check==true){B5.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B5MousePressed

    private void B6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MousePressed

        boolean check=mouse_pressed("631", 3);
        if(check==true){B6.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B6MousePressed

    private void B7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MousePressed

        boolean check=mouse_pressed("731", 3);
        if(check==true){B7.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B7MousePressed

    private void B8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MousePressed

        boolean check=mouse_pressed("831", 3);
        if(check==true){B8.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B8MousePressed

    private void B9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MousePressed

        boolean check=mouse_pressed("931", 3);
        if(check==true){B9.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B9MousePressed

    private void B_skipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_skipMousePressed

        boolean check=mouse_pressed("1131", 3);
        if(check==true){B_skip.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_B_skipMousePressed

    private void B_draw2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_draw2MousePressed

        boolean check=mouse_pressed("1031", 3);
        if(check==true){B_draw2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B_draw2MousePressed

    private void B_revMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_revMousePressed
    
        boolean check=mouse_pressed("1231", 3);
        if(check==true){B_rev.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B_revMousePressed

    private void B12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B12MousePressed

        boolean check=mouse_pressed("132", 3);
        if(check==true){B12.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B12MousePressed

    private void B22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B22MousePressed

        boolean check=mouse_pressed("232", 3);
        if(check==true){B22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B22MousePressed

    private void B32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B32MousePressed

        boolean check=mouse_pressed("332", 3);
        if(check==true){B32.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B32MousePressed

    private void B42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B42MousePressed

        boolean check=mouse_pressed("432", 3);
        if(check==true){B42.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B42MousePressed

    private void B52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B52MousePressed

        boolean check=mouse_pressed("532", 3);
        if(check==true){B52.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B52MousePressed

    private void B62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B62MousePressed

        boolean check=mouse_pressed("632", 3);
        if(check==true){B62.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B62MousePressed

    private void B72MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B72MousePressed

        boolean check=mouse_pressed("732", 3);
        if(check==true){B72.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B72MousePressed

    private void B82MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B82MousePressed

        boolean check=mouse_pressed("832", 3);
        if(check==true){B82.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B82MousePressed

    private void B92MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B92MousePressed

        boolean check=mouse_pressed("932", 3);
        if(check==true){B92.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B92MousePressed

    private void B_skip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_skip2MousePressed

        boolean check=mouse_pressed("1132", 3);
        if(check==true){B_skip2.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_B_skip2MousePressed

    private void B_draw22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_draw22MousePressed

        boolean check=mouse_pressed("1032", 3);
        if(check==true){B_draw22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B_draw22MousePressed

    private void B_rev2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_rev2MousePressed

        boolean check=mouse_pressed("1232", 3);
        if(check==true){B_rev2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_B_rev2MousePressed

    private void Y0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y0MousePressed

        boolean check=mouse_pressed("041", 4);
        if(check==true){Y0.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y0MousePressed

    private void Y1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y1MousePressed

        boolean check=mouse_pressed("141", 4);
        if(check==true){Y1.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y1MousePressed

    private void Y2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y2MousePressed
    
        boolean check=mouse_pressed("241", 4);
        if(check==true){Y2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y2MousePressed

    private void Y3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y3MousePressed

        boolean check=mouse_pressed("341", 4);
        if(check==true){Y3.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y3MousePressed

    private void Y4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y4MousePressed

        boolean check=mouse_pressed("441", 4);
        if(check==true){Y4.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y4MousePressed

    private void Y5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y5MousePressed

        boolean check=mouse_pressed("541", 4);
        if(check==true){Y5.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y5MousePressed

    private void Y6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y6MousePressed

        boolean check=mouse_pressed("641", 4);
        if(check==true){Y6.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y6MousePressed

    private void Y7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y7MousePressed

        boolean check=mouse_pressed("741", 4);
        if(check==true){Y7.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y7MousePressed

    private void Y8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y8MousePressed

        boolean check=mouse_pressed("841", 4);
        if(check==true){Y8.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y8MousePressed

    private void Y9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y9MousePressed

        boolean check=mouse_pressed("941", 4);
        if(check==true){Y9.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y9MousePressed

    private void Y_skipMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_skipMousePressed

        boolean check=mouse_pressed("1141", 4);
        if(check==true){Y_skip.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_skipMousePressed

    private void Y_draw2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_draw2MousePressed

        boolean check=mouse_pressed("1141", 4);
        if(check==true){Y_draw2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_draw2MousePressed

    private void Y_revMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_revMousePressed

        boolean check=mouse_pressed("1241", 4);
        if(check==true){Y_rev.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_revMousePressed

    private void Y12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y12MousePressed

        boolean check=mouse_pressed("142", 4);
        if(check==true){Y12.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y12MousePressed

    private void Y22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y22MousePressed

        boolean check=mouse_pressed("242", 4);
        if(check==true){Y22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y22MousePressed

    private void Y32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y32MousePressed

        boolean check=mouse_pressed("342", 4);
        if(check==true){Y32.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y32MousePressed

    private void Y42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y42MousePressed

        boolean check=mouse_pressed("442", 4);
        if(check==true){Y42.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y42MousePressed

    private void Y52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y52MousePressed

        boolean check=mouse_pressed("542", 4);
        if(check==true){Y52.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y52MousePressed

    private void Y62MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y62MousePressed

        boolean check=mouse_pressed("642", 4);
        if(check==true){Y62.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y62MousePressed

    private void Y72MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y72MousePressed

        boolean check=mouse_pressed("742", 4);
        if(check==true){Y72.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y72MousePressed

    private void Y82MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y82MousePressed

        boolean check=mouse_pressed("842", 4);
        if(check==true){Y82.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y82MousePressed

    private void Y92MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y92MousePressed

        boolean check=mouse_pressed("942", 4);
        if(check==true){Y92.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y92MousePressed

    private void Y_skip2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_skip2MousePressed

        boolean check=mouse_pressed("1142", 4);
        if(check==true){Y_skip2.setLocation(500, 370);Your_turn=false;skip=true;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_skip2MousePressed

    private void Y_draw22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_draw22MousePressed

        boolean check=mouse_pressed("1042", 4);
        if(check==true){Y_draw22.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_draw22MousePressed

    private void Y_rev2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_rev2MousePressed

        boolean check=mouse_pressed("1242", 4);
        if(check==true){Y_rev2.setLocation(500, 370);Your_turn=false;}// TODO add your handling code here:
    }//GEN-LAST:event_Y_rev2MousePressed

    private void draw41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw41MousePressed
        
        draw41.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_draw41MousePressed

    private void draw42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw42MousePressed
        
        draw42.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_draw42MousePressed

    private void draw43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw43MousePressed
        
        draw43.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_draw43MousePressed

    private void draw44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw44MousePressed
        
        draw44.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_draw44MousePressed

    private void wild1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wild1MousePressed

        wild1.setLocation(500, 370);
        initRounds();
      // TODO add your handling code here:
    }//GEN-LAST:event_wild1MousePressed

    private void wild2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wild2MousePressed

        wild2.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_wild2MousePressed

    private void wild3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wild3MousePressed

        wild3.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_wild3MousePressed

    private void wild4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wild4MousePressed

        wild4.setLocation(500, 370);
        initRounds();// TODO add your handling code here:
    }//GEN-LAST:event_wild4MousePressed

    private void manuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manuKeyPressed
    }//GEN-LAST:event_manuKeyPressed

    private void manuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuMousePressed

    }//GEN-LAST:event_manuMousePressed

    private void DeckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMouseEntered

        //Animation on deck of cards
        if(Deck.isFocusable()){
        Deck.setVisible(false);
          real_deck.setVisible(true);
        real_deck.setFocusable(false);
        Deck.setFocusable(false);}
    }//GEN-LAST:event_DeckMouseEntered

    private void DeckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeckMouseExited
    
    }//GEN-LAST:event_DeckMouseExited

    //This function is for small animation.
    private void real_deckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_real_deckMouseExited

        real_deck.setVisible(false);
        Deck.setVisible(true);
        Deck.setFocusable(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_real_deckMouseExited

    //Mouse pressed then pick card and place that at empty space.
    private void real_deckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_real_deckMousePressed

        if(Your_turn==true){
            skip=false;
        String empty="0",element="0";
        int empty_index=-1;
        boolean Have_0=false;
        Enumeration vec=user.elements();
        while(vec.hasMoreElements()){
            empty_index++;
            empty=(String) vec.nextElement();
        if(empty=="0")
        {
        
        user.add(empty_index,element=deck.lastElement());
        user.remove(empty_index+1);
        deck.remove(element);
        place_to_center(element, 1, userx1[empty_index], usery1[empty_index]);
        Have_0=true;
        Your_turn=false;
        new thread1().start();//Calling other computers
        break;
        }
        
        }
        
      //If you have 12 cards already then no picking of cards
        if(Have_0==false){JOptionPane.showMessageDialog(this, "Dont Have Enough Space.", "Deck", JOptionPane.ERROR_MESSAGE);}
        }
        skip=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_real_deckMousePressed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mianframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mianframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mianframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mianframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Mianframe().setVisible(true);
            }
        });
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B0;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B12;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B22;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B32;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B42;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B52;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B62;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B72;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B82;
    private javax.swing.JLabel B9;
    private javax.swing.JLabel B92;
    private javax.swing.JLabel B_draw2;
    private javax.swing.JLabel B_draw22;
    private javax.swing.JLabel B_rev;
    private javax.swing.JLabel B_rev2;
    private javax.swing.JLabel B_skip;
    private javax.swing.JLabel B_skip2;
    private javax.swing.JLabel Deck;
    private javax.swing.JLabel G0;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G12;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G22;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G32;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G42;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G52;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel G62;
    private javax.swing.JLabel G7;
    private javax.swing.JLabel G72;
    private javax.swing.JLabel G8;
    private javax.swing.JLabel G82;
    private javax.swing.JLabel G9;
    private javax.swing.JLabel G92;
    private javax.swing.JLabel G_draw2;
    private javax.swing.JLabel G_draw22;
    private javax.swing.JLabel G_rev;
    private javax.swing.JLabel G_rev2;
    private javax.swing.JLabel G_skip;
    private javax.swing.JLabel G_skip2;
    private javax.swing.JLabel R0;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R12;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R22;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R32;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel R42;
    private javax.swing.JLabel R5;
    private javax.swing.JLabel R52;
    private javax.swing.JLabel R6;
    private javax.swing.JLabel R62;
    private javax.swing.JLabel R7;
    private javax.swing.JLabel R72;
    private javax.swing.JLabel R8;
    private javax.swing.JLabel R82;
    private javax.swing.JLabel R9;
    private javax.swing.JLabel R92;
    private javax.swing.JLabel R_draw2;
    private javax.swing.JLabel R_draw22;
    private javax.swing.JLabel R_rev;
    private javax.swing.JLabel R_rev2;
    private javax.swing.JLabel R_skip;
    private javax.swing.JLabel R_skip2;
    private javax.swing.JLabel Round1;
    private javax.swing.JLabel Round2;
    private javax.swing.JLabel Round3;
    private javax.swing.JLabel Round4;
    private javax.swing.JLabel Y0;
    private javax.swing.JLabel Y1;
    private javax.swing.JLabel Y12;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel Y22;
    private javax.swing.JLabel Y3;
    private javax.swing.JLabel Y32;
    private javax.swing.JLabel Y4;
    private javax.swing.JLabel Y42;
    private javax.swing.JLabel Y5;
    private javax.swing.JLabel Y52;
    private javax.swing.JLabel Y6;
    private javax.swing.JLabel Y62;
    private javax.swing.JLabel Y7;
    private javax.swing.JLabel Y72;
    private javax.swing.JLabel Y8;
    private javax.swing.JLabel Y82;
    private javax.swing.JLabel Y9;
    private javax.swing.JLabel Y92;
    private javax.swing.JLabel Y_draw2;
    private javax.swing.JLabel Y_draw22;
    private javax.swing.JLabel Y_rev;
    private javax.swing.JLabel Y_rev2;
    private javax.swing.JLabel Y_skip;
    private javax.swing.JLabel Y_skip2;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card10;
    private javax.swing.JLabel card11;
    private javax.swing.JLabel card12;
    private javax.swing.JLabel card13;
    private javax.swing.JLabel card14;
    private javax.swing.JLabel card15;
    private javax.swing.JLabel card16;
    private javax.swing.JLabel card17;
    private javax.swing.JLabel card18;
    private javax.swing.JLabel card19;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card20;
    private javax.swing.JLabel card21;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JLabel draw41;
    private javax.swing.JLabel draw42;
    private javax.swing.JLabel draw43;
    private javax.swing.JLabel draw44;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e10;
    private javax.swing.JLabel e11;
    private javax.swing.JLabel e12;
    private javax.swing.JLabel e13;
    private javax.swing.JLabel e14;
    private javax.swing.JLabel e15;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JLabel e8;
    private javax.swing.JLabel e9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel manu;
    private javax.swing.JLabel real_deck;
    private javax.swing.JLabel wild1;
    private javax.swing.JLabel wild2;
    private javax.swing.JLabel wild3;
    private javax.swing.JLabel wild4;
    // End of variables declaration//GEN-END:variables
}