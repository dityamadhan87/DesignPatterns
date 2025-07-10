package VisitorPattern;

public interface Element {
    void accept(VisitorIF visitor);
    String getDescription();
}
