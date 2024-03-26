import java.util.Scanner;

public class StuGiac {
    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static double calculateArea(Point A, Point B, Point C, Point D) {
        double area = 0.5 * Math.abs(A.x * B.y + B.x * C.y + C.x * D.y + D.x * A.y - B.x * A.y - C.x * B.y - D.x * C.y - A.x * D.y);
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tọa độ của điểm A: ");
        double Ax = scanner.nextDouble();
        double Ay = scanner.nextDouble();

        System.out.print("Nhập tọa độ của điểm B: ");
        double Bx = scanner.nextDouble();
        double By = scanner.nextDouble();

        System.out.print("Nhập tọa độ của điểm C: ");
        double Cx = scanner.nextDouble();
        double Cy = scanner.nextDouble();

        System.out.print("Nhập tọa độ của điểm D: ");
        double Dx = scanner.nextDouble();
        double Dy = scanner.nextDouble();

        Point A = new Point(Ax, Ay);
        Point B = new Point(Bx, By);
        Point C = new Point(Cx, Cy);
        Point D = new Point(Dx, Dy);

        double result = calculateArea(A, B, C, D);
        System.out.printf("Diện tích của tứ giác ABCD: %.3f%n", result);
    }
}

