public class Human implements Participant{

    private String name;
    private boolean eliminated;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("A human " + name + " is running!");
    }

    @Override
    public void jump() {
        System.out.println("A human " + name + " is jumping!");
    }

    @Override
    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }

    @Override
    public String getName() {
        return name;
    }
}
