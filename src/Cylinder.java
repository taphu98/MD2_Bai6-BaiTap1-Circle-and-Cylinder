public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(int height){
        this.height = height;
    }
    public Cylinder(double height,double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString(){
        return "Thể tích hình trụ là " + getVolume();
    }
}
