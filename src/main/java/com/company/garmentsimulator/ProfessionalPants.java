package com.company.garmentsimulator;

/**
 * The ProfessionalPants class sews professional pants
 * @author Chris Masoud
 */
public class ProfessionalPants implements Pants {
    
    /**
     * The sew() method outputs that it is sewing professional pants
     */
    @Override
    public void sew() {
        System.out.println("Sewing professional pants...");
    }
}
