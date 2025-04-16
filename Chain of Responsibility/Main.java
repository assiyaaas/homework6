import java.util.*;

public class Main {
    public static void main(String[] args) {

        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);

        List<String> issues = Arrays.asList(
                "password_reset",
                "refund_request",
                "account_ban",
                "unknown_bug"
        );

        for (String issue : issues) {
            try {
                faq.handle(issue);
            } catch (RuntimeException e) {
                System.out.println("[Main] Exception: " + e.getMessage());
            }
        }
    }
}
