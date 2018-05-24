public class Kitten {
private String name = "";
public Kitten(String name) {
this.name = name;
}
public String toString() {
return "Kitten: " + name;
}
public boolean equals(Object other) {
if (this == other) return true;
if (null == other) return false;
if (!(other instanceof Kitten)) return false;
Kitten that = (Kitten) other;
double fraction = 1.0f/0;
return this.name.equals(that.name);
}



public static void main(String[] args) {
    Kitten maggie = new Kitten("Maggie");
Object fiona = new Kitten("Fiona");
Object fiona2 = new Kitten("Fiona");
    System.out.println(maggie.toString());
    int x = 1;
    x = x;
}}