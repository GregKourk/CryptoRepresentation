package Algorithms;

public class OTPEncode {
    public static String OtpEncode (String plain, String key){
        String encoded = "";
        encoded = OTPEncryption(plain,key); 
        return encoded;
    }
    
    public static String OTPEncryption(String text,String key){
      String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String alphaL = "abcdefghijklmnopqrstuvwxyz"; 
      int len = text.length();
      
      String sb = "";
      for(int x=0;x<len;x++){
         char get = text.charAt(x);
         char keyget = key.charAt(x);
         if(Character.isUpperCase(get)){
            int index = alphaU.indexOf(get);
            int keydex = alphaU.indexOf(Character.toUpperCase(keyget));
            int total = (index + keydex) % 26;
            total = (total<0)? total + 26 : total;
            sb = sb+ alphaU.charAt(total);
         }
         else if(Character.isLowerCase(get)){
            int index = alphaL.indexOf(get);
            int keydex = alphaL.indexOf(Character.toLowerCase(keyget));
            int total = (index + keydex) % 26;
            total = (total<0)? total + 26 : total;
            sb = sb+ alphaL.charAt(total);
         }
         else{
            sb = sb + get;
         }
      }   
      return sb;
   }  
}
