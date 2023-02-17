abstract class Shape  //The base parent abstract class
{
    private String shapeName;
    private boolean filled;

    public Shape() {
    }

    public Shape(String name, boolean filled)
    {
        this.shapeName = name;
        this.filled = filled;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract void setId(int id);
    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                ", filled=" + filled +
                '}';
    }
}


