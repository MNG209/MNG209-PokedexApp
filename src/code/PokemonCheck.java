package code;

public class PokemonCheck {

    public static void main(String[] args) {

        // Create two Pokemon with the same values
        Pokemon pokemon1 = new Pokemon(25, "pikachu", 4, 60, 112);
        Pokemon pokemon2 = new Pokemon(25, "pikachu", 4, 60, 112);

        // Test equals and hashCode
        System.out.println("Pokemon 1: " + pokemon1);
        System.out.println("Pokemon 2: " + pokemon2);

        System.out.println("Equal before change: " + pokemon1.equals(pokemon2));
        System.out.println("Hash codes match: " + (pokemon1.hashCode() == pokemon2.hashCode()));

        // Change base experience
        pokemon2.setBaseExperience(999);

        System.out.println("\nAfter changing base experience:");
        System.out.println("Equal after change: " + pokemon1.equals(pokemon2));

        // Test getters
        System.out.println("\nTesting getters:");
        System.out.println("ID: " + pokemon1.getId());
        System.out.println("Name: " + pokemon1.getName());
        System.out.println("Height: " + pokemon1.getHeightDm());
        System.out.println("Weight: " + pokemon1.getWeightHg());
        System.out.println("Base Experience: " + pokemon1.getBaseExperience());

        // Test setters
        pokemon1.setId(26);
        pokemon1.setName(" Raichu ");
        pokemon1.setHeightDm(8);
        pokemon1.setWeightHg(300);
        pokemon1.setBaseExperience(218);

        System.out.println("\nAfter testing setters:");
        System.out.println(pokemon1);

        // Test equals with null and a different type
        System.out.println("\nTesting equals:");
        System.out.println("Equals null: " + pokemon1.equals(null));
        System.out.println("Equals String: " + pokemon1.equals("Raichu"));

        // Test invalid name
        try {
            pokemon1.setName("   ");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid name rejected: " + e.getMessage());
        }

        // Test null name
        try {
            pokemon1.setName(null);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Null name rejected: " + e.getMessage());
        }

        // Test invalid ID
        try {
            pokemon1.setId(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid ID rejected: " + e.getMessage());
        }

        // Test invalid height
        try {
            pokemon1.setHeightDm(-5);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid height rejected: " + e.getMessage());
        }

        // Test invalid weight
        try {
            pokemon1.setWeightHg(-10);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid weight rejected: " + e.getMessage());
        }

        // Test invalid base experience
        try {
            pokemon1.setBaseExperience(-50);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid base experience rejected: " + e.getMessage());
        }
    }
}