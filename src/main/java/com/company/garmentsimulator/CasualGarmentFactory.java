package com.company.garmentsimulator;

/**
 * The CasualGarmentFactory class creates casual tops, pants, and shoes
 * @author Chris Masoud
 */
public class CasualGarmentFactory implements GarmentFactory {
    
    /**
     * The createTop() method returns a new casual top
     * @return Top
     */
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    /**
     * The createPants() method returns new casual pants
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new CasualPants();
    }
    
    /**
     * The createShoes() method returns new casual shoes
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
