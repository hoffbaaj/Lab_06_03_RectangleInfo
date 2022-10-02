import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        double length, breadth, area, perimeter, diagonal;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lenght: ");
        length = input.nextFloat();
        System.out.println("Enter the breadth: ");
        breadth = input.nextFloat();

        if (length > 0 && breadth > 0)
        {
            area = length * breadth;
            perimeter = 2 * (length + breadth);
            diagonal = Math.pow((Math.pow(length, 2) + Math.pow(breadth, 2)), 0.5);
            System.out.printf("\nArea : %.2f \nPerimeter : %.2f\nDiagonal : %.2f", area, perimeter, diagonal);
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}