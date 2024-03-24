public class Wall implements Obstacle {

    private int height;

    private String name;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Participant participant) {

        if (participant instanceof Cat) {
            participant.jump();
            System.out.println("Participant " + participant.getName() + " passed the obstacle '" + name + "' at the height: " + height +".");
            return true;
        } else {
            if (height <= 1) {
                participant.jump();
                System.out.println("Participant " + participant.getName() + " passed the obstacle '" + name + "' at the height: " + height + ".");
                return true;
            } else {
                participant.setEliminated(true);
                System.out.println("Participant " + participant.getName() + " did not pass the obstacle '" + name + "' at the height: " + height + ". Participant Eliminated.");
                return false;
            }
        }
    }
}
