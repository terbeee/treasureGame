public class Monster extends Player{
    private String name;
    private String greeting;


    public Monster(int w, int h, String name, String greeting) {
        super(w, h);
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
