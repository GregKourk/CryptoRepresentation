package Algorithms;

public class CeasarDecode {   
    public static String ceasarDecode (String cipher, int shift){
        String decoded = "";
        for(int i=0; i < cipher.length();i++)  
        {
            // Shift one character at a time
            char alphabet = cipher.charAt(i);
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);
            
                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position 
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decoded = decoded + alphabet;
            }    
                // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
             // shift alphabet
                alphabet = (char) (alphabet - shift);
                
                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position 
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decoded = decoded + alphabet;            
            }
            else 
            {
             decoded = decoded + alphabet;            
            } 
        }
       return decoded;
    }  
}
