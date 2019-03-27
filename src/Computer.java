public class Computer {
    String processor;
    int memory;

    Computer(String proc, int mem){
        processor = proc;
        memory = mem;
        System.out.println("Tworzę nowy komputer");
    }

    String getInfo(){
        return processor + " " + memory;
    }
}
