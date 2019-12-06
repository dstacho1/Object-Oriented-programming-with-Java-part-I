
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        int euro1 = this.euros();
        int euro2 = added.euros();
        int cents1 = this.cents();
        int cents2 = added.cents();
        Money total = new Money(euro1 + euro2, cents1 + cents2);
        return total;
    }

    public Money minus(Money decremented){
        if (this.less(decremented)){
            Money lesser = new Money(0,0);
            return lesser;
        }else {
            int euro1 = this.euros();
            int euro2 = decremented.euros();
            int cents1 = this.cents();
            int cents2 = decremented.cents();
            if (cents1 < cents2){
                Money total = new Money(euro1 - euro2 - 1, 100 - cents2);
                return total;
            }
            Money total = new Money(euro1 - euro2, cents1 - cents2);
            return total;
        }
    }

    public boolean less(Money compared){
        if (this.euros() < compared.euros()){
            return true;
        } else if(this.euros() == compared.euros() && this.cents() < compared.cents()){
            return true;
        } else {
            return false;
        }
    }

}
