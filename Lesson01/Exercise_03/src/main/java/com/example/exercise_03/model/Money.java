package com.example.exercise_03.model;

public class Money {
    private Double amountUsd;
    private Double changePrice;
    private Double amountVnd;

    public Money() {
    }

    public Money(Double amountUsd, Double changePrice, Double amountVnd) {
        this.amountUsd = amountUsd;
        this.changePrice = changePrice;
        this.amountVnd = amountVnd;
    }

    public Double getAmountUsd() {
        return amountUsd;
    }

    public void setAmountUsd(Double amountUsd) {
        this.amountUsd = amountUsd;
    }

    public Double getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(Double changePrice) {
        this.changePrice = changePrice;
    }

    public Double getAmountVnd() {
        return amountVnd;
    }

    public void setAmountVnd(Double amountVnd) {
        this.amountVnd = amountVnd;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amountUsd=" + amountUsd +
                ", changePrice=" + changePrice +
                ", amountVnd=" + amountVnd +
                '}';
    }
}
