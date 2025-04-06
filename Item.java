
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;
    private double weight;
    /**
     * Constructor for objects of class Item
     */
    public Item(String name,String description, double weight)
    {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
    
    public String  getDescription() {
        return name + ": " + description + " (Weight: " + weight + "kg)";
    }
    
}
