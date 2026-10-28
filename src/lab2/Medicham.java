package lab2;

public final class Medicham extends Meditite{
    public Medicham(String name, int level) {
        super(name, level);
        setStats(60, 60, 75, 60, 75, 80);
        addMove(new Gust());
    }
}
