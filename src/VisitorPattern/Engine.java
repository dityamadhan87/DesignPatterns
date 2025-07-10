package VisitorPattern;

public class Engine implements Element {

    @Override
    public void accept(VisitorIF visitor) {
        visitor.visit(this);
    }

    @Override
    public String getDescription() {
        return "- Engine";
    }
}