public class SeniorSupportHandler implements SupportHandler {
    private SupportHandler next;

    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        System.out.println("[Logger] SeniorSupport trying to handle " + issue);

        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");

        }
    }
}
