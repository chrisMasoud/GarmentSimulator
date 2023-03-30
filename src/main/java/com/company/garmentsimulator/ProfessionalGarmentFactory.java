package com.company.garmentsimulator;

/**
 * The ProfessionalGarmentFactory class creates professional tops, pants, and shoes
 * @author Chris Masoud
 */
public class ProfessionalGarmentFactory implements GarmentFactory {
    
    /**
     * The createTop() method returns a new professional top
     * @return Top
     */
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    /**
     * The createPants() method returns new professional pants
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    /**
     * The createShoes() method returns new professional shoes
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
