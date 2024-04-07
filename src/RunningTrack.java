public class RunningTrack implements Obstacle {

    private int length;
    private String name;

    public RunningTrack(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {

        participant.run();
        System.out.println("Participant " + participant.getName() + " passed the obstacle '" + name + "' at the distance: " + length +".");
        return true;
    }
}
