public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(){
    }
    Rectangle(double width,double height){
        this.height = height;
        this.width = width;

    }
    Rectangle(double width, double height , String ShapeName , String color){
        super (ShapeName, color);
    }
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double width){
        this.width = width ;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
       public String toString(){
          return "Rectangle[" +
                  "width =" + width+
                  ", height =" + height +
                  ", shapeName =" + getShapeName() +
                  ", color =" +getColor() +
                  "]" ;
    }
    public double calArea(){
        return getHeight() * getHeight();
    }
}
