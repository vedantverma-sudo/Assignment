class Dog extends Animal {
    void showDetails() {
        System.out.println("Legs     : " + legs);
        System.out.println("Sound    : " + sound);
        System.out.println("Is Wild : " + isWild);
        System.out.println("Type     : " + getType());
    }
}