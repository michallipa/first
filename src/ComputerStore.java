public class ComputerStore {
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = new Computer("Interl i5", 8129);
        Computer comp2 = new Computer("AMD Ryzen 1700", 16384);


        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1,4096);

        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());
    }
}
