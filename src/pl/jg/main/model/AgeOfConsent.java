package pl.jg.main.model;

public class AgeOfConsent {
    public boolean checkIfIsAdult (int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
