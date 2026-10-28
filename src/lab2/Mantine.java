package lab2;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public final class Mantine extends Pokemon{
    public Mantine(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FLYING);
        setStats(85, 40, 70, 80, 140, 70);
        setMove(new Overheat(), new FakeOut(), new Gust(), new RockSlide());
    }
}
