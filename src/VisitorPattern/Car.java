package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Car implements Element {
    private final List<Element> parts = new ArrayList<>();

    public Car() {
        parts.add(new Engine());
        parts.add(new Chassis(new Wheel[]{
            new Wheel(Position.FL),
            new Wheel(Position.FR),
            new Wheel(Position.RL),
            new Wheel(Position.RR)
        }));
    }

    @Override
    public void accept(VisitorIF visitor) {
        for (Element part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this); // akhir dari kunjungan
    }

    @Override
    public String getDescription() {
        return "- Car";
    }
}