package lab2;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class LeechLife extends PhysicalMove {
    public LeechLife() {
        super(Type.BUG, 80, 1.0, 0, 1);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        double missingHP = att.getStat(Stat.HP) - att.getHP();
        int restoredHP = (int) Math.min(damage / 2, missingHP);
        att.setMod(Stat.HP, -restoredHP);
    }

    @Override
    protected String describe() {
        return "использует LeechLife";
    }
}
