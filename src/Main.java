public class Main {
     public String lastTwo(String str) {
         if (str.length() < 2) {
             return str;
         }
         return str.substring(0, str.length() - 2) +
                 str.charAt(str.length() - 1) +
                 str.charAt(str.length() - 2);
     }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }
        if (str.startsWith("blue")){
            return "blue";
        }
        return "";
     }

    public String conCat(String a, String b) {
        if ( b.length() > 0 && a.endsWith(b.substring(0,1))){
            return a.substring(0,a.length()-1) + b;
        }
        return a + b;
    }

    public String minCat(String a, String b) {
        if (a.length() != b.length()){
            int minL = Integer.min(a.length(),b.length());
            return (a.length() > b.length())? a.substring(a.length() - minL, a.length())
                    + b : a + b.substring(b.length() - minL,b.length()) ;
        }
        return a + b;
    }

    public static String extraFront(String str) {
        if (str.length() <= 2){
            return str.repeat(3);
        }
        return str.substring(0,2).repeat(3);
    }

    public static String without2(String str) {
         if (str.length() >= 2 && str.substring(str.length() - 2,str.length()).equals(str.substring(0,2))) {
             return str.replaceFirst(str.substring(0,2),"");
         }
         return str;
    }

    public String deFront(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += 'a';
        }

        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += 'b';
        }

        if (str.length() > 2) {
            result += str.substring(2);
        }

        return result;
    }

    public static String startWord(String str, String word) {
        if (str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))){
            return str.substring(0,word.length());
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.length() == 1 && str.endsWith("x")){
            return "";
        }
         if (str.startsWith("x") && str.endsWith("x")){
            return str.substring(1,str.length() - 1);
        }
        if (str.startsWith("x")){
            return str.substring(1);
        }
        if (str.endsWith("x")){
            return str.substring(0,str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        if (str.length() >= 2){
            return str.replaceAll("x","");
        }
         if (str.charAt(0) == 'x' && str.charAt(1) != 'x'){
            return str.substring(1);
        }
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x'){
            return str.substring(2);
        }
        if (str.charAt(0) != 'x' && str.charAt(1) == 'x'){
            return str.charAt(0) + str.substring(2);
        }
         return str;
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0){
            return "@" + "@";
        }
         if (a.length() == 0){
            return "@" + b.charAt(b.length());
        }
        if (b.length() == 0){
            return a.charAt(0) + "@";
        }
        return Character.toString(a.charAt(0)) + b.charAt(b.length());
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String right2(String str) {
        if (str.length() > 2){
            return str.substring(str.length() - 2) + str.substring(0,str.length() - 2);
        }
        return str;
    }

    public String atFirst(String str) {
        if (str.length() > 2){
            return str.substring(0,2);
        }
        if (str.length() < 2){
            return (str.length() == 1)? str + "@" : "@@";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "i"));
    }
}

