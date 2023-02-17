class Circle extends Ellipse implements Drawable {
    int radius;


    public Circle(){
        super();
    }
    public Circle(int centerX, int centerY, int radius) {
        super.setCenterX(centerX);
        super.setCenterY(centerY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return super.getCenterX();
    }

    public void setCenterX(int centerX) {
        super.setCenterX(centerX);
    }

    public int getCenterY() {
        return super.getCenterY();
    }

    public void setCenterY(int centerY) {
        super.setCenterY(centerY);
    }

    public int getRadiusX() {
        return super.getRadiusX();
    }

    public void setRadiusX(int radiusX) {
        super.setRadiusX(radiusX);
    }

    public int getRadiusY() {
        return super.getRadiusY();
    }

    public void setRadiusY(int radiusY) {
        super.setRadiusY(radiusY);
    }


    public  void setId(int id){
        id = 1;
    }

    @Override
    public String toString() {
        return super.toString() + "-" +
                "radius=" + radius +
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