public class Rogue extends Character {
    public Rogue(String name, int seed) {
        super(name,seed);
    }
    public Rogue(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom){
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    public void attack(Character c) {
        if (c.getIsDead() == true) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + c.getDexterity()));
        }
    }
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getHealth());
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 3);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 2);
    }
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName() +
            " with " + this.getStrength() + " strength , " + this.getDexterity() + 
                " dexterity, " + this.getIntelligence() + " intelligence," +
                        " and " + this.getWisdom() + " wisdom.";
    }
}