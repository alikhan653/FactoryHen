package org.example;

public class BelarusianHen extends Hen {

    public int getCountOfEggsPerMonth(){
        return 11000;
    }

    @Override
    String getDescription(){
        return super.getDescription() + "MY country is - " + Country.BELARUS + ". I lay " + getCountOfEggsPerMonth() + " eggs a month.";
    }
}
