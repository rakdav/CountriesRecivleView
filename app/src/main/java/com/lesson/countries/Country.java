package com.lesson.countries;

import java.io.Serializable;

public class Country implements Serializable
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

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
