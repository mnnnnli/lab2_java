package lab2;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class Overheat extends SpecialMove {
    public Overheat() {
        super(Type.FIRE, 130, 0.9, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует Overheat";
    }
}
