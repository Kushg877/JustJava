package com.company.classes.thirdClass.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }
    public BoxPrice(BoxPrice other) {
        super(other);
        this.cost = -1;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
