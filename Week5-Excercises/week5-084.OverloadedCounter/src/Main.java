public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter a = new Counter(1,true);
        System.out.println(a.value());
        a.decrease();
        System.out.println(a.value());
        a.decrease();
        System.out.println(a.value());

        Counter c = new Counter(2,true);
        c.decrease(4);
        System.out.println(c.value());
    }
}
