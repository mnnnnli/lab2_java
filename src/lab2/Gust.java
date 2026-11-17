package lab2;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class Gust extends SpecialMove{
    public Gust() {
        super(Type.FLYING, 40, 1.0, 0, 1);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (damage < 1) {
            damage = 1;
        }

        if (damage > def.getHP()) {
            damage = Math.ceil(def.getHP());
        }

        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected String describe() {
        return "использует Gust";
    }
}

