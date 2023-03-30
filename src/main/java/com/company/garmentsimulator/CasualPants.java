package com.company.garmentsimulator;

/**
 * The CasualPants class sews casual pants
 * @author Chris Masoud
 */
public class CasualPants implements Pants {
    
    /**
     * The sew() method outputs that it is sewing casual pants
     */
    @Override
    public void sew() {
        System.out.println("Sewing casual pants...");
    }
}
