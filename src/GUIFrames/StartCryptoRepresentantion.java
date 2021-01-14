
package GUIFrames;

public class StartCryptoRepresentantion {
    
    public static void StartCryptoRepresentation(){
           
        //εμφανιση SplashScreen 
        SplashScreen splash = new SplashScreen(200);
        splash.run();
        
        // Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
                 
    }
    
}
