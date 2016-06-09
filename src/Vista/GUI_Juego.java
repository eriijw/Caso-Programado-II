/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Hilos.Hilo;
import javax.swing.JOptionPane;

/**
 *
 * @author Erika
 */
public class GUI_Juego extends javax.swing.JFrame {

   String estado="En el suelo"; 
   Hilo hilo;
   GUI_Perdida ventanaPerdida;
   int puntuacion;
   
    public GUI_Juego() {
        initComponents();
        this.setLocation(500,100);
        hilo=new Hilo(this);
        hilo.start();
        
       //this.jt_Tiempo.setText("Tiempo: "+cronometro);
       //this.jt_Tiempo.setEditable(false);

    }
    
      public void moverFondo()
    {
       if(jl_FondoJuego.getX()>-5000)
       {
        jl_FondoJuego.setLocation(jl_FondoJuego.getX()-3,jl_FondoJuego.getY());
       }
       else
       {
           jl_FondoJuego.setLocation(0,jl_FondoJuego.getY());
       }

    }

    public void verificarEstado()
    {
        if(estado.equals("subiendo"))
        {
            jl_Bubbles.setLocation(jl_Bubbles.getX(),jl_Bubbles.getY()-5);
        }
        if(jl_Bubbles.getY()<50)
        {
            estado="bajando";
        }
        if(estado.equals("bajando"))
        {
             jl_Bubbles.setLocation(jl_Bubbles.getX(),jl_Bubbles.getY()+5);
   
        }
        if(jl_Bubbles.getY()==290)
        {
            estado="en el suelo";
        }
    }
    
     public void moverObstaculo()
    {
      if(jl_Burbuja1.getX()>-850)
       {
        jl_Burbuja1.setLocation(jl_Burbuja1.getX()-5,jl_Burbuja1.getY());
       }
       else
       {
           jl_Burbuja1.setLocation(1000,jl_Burbuja1.getY());
       }   
    }
     
       public void moverObstaculo2()
    {
      if(jl_Burbuja2.getX()>-1100)
       {
        jl_Burbuja2.setLocation(jl_Burbuja2.getX()-5,jl_Burbuja2.getY());
       }
       else
       {
           jl_Burbuja2.setLocation(1000,jl_Burbuja2.getY());
       }   
    }
       
       public void moverObstaculo3()
    {
      if(jl_Burbuja3.getX()>-1600)
       {
        jl_Burbuja3.setLocation(jl_Burbuja3.getX()-5,jl_Burbuja3.getY());
       }
       else
       {
           jl_Burbuja3.setLocation(1000,jl_Burbuja3.getY());
       }   
    }
       
          public void moverObstaculo4()
    {
      if(jl_Burbuja4.getX()>-1000)
       {
        jl_Burbuja4.setLocation(jl_Burbuja4.getX()-5,jl_Burbuja4.getY());
       }
       else
       {
           jl_Burbuja4.setLocation(1000,jl_Burbuja4.getY());
       }   
    }
     
     
     
