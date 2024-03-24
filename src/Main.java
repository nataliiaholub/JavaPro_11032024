import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<GeometricFigure> geometricFigures = new ArrayList<>();

        geometricFigures.add(new Circle(2.0));
        geometricFigures.add(new Triangle(5.0, 9.0));
        geometricFigures.add(new Square(4.0));

        double totalArea = calculateTotalArea(geometricFigures);

        System.out.println("Total area of all shapes: " + totalArea);

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