public class Fighter extends Character {
    public Fighter(String name, int seed) {
        super(name, seed);
    }
    /**
     * second Fighter constructor taking in a name, level, strength
     * dexterity, intelligence, and wisdom value for a constructor
     * @param  name         fighter name
     * @param  level        fighter level
     * @param  strength     fighter strength
     * @param  dexterity    fighter dexterity
     * @param  intelligence fighter intelligence
     * @param  wisdom       fighter wisdom
     */
    public Fighter(String name, int level,
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
            c.setHealth(c.getHealth() - (10 + this.getStrength()));
        }
    }
    /**
     * method used to level up characters attributes
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(5 * getLevel());
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 1);
    }
    /**
     * string representation of class
     * @return string description of character
     */
    @Override
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName()
            + " with " + this.getStrength() + " strength , "
                + this.getDexterity() + " dexterity, " + this.getIntelligence()
                    + " intelligence," + " and " + this.getWisdom()
                        + " wisdom.";
    }
}
