public class Main {
    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }
        return str.substring(str.length() - 1,str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() == 1 || str.length() == 0){
            return "";
        }
        return str.substring(1,str.length() - 1);
    }

    public static String middleTwo(String str) {
        if (str.length() %2 == 0){
            return str.substring(str.length() / 2 - 1, str.length()/2 + 1);
        }
        return str;
    }

    public boolean endsLy(String str) {
       if (str.length() <= 2){
           return false;
       }
        return (str.substring(str.length() - 2, str.length()).equals("ly"))? true : false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length() - n,str.length());
    }

    public String twoChar(String str, int index) {
        if ((str.length() - index - 1) >= 2 && index > 0){
            return str.substring(index, index + 2);
        }
        return str.substring(0,2);
    }

    public String middleThree(String str) {
        int srd = str.length() / 2;
        if (str.length() %2 != 0){
            return str.substring(srd - 1,srd + 2);
        }
        return str;
    }

    public boolean hasBad(String str) {
        if (str.length() < 3){
            return false;
        }
        if (str.startsWith("bad",0) || str.startsWith("bad",1) ){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
    }
}

