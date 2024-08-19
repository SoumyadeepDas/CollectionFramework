package edu.soumyadeep.collectionessentials;

public class Value {
    private String value;
    public Value(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Value: " + value;
    }
}
