package statisticker;

public class IAlerter {

    private EmailAlert emailAlert;
    private LEDAlert ledAlert;

    public IAlerter(EmailAlert emailAlert, LEDAlert ledAlert) {
        this.emailAlert = emailAlert;
        this.ledAlert = ledAlert;
    }

    public EmailAlert getEmailAlert() {
        return emailAlert;
    }

    public void setEmailAlert(EmailAlert emailAlert) {
        this.emailAlert = emailAlert;
    }

    public LEDAlert getLedAlert() {
        return ledAlert;
    }

    public void setLedAlert(LEDAlert ledAlert) {
        this.ledAlert = ledAlert;
    }
}
