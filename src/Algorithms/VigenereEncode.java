
package Algorithms;

public class VigenereEncode {
    public static String vigenereEncode (String plain, String key){
        String encoded = "";
        String alphaL = "abcdefghijklmnopqrstuvwxyz";
        String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
        String reKey = "";
        int len = plain.length();
      
        // rearrange the key
        int mv=0;
        int count=0;
        for(int x=0;x<len;x++){
            if(mv == key.length()){
                count=0;
                mv=0;
            }
            reKey = reKey + key.charAt(count);
            count++;
            mv++;
        }
        
      //create venigher table
      char [][] vcl = new char[26][26];
      char [][] vcu = new char[26][26];      
      
      //using caesar cipher algorithm to form table
      for(int x=0;x<26;x++){
        count=x;
        for(int y=0;y<26;y++){
            vcl[x][y] = (char) ('a' + count % 26 );
            vcu[x][y] = (char) ('A' + count % 26 );
            count++;
        }
      }
      
      //encrypting
      String sb = "";
      for(int x=0;x<len;x++){
        if(Character.isUpperCase(plain.charAt(x))){
             int srow  = alphaU.indexOf(Character.toUpperCase(reKey.charAt(x)));
             int scol = alphaU.indexOf(plain.charAt(x));            
             encoded = encoded + vcu[srow][scol];
        }
        else if (Character.isLowerCase(plain.charAt(x))){
             int srow  = alphaL.indexOf(Character.toLowerCase(reKey.charAt(x)));
             int scol = alphaL.indexOf(plain.charAt(x));
             encoded = encoded + vcl[srow][scol];
             
        }
        else{
            //can be replace with any random alpha or null space or get from original text
            encoded = encoded +plain.charAt(x);
        }  
       } 
       return encoded;    
    }   
}
