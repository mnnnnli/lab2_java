package lab2;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public final class Swagger extends StatusMove{
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
