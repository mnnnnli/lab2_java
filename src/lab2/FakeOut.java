package lab2;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public final class FakeOut extends PhysicalMove {
    public FakeOut() {
        super(Type.NORMAL, 40, 1.0, 3, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.flinch(p);
    }
    @Override
    protected String describe() {
        return "использует Fake Out";
    }
}
