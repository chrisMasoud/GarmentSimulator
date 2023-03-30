package com.company.garmentsimulator;

/**
 * The GarmentSimulator class holds the main method and creates instances of 
 * each garment type using the Abstract Factory Design Pattern
 * @author Chris Masoud
 */
public class GarmentSimulator {
    
    /**
     * The main method is the program's entry point
     * @param args 
     */
    public static void main(String[] args) {

        //create a professional garment factory
        GarmentFactory professionalGarmentFactory = new ProfessionalGarmentFactory();
        //create professional top, pants, and shoes
        Top professionalTop = professionalGarmentFactory.createTop();
        Pants professionalPants = professionalGarmentFactory.createPants();
        Shoes professionalShoes = professionalGarmentFactory.createShoes();
        //demonstrate that the objects work as intended
        professionalTop.sew();
        professionalPants.sew();
        professionalShoes.sew();
        //create a casual garment factory
        GarmentFactory casualGarmentFactory = new CasualGarmentFactory();
        //create casual top, pants, and shoes
        Top casualTop = casualGarmentFactory.createTop();
        Pants casualPants = casualGarmentFactory.createPants();
        Shoes casualShoes = casualGarmentFactory.createShoes();
        //demonstrate that the objects work as intended
        casualTop.sew();
        casualPants.sew();
        casualShoes.sew();
        //create a party garment factory
        GarmentFactory partyGarmentFactory = new PartyGarmentFactory();
        //create party top, pants, and shoes
        Top partyTop = partyGarmentFactory.createTop();
        Pants partyPants = partyGarmentFactory.createPants();
        Shoes partyShoes = partyGarmentFactory.createShoes();
        //demonstrate that the objects work as intended
        partyTop.sew();
        partyPants.sew();
        partyShoes.sew();
    }
}
