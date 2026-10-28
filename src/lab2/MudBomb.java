package lab2;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public final class MudBomb extends SpecialMove{
    public MudBomb() {
        super(Type.GROUND, 65, 0.85, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3);
        if (e.success()) {
            p.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Mud Bomb";
    }

}
