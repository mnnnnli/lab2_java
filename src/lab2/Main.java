package lab2;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Minccino minccino1 = new Minccino("Minccino", 1);
        Tyrogue tyrogue1 = new Tyrogue("Tyrogue", 1);
        Hitmontop hitmontop1 = new Hitmontop("Hitmontop", 20);
        Meditite meditite1 = new Meditite("Meditite", 1);
        Medicham medicham1 = new Medicham("Medicham", 37);
        Mantine mantine1 = new Mantine("Mantine", 1);

        battle.addAlly(minccino1);
        battle.addAlly(tyrogue1);
        battle.addAlly(hitmontop1);
        battle.addFoe(meditite1);
        battle.addFoe(medicham1);
        battle.addFoe(mantine1);

        battle.go();
    }
}
