package lab2;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Tyrogue extends Pokemon{
    public Tyrogue(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(35, 35, 35, 35, 35, 35);
        setMove(new FakeOut(), new Overheat(), new DoubleTeam());
    }
}
