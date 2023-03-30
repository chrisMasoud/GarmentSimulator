package com.company.garmentsimulator;

/**
 * The PartyGarmentFactory class creates party tops, pants, and shoes
 * @author Chris Masoud
 */
public class PartyGarmentFactory implements GarmentFactory {
    
    /**
     * The createTop() method returns a new party top
     * @return Top
     */
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    /**
     * The createPants() method returns new party pants
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    /**
     * The createShoes() method returns new party shoes
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
