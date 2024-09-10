public class Shape {
    private String shapeName;
    private String color;

    Shape(){
    }
    Shape(String shapeName,String color){
        this.shapeName =shapeName;
        this.color =color;
    }
    public String getShapeName() {
        return shapeName;
    }
    public String getColor(){
        return color;
    }
    public void setShapeName(String shapeName){
        this.shapeName = shapeName;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "hình cn của bạn :" +
                "name = " + shapeName +
                " color = " + color
                 ;
    }
}
