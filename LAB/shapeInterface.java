import java.util.Scanner;

interface Shape {
    public void area();
}

class Circle implements Shape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void area() {
        float area = 3.14f * radius * radius;
        System.out.println("area = " + area);
    }
}

class Triangle implements Shape {

    float length, height;

    public Triangle(float length, float height) {
        this.length = length;
        this.height = height;
    }

    public void area() {
        float area = 0.5f * length * height;
        System.out.println("area = " + area);
    }

}

class ShapeAreas {
    public static void main(String ar[]) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius for circle: ");
        float r = obj.nextFloat();
        Circle c = new Circle(r);
        c.area();

        System.out.println("Enter length, height: ");
        float l = obj.nextFloat();
        float h = obj.nextFloat();
        Triangle t = new Triangle(l, h);
        t.area();

        obj.close();

    }
}
