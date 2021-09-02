package com.example.demo.domain.model;

public class Prototype {
    private double length;
    private double width;
    private double height;
    private OptionList optionList;

    public Prototype(){
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public OptionList getOptionList() {
        return optionList;
    }

    public void setOptionList(OptionList optionList) {
        this.optionList = optionList;
    }
}
