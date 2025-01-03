
package viva3;

public class ZooTest {
    public static void main(String[] args){
        // create a new zoo with space for 5 creatures
        Zoo myZoo = new Zoo(5);
        
        // add creatures to zoo 
        myZoo.addCreature("Panda", 150.0, "Mountains");
        myZoo.addCreature("Dragon", 300.0, "Cave");
        myZoo.addCreature("Master Oogway", 200.0, "Forest");
        
        // to try add 2 more creature to test the full zoo
        myZoo.addCreature("Patrick Star", 250.0, "Rock");
        myZoo.addCreature("Gorilla", 420.0, "Jungle");
        
        // display all creatures in the zoo
        myZoo.displayAllCreatures();
        
        // feed dragon and patrick star
        myZoo.feedCreature("Dragon", 50.0);
        myZoo.feedCreature("Patrick Star", 1000.0);
        
        
        // display updated creature details
        myZoo.displayAllCreatures();
    }
    
}
