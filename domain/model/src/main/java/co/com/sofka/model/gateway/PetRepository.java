package co.com.sofka.model.gateway;

import co.com.sofka.model.Pet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PetRepository {
    Mono<Pet> save(Pet pet);

    Flux<Pet> findAll();

    Mono<Pet> findById(String id);

    Mono<Void> deleteById(String id);
}
