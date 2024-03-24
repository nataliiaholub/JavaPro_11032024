import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<GeometricFigure> geometricFigures = new ArrayList<>();

        geometricFigures.add(new Circle(2.0));
        geometricFigures.add(new Triangle(5.0, 9.0));
        geometricFigures.add(new Square(4.0));

        double totalArea = calculateTotalArea(geometricFigures);

        System.out.println("Total area of all shapes: " + totalArea);

        Participant[] participants = {
            new Human("Mike"),
            new Cat("Whiskas"),
            new Robot("M-500")
        };

        Obstacle[] obstacles = {
                new RunningTrack("Track 1. Short", 1000),
                new Wall("Wall 1. Low", 1),
                new RunningTrack("Track 2. Long", 2000),
                new Wall("Wall 2. High", 2)
        };

        for (Participant participant : participants) {
            boolean eliminated = false;

            for (Obstacle obstacle : obstacles) {
                if (!eliminated) {
                    boolean success = obstacle.overcome(participant);
                    if (!success) {
                        eliminated = true;
                    }
                }
            }
        }

    }

    private static double calculateTotalArea(ArrayList<GeometricFigure> shapes){
        double totalArea = 0.0;
        for (int i = 0; i < shapes.size(); i++) {
            GeometricFigure shape = shapes.get(i);
            totalArea +=shape.getArea();
        }
        return totalArea;
    }
}