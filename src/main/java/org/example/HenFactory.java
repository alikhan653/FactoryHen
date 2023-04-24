package org.example;

public class HenFactory {

    public static Hen getHen(String country) {
        Hen hen = null;
        if (country.equals("BELARUS")) {hen = new BelarusianHen();}
        if (country.equals("MOLDOVA")) {hen = new MoldovanHen();}
        if (country.equals("RUSSIA")) {hen = new RussianHen();}
        if (country.equals("UKRAINE")) {hen = new UkrainianHen();}
        return hen;
    }
}