public class Cleric extends Character {
    public Cleric(String name, int seed) {
        super(name, seed);
    }
    public Cleric(String name, int level,
                     int strength, int dexterity,
                        int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (10 + this.getWisdom()));
        }
    }
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getHealth());
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 2);
    }
    @Override
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName()
            + " with " + this.getStrength() + " strength , "
                + this.getDexterity() + " dexterity, " + this.getIntelligence()
                    + " intelligence," + " and " + this.getWisdom()
                        + " wisdom.";
    }
    public void healer(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot heal a dead character");
        } else {
            c.setHealth(c.getHealth() + 6 + this.getWisdom());
        }
    }
}
