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

    }

}
