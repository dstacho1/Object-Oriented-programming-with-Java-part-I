
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        int priceThis = this.squareMeters * this.pricePerSquareMeter;
        int priceOther = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(priceThis - priceOther);
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        if (this.squareMeters * this.pricePerSquareMeter >  otherApartment.squareMeters * otherApartment.pricePerSquareMeter){
            return true;
        }
        return false;
    }
}
