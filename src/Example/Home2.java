package Example;

public class Home2 {
    int price;
    String location;
    int floor;

    public Home2(int price, String location, int floor) {
        this.price = price;
        this.location = location;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Home2{" +
                "price=" + price +
                ", location='" + location + '\'' +
                ", floor=" + floor +
                '}';
    }
}
