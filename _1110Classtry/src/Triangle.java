public class Triangle {
    public int height;
    public int base;
    public double area=0.0;
    public Triangle(int h, int b){
        this.height=h;
        this.base=b;
    }
    public void Calculate1(){
        area=0.5*(double)height*(double)base;
    }
    public void print(){
        System.out.println("The Area of Triangle is: "+ area);
    }
}