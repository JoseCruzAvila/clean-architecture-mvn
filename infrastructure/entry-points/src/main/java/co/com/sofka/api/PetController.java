package co.com.sofka.api;

import co.com.sofka.model.Pet;
import co.com.sofka.usecase.ProcessPetUseCase;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RestController
@RequestMapping("/pet")
public class PetController {
    private final ProcessPetUseCase processPetUseCase;

    public PetController(ProcessPetUseCase processPetUseCase) {
        this.processPetUseCase = processPetUseCase;
    }

    @PostMapping("/create")
    public Mono<Pet> createPet(@RequestBody Pet pet) {
        return processPetUseCase.savePet(pet);
    }

    @GetMapping("/all")
    public Flux<Pet> allPets() {
        return processPetUseCase.allPets();
    }

    @GetMapping("/{id}")
    public Mono<Pet> petById(@PathVariable("id") String petId) {
        return processPetUseCase.petById(petId);
    }

    @PutMapping("/update")
    public Mono<Pet> updatePet(@RequestBody Pet pet) {
        return processPetUseCase.savePet(pet);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<String> deletePetById(@PathVariable("id") String petId) {
        return processPetUseCase.deletePetById(petId);
    }
}
