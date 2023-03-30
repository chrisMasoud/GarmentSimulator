package com.company.garmentsimulator;

/**
 * The ProfessionalShoes class sews professional shoes
 * @author Chris Masoud
 */
public class ProfessionalShoes implements Shoes {
    
    /**
     * The sew() method outputs that it is sewing professional shoes
     */
    @Override
    public void sew() {
        System.out.println("Sewing professional shoes...");
    }
}
