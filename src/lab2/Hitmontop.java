package lab2;

public final class Hitmontop extends Tyrogue{
    public Hitmontop(String name, int level) {
        super(name, level);
        setStats(50, 95, 95, 35, 110, 70);
        addMove(new LeechLife());
    }

}
