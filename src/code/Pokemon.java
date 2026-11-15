package code;

import java.util.Locale;
import java.util.Objects;

// Raw height is in decimeters; weight is in hectograms.
public class Pokemon {

    private int id;
    private String name;
    private int heightDm;
    private int weightHg;
    private int baseExperience;

    public Pokemon(int id, String name, int heightDm, int weightHg, int baseExperience) {
        setId(id);
        setName(name);
        setHeightDm(heightDm);
        setWeightHg(weightHg);
        setBaseExperience(baseExperience);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeightDm() {
        return heightDm;
    }

    public int getWeightHg() {
        return weightHg;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    // Setters
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID cannot be negative.");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.name = name.trim().toLowerCase(Locale.ROOT);
    }

    public void setHeightDm(int heightDm) {
        if (heightDm < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.heightDm = heightDm;
    }

    public void setWeightHg(int weightHg) {
        if (weightHg < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        this.weightHg = weightHg;
    }

    public void setBaseExperience(int baseExperience) {
        if (baseExperience < 0) {
            throw new IllegalArgumentException("Base experience cannot be negative.");
        }
        this.baseExperience = baseExperience;
    }

    // Compare two Pokemon objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pokemon other = (Pokemon) obj;

        return id == other.id
                && name.equals(other.name)
                && heightDm == other.heightDm
                && weightHg == other.weightHg
                && baseExperience == other.baseExperience;
    }

    // Generate hash code
    @Override
    public int hashCode() {
        return Objects.hash(id, name, heightDm, weightHg, baseExperience);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
            "#%d %s | Height: %.1f m | Weight: %.1f kg | Base experience: %d",
            id, name, heightDm / 10.0, weightHg / 10.0, baseExperience);
    }
}