package lab2;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meditite extends Pokemon{
    public Meditite(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING, Type.PSYCHIC);
        setStats(30, 40, 55, 40, 55, 60);
        setMove(new FakeOut(), new Overheat());
    }
}
