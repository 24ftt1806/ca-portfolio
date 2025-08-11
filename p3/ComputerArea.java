public class ComputerArea {   //3.1
    public static void main(String[] args) {
        final double base = 4.0;
        final double height= 6.0;
        final double radius = 8.0;

        final double areaOfsquare = base*base;
        final double areaOfTriangle = 0.5 * base * height;
        final double areaOfCircle = Math.PI * radius * radius;

        System.out.println("The area of square is "+ areaOfsquare + "\n");
        System.out.println("The area of triangle is "+ areaOfTriangle + "\n");
        System.out.println("The area of circle is "+ areaOfCircle + "\n");


    }
}
