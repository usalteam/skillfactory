package practic1;

public class Mage {
    private String name;
    private int level;
    private int damage;
    private String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return "{"+name+", "+level+", "+damage+", "+type+"}";
    }

    public static String fight( Mage mage1, Mage mage2) {
        if (mage1.type == mage2.type) {
            if (mage1.level == mage2.level) {
                if (mage1.damage == mage2.damage) {
                    return "draw";
                }
                else if (mage1.damage > mage2.damage) {
                    return mage1.name;
                }
                else {
                    return mage2.name;
                }
            }
            else if (mage1.level > mage2.level) {
                return mage1.name;
            }
            else {
                return mage2.name;
            }
        }
        else if (mage1.type.equals("fire") && mage2.type.equals("ice")
            || mage1.type.equals("ice") && mage2.type.equals("earth")
            || mage1.type.equals("earth") && mage2.type.equals("fire")) {
            return mage1.name;
        }
        else {
            return mage2.name;
        }
    }
}
