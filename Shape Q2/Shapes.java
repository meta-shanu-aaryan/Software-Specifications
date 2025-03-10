import java.util.Scanner;

class ShapeArea {

    /**
     * Calculates Area of Triangle.
     * 
     * @param base   Base Length of triangle, requires that base can't be negative
     * @param height Height of triangle, requires that height can't be negative
     * @return area of triangle such that area = (base * height)/2
     */

    public double triangleArea(double base, double height) {
        try {
            if (base < 0 || height < 0) {
                throw new ArithmeticException("Can't calculate area for negative arguments");
            }
            double area = (base * height) / 2.0;

            return area;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /**
     * Calculates Area of Rectangle.
     * 
     * @param width  Base Length of rectangle, requires that length can't be
     *               negative
     * @param height Height of rectangle, requires that height can't be negative
     * @return area of rectangle such that area = width * height
     */
    public double rectangleArea(double width, double height) {
        try {
            if (width < 0 || height < 0) {
                throw new ArithmeticException("Can't calculate area for negative arguments");
            }
            double area = (width * height);

            return area;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

    }

    /**
     * Calculates Area of Square.
     * 
     * @param side side Length of square, requires that side can't be negative
     * @return area of square such that area = side * side
     */
    public double squareArea(double side) {
        try {
            if (side < 0) {
                throw new ArithmeticException("Can't calculate area for negative arguments");
            }
            double area = side * side;

            return area;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /**
     * Calculates Area of Circle.
     * 
     * @param radius Radius of circle, requires that radius can't be negative
     * @return area of circle, such that area = 3.14 * radius * radius
     */
    public double circleArea(double radius) {
        try {
            if (radius < 0) {
                throw new ArithmeticException("Can't calculate area for negative arguments");
            }
            double area = radius * radius * 3.14;

            return area;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea sa = new ShapeArea();

        boolean continuee = true;

        while (continuee) {

            System.out.println("What do you want to do?");
            System.out.println("To calculate area choose the shape accordingly...");
            System.out.println("1.  Triangle\n2.    Rectangle\n3.   Square\n4.  Circle");
            System.out.println("To Exit Press 5...");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Base");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height");
                    double height = sc.nextDouble();
                    System.out.println("Area of the triangle is " + sa.triangleArea(base, height));
                    break;
                case 2:
                    System.out.println("Enter the Width");
                    double width = sc.nextDouble();
                    System.out.println("Enter the height");
                    height = sc.nextDouble();
                    System.out.println("Area of the rectagle is " + sa.rectangleArea(width, height));
                    break;
                case 3:
                    System.out.println("Enter the side");
                    double side = sc.nextDouble();
                    System.out.println("Area of the square is " + sa.squareArea(side));
                    break;
                case 4:
                    System.out.println("Enter the Radius");
                    double radius = sc.nextDouble();
                    System.out.println("Area of the triangle is " + sa.circleArea(radius));
                    break;

                case 5:
                    continuee = false;
                    break;

                default:
                    break;
            }
        }

        sc.close();
    }
}
