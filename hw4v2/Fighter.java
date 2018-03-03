public class Fighter extends Character {
    public Fighter(String name, int seed) {
        super(name,seed);
    }
    public Fighter(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom){
        super(name, level, strength, dexterity, intelligence, wisdom);
    }
    public void attack(Character c) {
        if (c.getIsDead() == true) {
            System.out.println("Cannot attack a dead character");
        }
        else {
            c.setHealth(c.getHealth() - (10 + this.getStrength()));
        }
    }
    public void levelUp() {
            setLevel(getLevel() + 1);
            setHealth(5 * getLevel());
            setStrength(getStrength() + 2);
            setDexterity(getDexterity() + 1);
            setIntelligence(getIntelligence() + 1);
            setWisdom(getWisdom() + 1);
    }
    @Override
    public String toString() {
        return "Level " + this.getLevel() + " fighter named " + this.getName() +
            " with " + this.getStrength() + " strength , " + this.getDexterity() + 
                " dexterity, " + this.getIntelligence() + " intelligence," +
                        " and " + this.getWisdom() + " wisdom.";

    }
}
