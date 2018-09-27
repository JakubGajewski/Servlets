package pl.jg.model;

public class AgeOfConsent {
    public boolean checkAge (int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
