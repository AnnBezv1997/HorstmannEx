package ru.ncedu.java.tasks.inheritance.ex2;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    @Override
    public String toString() {
        return "LabeledPoint : " + label + "; " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if ( !super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return label.equals(that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
