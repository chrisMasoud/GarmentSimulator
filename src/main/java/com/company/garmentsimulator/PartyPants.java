package com.company.garmentsimulator;

/**
 * The PartyPants class sews party pants
 * @author Chris Masoud
 */
public class PartyPants implements Pants {
    
    /**
     * The sew() method outputs that it is sewing party pants
     */
    @Override
    public void sew() {
        System.out.println("Sewing party pants...");
    }
}
