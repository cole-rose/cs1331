import java.time.LocalDate;
public abstract class Cat implements Comparable {
    private String name;
    private LocalDate anniversary;
    public Cat(String name, LocalDate anniversary){
        this.name = name;
        this.anniversary = anniversary;
    }
    @Override 
    public int compareTo(Object o) {
        return 1;
    }
    public String getName() {
        return this.name;
    }
    public LocalDate getAnniversary() {
        return this.anniversary;
    }
}
