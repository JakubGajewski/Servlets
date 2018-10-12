package pl.jg.maths.model;

public class MathsService {

    public double randomAddition(double input) {
        return input + (Math.random()*input);
    }

    public double randomSubtraction(double input) {
        return input - (Math.random()*input);
    }
}
