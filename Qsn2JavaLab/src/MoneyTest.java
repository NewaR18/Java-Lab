class Money{
    public int rupee;
    public int paisa;
    public int carry=0;
    public void setMoney(int rupee, int paisa){
        this.rupee=rupee;
        this.paisa=paisa;
    }
    public void displayMoney(){
        System.out.println("\nThe addition of given money is "+ this.rupee+" Rupee "+this.paisa+" Paisa\n");
    }
    public void AddMoney(Money j1, Money j2){
        this.paisa=j1.paisa+j2.paisa;
        carry=this.paisa/100;
        this.paisa=this.paisa%100;
        this.rupee=j1.rupee+j2.rupee+carry;
    }
}
public class MoneyTest{
    public static void main(String[] args) {
        Money firstObj=new Money();
        Money secondObj=new Money();
        firstObj.setMoney(5,75);
        secondObj.setMoney(7,30);
        Money AddObj=new Money();
        AddObj.AddMoney(firstObj,secondObj);
        AddObj.displayMoney();
        System.out.println("\nLab no: 2 \nName: Sudip Shrestha \nRoll No/Section: 20/A");
    }
}