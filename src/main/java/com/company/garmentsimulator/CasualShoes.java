package com.company.garmentsimulator;

/**
 * The CasualShoes class sews casual shoes
 * @author Chris Masoud
 */
public class CasualShoes implements Shoes {
    
    /**
     * The sew() method outputs that it is sewing casual shoes
     */
    @Override
    public void sew() {
        System.out.println("Sewing casual shoes...");
    }
}
