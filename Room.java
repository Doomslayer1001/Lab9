import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    public String description;
    private HashMap<String, Room> exit;
    private ArrayList<Item> items;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) {
        this.description = description;
        exit = new HashMap<>();
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Room getExit(String direction) {
        return exit.get(direction);
    }

    public String getLongDescription() {
        return "You are " + description + ".\n" + getExitString() + ".\n"  + getItemDescriptions();
    }

    private String getExitString() {
        String exitString = "Exit:";
        for (String direction : exit.keySet()) {
            exitString += " " + direction;
        }
        return exitString;
    }

    private String getItemDescriptions() {
        if (items.isEmpty()) {
            return "There are no items here.";
        }

        String description = "Items in the room:";
        for (Item item : items) {
            description += "\n - " + item.getDescription();
        }
        return description;
    }

    /**
     * Define the exits of this room. Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExit(String direction, Room neighbor) {
        exit.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription() {
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