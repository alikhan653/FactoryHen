package org.example;

public class MoldovanHen extends Hen{


    public int getCountOfEggsPerMonth(){
        return 9000;
    }

    @Override
    String getDescription(){
        return super.getDescription() + "MY country is - " + Country.MOLDOVA + ". I lay " + getCountOfEggsPerMonth() + " eggs a month.";
    }

}
