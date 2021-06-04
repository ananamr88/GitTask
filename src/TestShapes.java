public class TestShapes{

    public static void main(String[] args) {
        Shape [] shapes = new Shape [9];

        shapes [0] = new Circle (1, Shape.RED);
        shapes [1] = new Circle (2, Shape.BLUE);
        shapes [2] = new Circle (3, Shape.GREEN);
        shapes [3] = new Rectangle (1,4, Shape.RED);
        shapes [4] = new Rectangle (2,5, Shape.BLUE);
        shapes [5] = new Rectangle (3,6, Shape.GREEN);
        shapes [6] = new Square (1, Shape.RED);
        shapes [7] = new Square (2, Shape.BLUE);
        shapes [8] = new Square (3, Shape.GREEN);
        
        for (int i = 1; i < 9; i++)
        {
            System.out.println ("Shape number " + i + " is instance of "
                    + shapes [i].getClass()
                    + shapes [i].toString());
        }
    }
}
