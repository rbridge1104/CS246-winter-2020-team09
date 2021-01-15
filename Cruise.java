package shaik;

public class Cruise implements Expense {

    Destination _place;

    public Cruise (Destination place) {
        _place = place;
    }

    public float getCost() {
        switch(_place) {
            case Mexico:
                return 1000.00f;
            case Europe:
                return 2000.00f;
            case Japan:
                return 3000.00f;
            default:
                return 0.00f;
        }
    }
}
