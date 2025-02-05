public class ShapeAreaCalculator {

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1; 
    }

    public static void main(String[] args) {
        // Example calculations using method overloading

        // Area of a circle with radius 5
        double circleArea = calculateArea(5.0);
        System.out.println("Area of the circle: " + circleArea);

        // Area of a rectangle with length 10 and width 5
        double rectangleArea = calculateArea(10.0, 5.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Area of a triangle with base 8 and height 6
        double triangleArea = calculateArea(8.0, 6.0, true);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
