package com.example.java_week_5;

public class Apartment {
    private final int rooms;
    private final int squareMeters;
    private final int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Exercise 87.1: Larger
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    // Exercise 87.2: Price difference
    public int priceDifference(Apartment otherApartment) {
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(thisPrice - otherPrice);
    }

    // Exercise 87.3: More expensive than
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return thisPrice > otherPrice;
    }

    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
        Apartment twoBedTartu = new Apartment (2, 40, 800);
        Apartment fourBedViljandi = new Apartment(4, 120, 800);

        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));      // false
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));  // true

        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));        // 71600
        System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));    // 35400

        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));       // false
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));   // true

        System.out.println(fourBedViljandi.moreExpensiveThan(twoBedTartu));
        System.out.println(twoBedTartu.moreExpensiveThan(twoRoomsBrooklyn));
    }
}

