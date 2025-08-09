public class Car {
    private String color;
    private int price;
    private int speed;
    public Car(String color, int price, int speed){
        this.color = color;
        this.price = price;
        this.speed = speed;
    }
    public void Setcolor(String color){
        this.color = color;
    }
    public void SetPrice (int price){
        try {
            if(price<0){
            throw new Exception("Bklol price kabhi -ve nhi hota");
        }
        this.price = price;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("I am in Finally");
        }
    }
    public void SetSpeed(int speed){
        if(speed<0){
            return;
        }
        this.speed = speed;
    }
    public String Getcolor(){
        return this.color;
    }
    public int Getprice(){
        return this.price;
    }
    public int Getspeed(){
        return this.speed;
    }
    public void Display(){
        System.out.println("c "+this.color+" p "+this.price+" s"+this.speed);
    }
}
