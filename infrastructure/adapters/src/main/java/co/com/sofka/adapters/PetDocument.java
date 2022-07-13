package co.com.sofka.adapters;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PetDocument {
    @Id
    private String id;
    private String name;
    private String breed;

    public PetDocument() {

    }

    public PetDocument(String id, String name, String breed) {
        this.setId(id);
        this.setName(name);
        this.setBreed(breed);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
