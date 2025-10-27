public class Email {
    public static boolean valideitEmail(String email) {
        if (email.chars().noneMatch(c -> c == '@')) {
            throw new RuntimeException("Нету знака \"@\"");
        }

        if (email.chars().noneMatch(c -> c == '.')) {
            throw new RuntimeException("Нету знака \".\"");
        }

        if (email.chars().anyMatch(c -> c == ' ')) {
            throw new RuntimeException("Email содержит пробел");
        }

        if (email.length() < 5 && email.length() > 50) {
            throw new RuntimeException("");
        }

        return true;
    }
}
