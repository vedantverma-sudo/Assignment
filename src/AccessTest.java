public class AccessTest {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name: " + p.getName());

        System.out.println("Age             : " + p.age);
        System.out.println("Address         : " + p.address);
        System.out.println("Nationality     : " + p.nationality);
        System.out.println("\n--- Displaying from displayInfo() ---");
        p.displayInfo();
    }
}
