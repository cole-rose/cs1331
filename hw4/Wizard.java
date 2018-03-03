public class Wizard extends Character {
    public Wizard(String name, int seed) {
        super(name, seed);
    }
    public Wizard(String name, int level,
                     int strength, int dexterity,
                        int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (4 + this.getIntelligence()));
        }
    }
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getHealth());
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 1);
    }
    @Override
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName()
            + " with " + this.getStrength() + " strength , "
                + this.getDexterity() + " dexterity, " + this.getIntelligence()
                    + " intelligence," + " and " + this.getWisdom()
                        + " wisdom.";
    }
    public void multiAttack(Character ... c) {
        for (Character i : c) {
            if (i.getIsDead()) {
                System.out.println("Cannot damage a dead character");
            } else {
                this.setHealth(i.getHealth() - (2 + this.getIntelligence()));
            }
        }
    }
}
