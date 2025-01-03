
package viva3;

public class Creature {
    private String species;
    private double magicPower;
    private String habitat;
    
    public Creature(String species, double magicPower, String habitat){
        this.species = species;
        this.magicPower = magicPower;
        this.habitat = habitat;
    }
    
    // getter method for species name
    public String getSpecies(){
        return species;
    }
    
    // method to increase creature's magic power
    public void feed(double foodAmount){
        magicPower += foodAmount;
        System.out.println(species + "'s magic power increased to "+ magicPower + ".");
        System.out.println();
    }
    
    // to display creature details
    public void displayInfo(){
        System.out.println("Species: "+ species);
        System.out.println("Magic Power: "+ magicPower);
        System.out.println("Habitat: "+ habitat);
    }
}
