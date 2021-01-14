
package Algorithms;

public class VigenereDecode {
    public static String vigenereDecode (String cipher, String key){
        String decoded = "";
        String alphaL = "abcdefghijklmnopqrstuzwxyz";
        String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
        String reKey = "";
        int len = cipher.length();
      
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
      
        //decrypting
        String sb = "";
        for(int x=0;x<len;x++){
            if(Character.isUpperCase(cipher.charAt(x))){
                for(int y=0;y<26;y++){
                    int scol  = alphaU.indexOf(reKey.charAt(x));
                    if(vcu[y][scol] == cipher.charAt(x)){
                        decoded = decoded + (char) ('A' + y % 26 );
                    }
                }
            }
            else if(Character.isLowerCase(cipher.charAt(x))){
                for(int y=0;y<26;y++){
                    int scol  = alphaL.indexOf(Character.toLowerCase(reKey.charAt(x)));
                    if(vcl[y][scol] == cipher.charAt(x)){
                        decoded = decoded + (char) ('a' + y % 26 );
                    }
                }
            }
            else{
                decoded = decoded+cipher.charAt(x);
            }    
      }
     return decoded;
    }
    
}
