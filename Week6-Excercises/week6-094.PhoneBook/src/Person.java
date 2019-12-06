public class Person {
    private String name;
    private String number;

    public Person(String personName, String phoneNumber){
        this.name = personName;
        this.number = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString(){
        return this.getName() + " number: " + this.getNumber();
    }

    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
}
