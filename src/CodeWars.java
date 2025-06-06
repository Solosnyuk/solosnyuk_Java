public class CodeWars {
    public static String calc(String txt){
    String firstNumber = txt.substring(0,txt.indexOf(" ")).trim();
    String lastNumber = txt.substring(txt.lastIndexOf(" "), txt.length()).trim();
    String signAction = txt.substring(txt.indexOf(" "), txt.lastIndexOf(" ")).trim();

    int countAnswerDot = 0;
    int countFirstNumber = firstNumber.length();
    int countLastNumber = lastNumber.length();

    if (countLastNumber == countFirstNumber) {
        return "";
    }

        switch (signAction) {
            case "-":
                countAnswerDot = countFirstNumber - countLastNumber;
                break;
            case "+":
                countAnswerDot = countFirstNumber + countLastNumber;
                break;
            case "*":
                countAnswerDot = countFirstNumber * countLastNumber;
                break;
            case "//":
                if (countLastNumber == 0) return "";
                countAnswerDot = countFirstNumber / countLastNumber;
                break;
            default:
                return "";
        }

    return ".".repeat(countAnswerDot);
    }
}
