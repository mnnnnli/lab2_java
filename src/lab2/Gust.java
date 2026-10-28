package lab2;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Gust extends SpecialMove{
    public Gust() {
        super(Type.FLYING, 40, 1.0, 0, 1);
    }

    @Override
    protected String describe() {
        return "использует Gust";
    }
}
