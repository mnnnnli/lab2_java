package lab2;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public final class Spark extends PhysicalMove {
    public Spark() {
        super(Type.ELECTRIC, 65, 1.0, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3);

        if (e.success()) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Spark";
    }
}
