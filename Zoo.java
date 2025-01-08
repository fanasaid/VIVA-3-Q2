
package VIVA3Q2;
import java.util.ArrayList;
class Zoo {
    private final ArrayList<Creature> creatures;
    private final int numCreatures;
    private boolean isFullMessageShown = false;
    
    public Zoo(int numCreatures) {
        this.numCreatures = numCreatures;
        creatures = new ArrayList<>();
    }
    
    // method to add creature
    public void addCreature(String species, double magicPower, String habitat){
        if(creatures.size()<numCreatures){
            creatures.add(new Creature(species, magicPower, habitat));
            System.out.println(species + " added to the zoo.");
        } else{
            if(!isFullMessageShown){
                System.out.println("Zoo is full! Cannot add more creatures.");
                isFullMessageShown = true; // Prevent repeated messages
                System.out.println();               
            }           
        }
    }  
    // method to feed creature
    public void feedCreature(String species, double foodAmount) {
     // for ( datatype item : array)
        for (Creature creature : creatures) {
            if (creature.getSpecies().equals(species)) {
                creature.feed(foodAmount);
                return;
        }
      }
        System.out.println("Creature not found in the zoo.");    
    }
    
    // method to display all creatures
    public void displayAllCreatures(){
        System.out.println();
        for (Creature creature : creatures){
            creature.displayInfo();
            System.out.println();
        }
    }
    
}
