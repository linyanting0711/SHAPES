class Ellipse extends Shape implements Drawable{

    private int centerX, centerY, radiusX, radiusY;

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public void setRadiusX(int radiusX) {
        this.radiusX = radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }

    public void setRadiusY(int radiusY) {
        this.radiusY = radiusY;
    }

    public  void setId(int id){
        id = 1;
    }

    public Ellipse() {
        super();
    }

    public Ellipse(int centerX, int centerY, int radiusX, int radiusY) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    public Ellipse(String name, boolean filled, int centerX, int centerY, int radiusX, int radiusY) {
        super(name, filled);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "-" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radiusX=" + radiusX +
                ", radiusY=" + radiusY +
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