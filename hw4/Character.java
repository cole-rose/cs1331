import java.util.Random;
/**
 * @author crose37
 * @version 1.2
 * abstract class used as the foundation to build a character
 */
public abstract class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int health;
    private boolean isDead = false;
    public static final int INITIALLEVEL = 1;
    public static final int INITIALHEATH = 5;
    /**
     * fiirst Character constructor taking in a name and a seed
     * @param  name character name
     * @param  seed integer used as a seed for the randmom class
     */
    public Character(String name, int seed) {
        //implement this constructor using constructor delegation
        this.name = name;
        setLevel(INITIALHEATH);
        setHealth(INITIALLEVEL);
        Random oneToSix = new Random();
        int randomStrength = oneToSix.nextInt(6) + 1;
        setStrength(randomStrength);
        int randomDexterity = oneToSix.nextInt(6) + 1;
        setDexterity(randomDexterity);
        int randomIntelligence = oneToSix.nextInt(6) + 1;
        setIntelligence(randomIntelligence);
        int randomWisdom = oneToSix.nextInt(6) + 1;
        setWisdom(randomWisdom);
    }
    /**
     * second Character constructor taking in a name, level, strength
     * dexterity, intelligence, and wisdom value for a constructor
     * @param  name         character name
     * @param  level        character level
     * @param  strength     character strength
     * @param  dexterity    characters dexterity
     * @param  intelligence characters intelligence
     * @param  wisdom       characters wisdom
     */
    public Character(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        this.name = name;
        setHealth(5 * level);
        setLevel(level);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        //implement this constructor
    }
    /**
     * getter method for character name
     * @return character's name
     */
    public String getName() {
        //implement this method
        return this.name;
    }
    /**
     * getter method for character level
     * @return character's level
     */
    public int getLevel() {
        //implement this method
        return this.level;
    }
    /**
     * setter method for setting charcter's level
     * @param level character's level
     */
    public void setLevel(int level) {
        //implement this method
        this.level = level;
    }
    /**
     * getter method for character's strength
     * @return character's strength
     */
    public int getStrength() {
        //implement this method
        return this.strength;
    }
    /**
     *setter method for character's strength
     * @param strength character's strength
     */
    public void setStrength(int strength) {
        //implement this method
        this.strength = strength;
    }
    /**
     * getter method for character's dexterity
     * @return character's dexterity
     */
    public int getDexterity() {
        //implement this method
        return this.dexterity;
    }
    /**
     * setter method for character's dexterity
     * @param dexterity character's dexterity
     */
    public void setDexterity(int dexterity) {
        //implement this method
        this.dexterity = dexterity;
    }
    /**
     * getter method for character's intelligence
     * @return [description]
     */
    public int getIntelligence() {
        //implement this method
        return this.intelligence;
    }
    /**
     *setter method for characters intelligence
     * @param intelligence integer representation of characters intelligence
     */
    public void setIntelligence(int intelligence) {
        //implement this method
        this.intelligence = intelligence;
    }
    /**
     * getter method for a characters wisdom
     * @return returns integer of character's wisdom
     */
    public int getWisdom() {
        //implement this method
        return this.wisdom;
    }
    /**
     * setter method for characters wisdom
     * @param wisdom characters widsom
     */
    public void setWisdom(int wisdom) {
        //implement this method
        this.wisdom = wisdom;
    }
    /**
     * getter method for characters health
     * @return characters health
     */
    public int getHealth() {
        //implement this method
        return this.health;
    }
    /**
     * setter method for characters health
     * @param health character's health
     */
    public void setHealth(int health) {
        //implement this method
        if (health < 0) {
            this.isDead = true;
            this.health = 0;
        } else if (health > 5 * this.getLevel()) {
            System.out.println("Health cannot be set above max.");
        } else {
            this.health = health;
        }
    }
    /**
     * tells whether or not a character is dead
     * @return true if characters dead false otherwise
     */
    public boolean getIsDead() {
        //implement this method
        return this.isDead;
    }
    /**
     * setter method for characters status of living
     * @param isDead represents whether character is dead or notcd
     */
    public void setIsDead(boolean isDead) {
        //implement this method
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
