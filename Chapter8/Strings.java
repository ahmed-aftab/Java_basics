package Chapter8;

public class Strings {
    public static void main(String args[]){
        stringSeparator("HelloThisIsMirzaAhmedAftab");

    }
    public static void stringSeparator(String text){
        var modifyText=new StringBuilder(text);
        for(int i=0;i<text.length();i++){
            if(i!=0 && Character.isUpperCase(modifyText.charAt(i))){
                modifyText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifyText);
    }
}
