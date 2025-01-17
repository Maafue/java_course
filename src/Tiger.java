public class Tiger {
    private final String name;
    private final String lastname;

    public Tiger(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Tiger  tiger = new Tiger("Serega", "petrov");
        tiger.print();
    }

    void print () {
        System.out.println("ARRRR I'm " + this.name + " " + this.lastname);
    }
}
