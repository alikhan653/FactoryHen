package org.example;

public class RussianHen extends Hen{

    public int getCountOfEggsPerMonth(){
        return 10000;
    }

    @Override
    String getDescription(){
        return super.getDescription() + " MY country is - " + Country.RUSSIA + ". I lay " + getCountOfEggsPerMonth() + " eggs a month.";
    }
}
