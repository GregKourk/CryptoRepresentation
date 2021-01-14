
package Visualization;

import static Visualization.OTPEncodeVisual.hexToRepresentation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

public class OTPDecodeVisual extends javax.swing.JFrame {
    
    String cipherTextToDecode, plainTextDecoded, key, overallTextToDisplay;
    ArrayList<String> stringsToDisplay = new ArrayList<String>();
    ArrayList<Integer> plainIntegers = new ArrayList<Integer>();
    ArrayList<Integer> keyIntegers = new ArrayList<Integer>();
    ArrayList<Integer> cipherIntegers = new ArrayList<Integer>();
    ArrayList<Integer> addedCiphersWithKeyIntegers = new ArrayList<>();
    ArrayList<Integer> modIntegers = new ArrayList<>();
    int intermediateTime = 3000;
    int indexTimer;

    public OTPDecodeVisual(String cipher, String plain, String key) {
        initComponents();
        this.setVisible(true);
        this.cipherTextToDecode = cipher;
        this.plainTextDecoded = plain;
        this.key = key;
    }
    
    public static ArrayList hexToRepresentation(String text){
        ArrayList<Integer> temp = new ArrayList<>();
        String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaL = "abcdefghijklmnopqrstuvwxyz"; 
        int len = text.length();
        for(int x=0;x<len;x++){
            char get = text.charAt(x);
            if(Character.isUpperCase(get)){
                int index = alphaU.indexOf(get);
                temp.add(index);
            }
            else if(Character.isLowerCase(get)){
                int index = alphaL.indexOf(get);
                temp.add(index);
            }
            else{
                temp.add(0);
            }
            
        }
        return temp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        StartButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        cipherTextGivenArea1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        plainTextCreatedArea1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        OverallArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        KeyCreatedArea = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        representationArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(70, 359));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu_25.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_25.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/upload_25.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/download_25.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit_25.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setText("One Time Pad Decode Representation");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(exitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(191, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RepCrypto V1.0");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Designed by GK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)))
        );

        jPanel3.setBackground(new java.awt.Color(169, 165, 179));

        StartButton1.setText("Start");
        StartButton1.setBorder(null);
        StartButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Cipher Text Given");

        jLabel13.setText("Plain Text Created");

        jLabel14.setText("Conclusion");

        cipherTextGivenArea1.setColumns(20);
        cipherTextGivenArea1.setRows(5);
        jScrollPane5.setViewportView(cipherTextGivenArea1);

        plainTextCreatedArea1.setColumns(20);
        plainTextCreatedArea1.setRows(5);
        jScrollPane6.setViewportView(plainTextCreatedArea1);

        OverallArea1.setColumns(20);
        OverallArea1.setRows(3);
        jScrollPane7.setViewportView(OverallArea1);

        jLabel15.setText("Key Created");

        KeyCreatedArea.setColumns(20);
        KeyCreatedArea.setRows(5);
        jScrollPane8.setViewportView(KeyCreatedArea);

        jLabel16.setText("Representation");

        representationArea.setColumns(20);
        representationArea.setRows(5);
        jScrollPane9.setViewportView(representationArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(225, 225, 225))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(StartButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel13)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(86, 103, 181));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info25.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(86, 103, 181));
        jTextArea1.setRows(4);
        jTextArea1.setText("One-time pad (OTP) is an encryption technique that requires the use of a one-time pre-shared key the same size as, or longer than,\nthe message being sent.  In this technique, a plaintext is paired with a random secret key (also referred to as a one-time pad).\nThen, each bit or character of the plaintext is encrypted by combining it with the corresponding bit or character from the pad.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void StartButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButton1ActionPerformed
        // TODO add your handling code here:
        cipherIntegers = hexToRepresentation(cipherTextToDecode);
        stringsToDisplay.add("Cipher text:\t" + cipherIntegers);
        
        keyIntegers = hexToRepresentation(key);
        stringsToDisplay.add("\nKey:\t" + keyIntegers);
        
        for (int i=0;i<cipherIntegers.size();i++){
            addedCiphersWithKeyIntegers.add(cipherIntegers.get(i) + keyIntegers.get(i));
        }
        stringsToDisplay.add("\nAddition:\t" + addedCiphersWithKeyIntegers);
        
        for (int i=0;i<addedCiphersWithKeyIntegers.size();i++){
            modIntegers.add(addedCiphersWithKeyIntegers.get(i)%26);
        }
        stringsToDisplay.add("\nModulo:\t" + modIntegers);
        
        plainIntegers = hexToRepresentation(plainTextDecoded);
        stringsToDisplay.add("\nPlain text:\t" + plainIntegers);
        
        overallTextToDisplay = "To summarize message '" + cipherTextToDecode + "'\nis decoded to '" + plainTextDecoded + "'\nusing the randomly generated key '" + key + "'";
        
        cipherTextGivenArea1.setText("Plain text:\t" + cipherTextToDecode);
        cipherTextGivenArea1.append("\nIndexed form:");
        for (int i=0;i<plainIntegers.size();i++){
            cipherTextGivenArea1.append("\n" + cipherTextToDecode.charAt(i) + ":\t" + cipherIntegers.get(i));
        }
        
        KeyCreatedArea.setText("Key created:\t" + key);
        KeyCreatedArea.append("\nIndexed form:");
        for (int i=0;i<keyIntegers.size();i++){
            KeyCreatedArea.append("\n" + key.charAt(i) + ":\t" + keyIntegers.get(i));
        }
        
        plainTextCreatedArea1.setText("Cipher created:\t" + plainTextDecoded);
        plainTextCreatedArea1.append("\nIndexed form:");
        for (int i=0;i<cipherIntegers.size();i++){
            plainTextCreatedArea1.append("\n" + plainTextDecoded.charAt(i) + ":\t" + plainIntegers.get(i));
        }
        
        Timer timer = new Timer(intermediateTime, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                representationArea.append(stringsToDisplay.get(indexTimer));
                indexTimer++;
            }});
        
        Timer timer2 = new Timer((intermediateTime*stringsToDisplay.size()), new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OverallArea1.setText(overallTextToDisplay);
            }
        });
        
        timer.start();
        timer2.start();
    }//GEN-LAST:event_StartButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea KeyCreatedArea;
    private javax.swing.JTextArea OverallArea1;
    private javax.swing.JButton StartButton1;
    private javax.swing.JTextArea cipherTextGivenArea1;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea plainTextCreatedArea1;
    private javax.swing.JTextArea representationArea;
    // End of variables declaration//GEN-END:variables
}
