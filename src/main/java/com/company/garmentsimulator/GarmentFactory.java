package com.company.garmentsimulator;

/**
 * The GarmentFactory interface has methods for creating tops, pants, and shoes
 * @author Chris Masoud
 */
public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
