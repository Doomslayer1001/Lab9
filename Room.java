import java.util.HashMap;


/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    public String description;
    private HashMap<String, Room> exit;
    private Item item;
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exit = new HashMap<>(); 
        this.item = null;
    }
    
    public void setItem(Item item){
        this.item = item;
    }
    
    public Item getItem() {
        return item;
    }
    
    public Room getExit(String direction){
        Room nextRoom = exit.get(direction);
        return nextRoom;
    }
    
    public String getLongDescription(){
        return "You are " + description + ".\n" + getExitString() + ".\n" + item.getDescription();
    }
    
    private String getExitString(){
        String exitString = "\nExit: ";
        for(String direction : exit.keySet()) {
            exitString += (" "+direction);
        }
        return exitString;
    }
    
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exit.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    
}
//public Room getExit(String direction){
     //   Room nextRoom = exit.get(direction);
        //if(direction.equals("north")) {
        //    nextRoom = northExit;
        //}
        //if(direction.equals("east")) {
        //   nextRoom = eastExit;
        //}
        //if(direction.equals("south")) {
        //    nextRoom = southExit;
        //}
        //if(direction.equals("west")) {
        //    nextRoom = westExit;
        //}
     //   return nextRoom;
    //}