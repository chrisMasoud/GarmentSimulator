package com.company.garmentsimulator;

public class CasualGarmentFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
