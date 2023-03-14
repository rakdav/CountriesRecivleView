package com.lesson.countries;

public class Country
{
    private int flag;
    private String name;
    private String capital;
    private int population;

    public Country(int flag, String name, String capital, int population) {
        this.flag = flag;
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public int getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }
}
