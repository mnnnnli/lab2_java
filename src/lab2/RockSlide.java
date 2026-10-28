package lab2;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public final class RockSlide extends PhysicalMove{
    public RockSlide() {
        super(Type.ROCK, 75, 0.9, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3);

        if (e.success()) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}
