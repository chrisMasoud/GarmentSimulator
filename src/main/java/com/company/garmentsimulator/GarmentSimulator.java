package com.company.garmentsimulator;

public class GarmentSimulator {

    public static void main(String[] args) {

        GarmentFactory professionalGarmentFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalGarmentFactory.createTop();
        Pants professionalPants = professionalGarmentFactory.createPants();
        Shoes professionalShoes = professionalGarmentFactory.createShoes();

        professionalTop.sew();
        professionalPants.sew();
        professionalShoes.sew();

        GarmentFactory casualGarmentFactory = new CasualGarmentFactory();
        Top casualTop = casualGarmentFactory.createTop();
        Pants casualPants = casualGarmentFactory.createPants();
        Shoes casualShoes = casualGarmentFactory.createShoes();

        casualTop.sew();
        casualPants.sew();
        casualShoes.sew();

        GarmentFactory partyGarmentFactory = new PartyGarmentFactory();
        Top partyTop = partyGarmentFactory.createTop();
        Pants partyPants = partyGarmentFactory.createPants();
        Shoes partyShoes = partyGarmentFactory.createShoes();
        
        partyTop.sew();
        partyPants.sew();
        partyShoes.sew();
    }
}
