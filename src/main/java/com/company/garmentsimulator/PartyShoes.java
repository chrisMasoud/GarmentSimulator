package com.company.garmentsimulator;

/**
 * The PartyShoes class sews party shoes
 * @author Chris Masoud
 */
public class PartyShoes implements Shoes {
    
    /**
     * The sew() method outputs that it is sewing party shoes
     */
    @Override
    public void sew() {
        System.out.println("Sewing party shoes...");
    }
}
