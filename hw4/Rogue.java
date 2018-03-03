/**
 * class representing fighter character
 * @author crose37
 * @version 2.3.3
 */
public class Rogue extends Character {
    /**
     * rogue constructor num 1
     * @param  name name of fighter
     * @param  seed starting point of Random sseed
     */
    public Rogue(String name, int seed) {
        super(name, seed);
    }
    /**
     * second Rogue constructor
     * @param  name         rogues name
     * @param  level        rogues level
     * @param  strength     rogues strength
     * @param  dexterity    rogues dexterity
     * @param  intelligence rogues intelligence
     * @param  wisdom       rogues wisdom
     */
    public Rogue(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    /**
     * method used to attack other characters
     * @param c takes in another character
     */
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + c.getDexterity()));
        }
    }
    /**
     * method used to level up characters attributes
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getHealth());
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 3);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 2);
    }
    /**
     * string representation of class
     * @return string description of character
     */
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName()
            + " with " + this.getStrength() + " strength , "
                + this.getDexterity() + " dexterity, " + this.getIntelligence()
                    + " intelligence," + " and " + this.getWisdom()
                        + " wisdom.";
    }
}