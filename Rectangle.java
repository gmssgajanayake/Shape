public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        width=1.0;
        length =1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String toString(){
        return "Rectangle - " +
                "\n\tColour : " + getColour()+
                "\n\tFilled : "+ isFilled()+
                "\n\tLength : "+ length+
                "\n\tWidth : "+width+
                "\n\tArea : "+getArea()+
                "\n\tPerimeter : "+getPerimeter();
    }
}
