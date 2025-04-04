
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String toString() {
        return name + ": " + description + " (Weight: " + weight + "kg)";
    }
    
}
