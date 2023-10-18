package Assignments;

public class stringAss1 {
    public static String moveSpecialCharacters(String str){
        String strChar = "";
        String StrSpecial = "";

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isAlphabetic(c)|| Character.isDigit(c)){
                strChar += c;
            }else{
                StrSpecial += c;
            }
        }
        return strChar + StrSpecial;
    }
    public static void main(String[] args) {
        String str = "%$Wel*come!";
        System.out.println(moveSpecialCharacters(str));
    }
}
