package Exercises;

public class removeWS {
 
    public static String removeWhiteSpace(String str){
        return str.replace(" ","");        
    }
  
    public static void main(String[] args) {
        String str = "Hello  how are you";
        str = removeWhiteSpace(str);
        System.out.println(str);
    }
}
