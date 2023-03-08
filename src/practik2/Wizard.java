package practik2;

public class Wizard extends Player{
    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + manaLevel + " " + element;
    }

    @Override
    void levelUp() {
        super.level++;
    }

    @Override
    boolean doDamage() {
        if (manaLevel >= 10) {
            this.manaLevel -= 10;
            return true;
        }
        return false;
    }
}
