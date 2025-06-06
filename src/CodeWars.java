public class CodeWars {
    public static String getIssuer(String cardNumber) {
        String type = "";
        
        if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"))) {
            type = "AMEX";
        } else if (cardNumber.length() == 16 && (cardNumber.startsWith("6011"))) {
            type = "Discover";
        } else if (cardNumber.length() == 16 && (
                cardNumber.startsWith("51") ||
                cardNumber.startsWith("52") ||
                cardNumber.startsWith("53") ||
                cardNumber.startsWith("54") ||
                cardNumber.startsWith("55") 
        )) {
            type = "Mastercard";
        } else if ((cardNumber.length() == 16 || cardNumber.length() == 13) && cardNumber.startsWith("4")) {
            type = "VISA";
        } else {
            type = "Unknown";

        }
        return type;
    }
}
