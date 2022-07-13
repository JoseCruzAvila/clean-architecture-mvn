package co.com.sofka.usecase;

import co.com.sofka.model.Pet;
import co.com.sofka.model.gateway.PetRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProcessPetUseCase {
    private final PetRepository repository;

    public ProcessPetUseCase(PetRepository repository) {
        this.repository = repository;
    }

    public Mono<Pet> savePet(Pet pet) {
        return repository.save(pet);
    }

    public Flux<Pet> allPets() {
        return repository.findAll();
    }

    public Mono<Pet> petById(String id) {
        return repository.findById(id);
    }

    public Mono<String> deletePetById(String id) {
        try {
            return repository.deleteById(id).then(Mono.just("Successfully deleted " + id));
        } catch (Exception e) {
            return Mono.just(e.getMessage());
        }
    }
}
