
public class Circle extends foursided{
    public float radius;
    final float PI=3.1415F;
    public Circle(float radius){
        this.radius=radius;
    }
    public void calculatethis(){
        area=PI*Math.pow(radius,2);
        perimeter=2*PI*radius;
    }
}
