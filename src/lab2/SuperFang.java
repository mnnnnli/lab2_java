package lab2;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class SuperFang extends PhysicalMove {
    public SuperFang() {
        super(Type.NORMAL, 0, 0.9, 0, 1);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.hasType(Type.GHOST)) {
            return;
        }

        int hp = Math.max(1, (int) (def.getHP() / 2));
        def.setMod(Stat.HP, hp);
    }

    @Override
    protected String describe() {
        return "использует Super Fang";
    }
}
