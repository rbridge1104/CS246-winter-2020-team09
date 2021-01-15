package shaik;

public class Lodging implements Expense {

    Destination _place;
    int _day;

    public Lodging (Destination place, int day) {
        _place = place;
        _day = day;
    }

    public float getCost() {
        switch(_place) {
            case Mexico:
                return _day*100.00f;
            case Europe:
                return _day*200.00f*1.10f;
            case Japan:
                return _day*300.00f*1.30f;
            default:
                return _day*0.00f;
        }
    }
}

