public class Car_client {
    public static void main(String[] args){
        Car c = new Car("black", 1959, 25);
        Car c1 = new Car("Red", 19029, 23);
        c.SetPrice(-1000);
        c.Display();
        c1.Display(); 
    }
}