       public void colision()
    {

        if(jl_Bubbles.getX()+50>jl_Burbuja1.getX() && jl_Burbuja1.getX()+70>jl_Bubbles.getX() && jl_Bubbles.getY()+50>jl_Burbuja1.getY() && jl_Burbuja1.getY()+45>jl_Bubbles.getY())
        {                
            ventanaPerdida=new GUI_Perdida();
            ventanaPerdida.setJt_Puntaje(getPuntuacion());
            ventanaPerdida.setVisible(true);
            hilo.interrupt();   
        }
        
        if(jl_Bubbles.getX()+50>jl_Burbuja2.getX() && jl_Burbuja2.getX()+70>jl_Bubbles.getX() && jl_Bubbles.getY()+50>jl_Burbuja2.getY() && jl_Burbuja2.getY()+45>jl_Bubbles.getY())
        {
            ventanaPerdida=new GUI_Perdida();
            ventanaPerdida.setJt_Puntaje(getPuntuacion());
            ventanaPerdida.setVisible(true);
            hilo.interrupt();   
        }
        if(jl_Bubbles.getX()+50>jl_Burbuja3.getX() && jl_Burbuja3.getX()+70>jl_Bubbles.getX() && jl_Bubbles.getY()+50>jl_Burbuja3.getY() && jl_Burbuja3.getY()+45>jl_Bubbles.getY())
        {
            ventanaPerdida=new GUI_Perdida();
            ventanaPerdida.setJt_Puntaje(getPuntuacion());
            ventanaPerdida.setVisible(true);
            hilo.interrupt();   
        }
         if(jl_Bubbles.getX()+50>jl_Burbuja4.getX() && jl_Burbuja4.getX()+70>jl_Bubbles.getX() && jl_Bubbles.getY()+50>jl_Burbuja4.getY() && jl_Burbuja4.getY()+45>jl_Bubbles.getY())
        {
            ventanaPerdida=new GUI_Perdida();
            ventanaPerdida.setJt_Puntaje(getPuntuacion());
            ventanaPerdida.setVisible(true);
            hilo.interrupt();   
        }

        
        else
        {
           puntuacion+=1; 
             jl_Puntaje.setText("Puntaje: "+puntuacion);
        }

    }
       
       public int getPuntuacion()
       {
           return this.puntuacion;
       }
       
      /*
       public boolean cronometro()
    {
        cronometro-=1;
        this.jt_Tiempo.setText("Tiempo: "+cronometro);
        
        if (cronometro==0)
        {
            victoria=true;
            setVisible(false);
        }
        return isVictoria();
    }//Fin del método cronómetro
       
       public boolean isVictoria() 
       {
        return victoria;
    }
       */
   
  
    
     
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Bubbles = new javax.swing.JLabel();
        jl_Burbuja1 = new javax.swing.JLabel();
        jl_Puntaje = new javax.swing.JLabel();
        jl_Burbuja2 = new javax.swing.JLabel();
        jl_Burbuja3 = new javax.swing.JLabel();
        jl_Burbuja4 = new javax.swing.JLabel();
        jl_FondoJuego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 760));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jl_Bubbles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/output_Q3iCBF.gif"))); // NOI18N
        getContentPane().add(jl_Bubbles);
        jl_Bubbles.setBounds(290, 380, 100, 80);

        jl_Burbuja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bubblees2-01.png"))); // NOI18N
        getContentPane().add(jl_Burbuja1);
        jl_Burbuja1.setBounds(1180, 280, 60, 50);

        jl_Puntaje.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jl_Puntaje.setForeground(new java.awt.Color(240, 240, 240));
        jl_Puntaje.setText("000");
        getContentPane().add(jl_Puntaje);
        jl_Puntaje.setBounds(10, 20, 170, 40);

        jl_Burbuja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bubblees2-01.png"))); // NOI18N
        getContentPane().add(jl_Burbuja2);
        jl_Burbuja2.setBounds(1370, 30, 50, 50);

        jl_Burbuja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bubblees2-01.png"))); // NOI18N
        getContentPane().add(jl_Burbuja3);
        jl_Burbuja3.setBounds(1480, 200, 50, 50);

        jl_Burbuja4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bubblees2-01.png"))); // NOI18N
        getContentPane().add(jl_Burbuja4);
        jl_Burbuja4.setBounds(1740, 280, 50, 50);

        jl_FondoJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-01.png"))); // NOI18N
        getContentPane().add(jl_FondoJuego);
        jl_FondoJuego.setBounds(0, 0, 6020, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         // System.out.println(""+evt.getKeyCode());
        
        if(evt.getKeyCode()==32)
        {
            estado="subiendo";
        } 
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Bubbles;
    private javax.swing.JLabel jl_Burbuja1;
    private javax.swing.JLabel jl_Burbuja2;
    private javax.swing.JLabel jl_Burbuja3;
    private javax.swing.JLabel jl_Burbuja4;
    private javax.swing.JLabel jl_FondoJuego;
    private javax.swing.JLabel jl_Puntaje;
    // End of variables declaration//GEN-END:variables
}
