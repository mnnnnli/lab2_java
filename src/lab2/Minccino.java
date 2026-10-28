package lab2;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Minccino extends Pokemon{
    public Minccino(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 50, 40, 40, 40, 75);
        setMove(new Swagger(), new Spark(), new MudBomb(), new SuperFang());
    }
}
