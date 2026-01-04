public class codingBat {
    public static void main(String[] args) {

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        }
        if (aSmile == false && bSmile == false) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b);
        }
        return ((a + b) * 2);
    }

    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(n - 21) * 2;
        }
        return 21 - n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == false) {
            return false;
        }
        if (hour < 7 || hour >= 20) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                return true;
            }
        }
        if (negative == true) {
            if (a < 0 && b < 0) {
                return true;
            }
        }
        return false;
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not" + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        if (str.length() == 3) {
            return str;
        }

        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }

    public String backAround(String str) {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
    }

    public boolean or35(int n) {
            if (n % 3 == 0 || n % 5 == 0){
                return true;
            }
            return false;
    }

    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        return str.substring(0,2) + str + str.substring(0,2);
    }

    public boolean startHi(String str) {
        if (str.startsWith("hi")) {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        } else if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if (a <= 20 && a >= 10) {
            return true;
        } else if (b <= 20 && b >= 10) {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.startsWith("ix",1)) {
            return true;
        }
        return false;
    }

    public String startOz(String str) {
        if (str.length() > 1 && str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";

        } else if (str.length() > 0 && str.charAt(0) == 'o') {
            return "o";
        } else if (str.length() > 1 && str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }

    public int intMax(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        } else if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        if (a < 21 && a > 9 &&
        b < 21 && b > 9) {
            return Math.max(a,b);
        }
        if (a < 21 && a > 9) {
            return a;
        }
        if (b < 21 && b > 9) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if (count > 0 && count < 4) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 3) +
                    str.substring(str.length() - 3).toUpperCase();
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String string = "";

        for (int i = 0; i < str.length(); i = i + n) {
            string += str.charAt(i);
        }
        return string;
    }

    public int dateFashion(int you, int date) {
        if (you > 2 && date >= 8) {
            return 2;
        } else if (you > 7 && date > 2) {
            return 2;
        } else if (you < 3 && date < 8) {
            return 0;
        } else if (you < 9 && date < 3) {
            return 0;
        } else if (you > 2 && date >= 8) {
            return 2;
        } else if (you > 7 && date > 2) {
            return 2;
        }
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer) {
            if (temp >= 60 && temp <= 100) {
                return true;
            }
        }
        if (temp >= 60 && temp <= 90) {
            return true;
        }
        return false;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        }
        else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return "";
    }

}
