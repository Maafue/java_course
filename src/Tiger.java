public class Tiger {
    private final String name;
    private final String lastname;
    private final int age;

     public Tiger(String name, String lastname, int age) {
         this.name = name;
         this.lastname = lastname;
         this.age = age;
     }

     public static void main(String[] args) {
         Tiger  tiger = new Tiger("Serega", "petrov", 25);
         tiger.print();
     }

     void print () {
         System.out.println(" I'm " + this.name + " " + this.lastname + " , мой возраст" + this.age );
     }
}
