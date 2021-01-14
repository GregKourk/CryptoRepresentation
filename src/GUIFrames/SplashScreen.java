package GUIFrames;

import java.awt.*;
import javax.swing.*;


public class SplashScreen extends JWindow implements Runnable {
    
    private final int duration;
    Thread t;

    public SplashScreen(int d) {
        duration = d;
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {  

        //Δημιουργία πάνελ 
        JPanel splash = new JPanel();
        splash.setBackground(Color.white);
        setSize(200, 150);
        setLocationRelativeTo(null);

        JLabel msg = new JLabel("              RepCrypt is now starting                    ");
        JLabel msg2 = new JLabel("                                                          ");
        JLabel msg3 = new JLabel("                Kourkovis Grigorios                       ");

        splash.add(msg);
        splash.add(msg2);
        splash.add(msg3);


        this.setContentPane(splash);

        setVisible(true);
        toFront();
        //Τελος δημιουργιας panel
     

        // Προσωρινή αναμονή
        try {
            Thread.sleep(duration+3000);
        }catch (Exception e) {
        }

        setVisible(false);
        dispose();
    }
}


