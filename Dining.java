package shaik;

public class Dining implements Expense {

    Destination _place;
    int _day;

    public Dining (Destination place, int day) {
        _place = place;
        _day = day;
    }

    public float getCost() {
        switch(_place) {
            case Mexico:
                return _day*10.00f;
            case Europe:
                return _day*20.00f;
            case Japan:
                return _day*30.00f;
            default:
                return _day*0.00f;
        }
    }
}

