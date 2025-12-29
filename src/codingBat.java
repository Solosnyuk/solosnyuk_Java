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

}
