public class rectangle extends foursided{
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void calculatethis(){
        area=  length*breadth;
        perimeter= 2*(length+breadth);
    }
}
