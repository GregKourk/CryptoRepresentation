package Algorithms;

public class CeasarEncode {
    public static String ceasarEncode (String plain, int shift){
        String encoded = "";
        char alphabet;
        for(int i=0; i < plain.length();i++) 
        {
             // Shift one character at a time
            alphabet = plain.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + shift);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             encoded = encoded + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + shift);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             encoded = encoded + alphabet;
            }
            else {
             encoded = encoded + alphabet;   
            }     
    }
        return encoded;
    }
}
