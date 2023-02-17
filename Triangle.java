class Triangle extends Shape implements Drawable{

    private double side1, side2, side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String name, boolean filled, double side1, double side2, double side3) {
        super(name, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public  void setId(int id){
        id = 1;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "-" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '-';
    }


    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
