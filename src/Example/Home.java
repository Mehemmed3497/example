package Example;

public class Home {
    int price;
    String location;
    int floor;

    public Home(int price, String location, int floor) {
        this.price = price;
        this.location = location;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Home{" +
                "price=" + price +
                ", location='" + location + '\'' +
                ", floor=" + floor +
                '}';
    }
}
