public interface Participant {
    void run();

    void jump();

    boolean isEliminated();

    void setEliminated(boolean eliminated);

    String getName();

}
