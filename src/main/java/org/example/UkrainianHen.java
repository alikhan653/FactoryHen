package org.example;

public class UkrainianHen extends Hen{

    public int getCountOfEggsPerMonth(){
        return 12000;
    }

    @Override
    String getDescription(){
        return super.getDescription() + "MY country is - "  + Country.UKRAINE + ". I lay " + getCountOfEggsPerMonth() + " eggs a month.";
    }

}
