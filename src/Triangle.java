public class Triangle {
    int a = 0, b = 0, c = 0;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getType() {
        if (!isTriangle(a, b, c)) {
            return "isn't triangle";
        } else if (isEquilateral(a, b, c)) {
            return "equilateral";
        } else if (isIsosceles(a, b, c)) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
    public boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }
    private boolean isIsosceles(int a, int b, int c) {
        return a == b || a == c || b == c;
    }
    private boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}
