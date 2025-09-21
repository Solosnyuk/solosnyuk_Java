public class Main {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, out.length()/2) + word + out.substring(out.length()/2, out.length());
    }

    public String extraEnd(String str) {
        return str.substring(str.length()-2,str.length())
                + str.substring(str.length()-2,str.length()) + str.substring(str.length()-2,str.length());
    }

    public String firstTwo(String str) {
        if (str.length() < 2){
            return str;
        }
        return str.substring(0,2);
    }

    public static void main(String[] args) {


    }
}

