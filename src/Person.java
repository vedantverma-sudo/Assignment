class Person {
    private String name = "Amit";
    int age = 25;
    protected String address = "Delhi";
    public String nationality = "Indian";
    public String getName() {
        return name;
    }
    public void displayInfo() {
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Address     : " + address);
        System.out.println("Nationality : " + nationality);
    }
}
