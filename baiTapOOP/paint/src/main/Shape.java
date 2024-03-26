package main;

public interface Shape {
	//nhom tinh toan 
	double area();
    double perimeter();
    double distance(Shape other);
  //nhom bien doi
    void move(int deltaX, int deltaY);
    void rotate(double angle);
    void zoom(double factor);
}
