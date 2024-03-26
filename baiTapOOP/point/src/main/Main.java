package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách điểm
        ArrayList<Point2D> points2D = new ArrayList<>();
        points2D.add(new Point2D(1, 2));
        points2D.add(new Point2D(3, 4));
        points2D.add(new Point2D(5, 6));

        ArrayList<Point3D> points3D = new ArrayList<>();
        points3D.add(new Point3D(1, 2, 3));
        points3D.add(new Point3D(4, 5, 6));
        points3D.add(new Point3D(7, 8, 9));

        // Tính tổng khoảng cách điểm 2D
        double totalDistance2D = calculateTotalDistance2D(points2D);
        System.out.println("Tổng khoảng cách điểm 2D: " + totalDistance2D);

        // Tính tổng khoảng cách điểm 3D
        double totalDistance3D = calculateTotalDistance3D(points3D);
        System.out.println("Tổng khoảng cách điểm 3D: " + totalDistance3D);

     // Đưa các điểm đối xứng vào danh sách
        ArrayList<Point2D> newPoints2D = new ArrayList<>();
        for (Point2D point : points2D) {
            newPoints2D.add(point);
            newPoints2D.add(point.symmetry());
        }
        points2D = newPoints2D;

        ArrayList<Point3D> newPoints3D = new ArrayList<>();
        for (Point3D point : points3D) {
            newPoints3D.add(point);
            newPoints3D.add(point.symmetry());
        }
        points3D = newPoints3D;

        // Hiển thị danh sách
        System.out.println("Danh sách điểm 2D và 3D sau khi thêm các điểm đối xứng:");
        for (Point2D point : points2D) {
            System.out.println(point);
        }
        for (Point3D point : points3D) {
            System.out.println(point);
        }
    }

    private static double calculateTotalDistance2D(ArrayList<Point2D> points) {
        double totalDistance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalDistance += points.get(i).distance(points.get(i + 1));
        }
        return totalDistance;
    }
    
    private static double calculateTotalDistance3D(ArrayList<Point3D> points) {
        double totalDistance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalDistance += points.get(i).distance(points.get(i + 1));
        }
        return totalDistance;
    }
}