public class Robot implements Participant{

    private String name;
    private boolean eliminated;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " is running!");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " is jumping!");
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
