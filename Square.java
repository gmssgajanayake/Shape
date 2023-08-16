public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(String colour, boolean filled, double side) {
        super(colour, filled, side, side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Rectangle - " +
                "\n\tColour : " + getColour()+
                "\n\tFilled : "+ isFilled()+
                "\n\tSide : "+ getLength()+
                "\n\tArea : "+getArea()+
                "\n\tPerimeter : "+getPerimeter();
    }
}
