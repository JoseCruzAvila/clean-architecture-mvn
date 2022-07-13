package co.com.sofka.adapters;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MongoDBRepository extends ReactiveCrudRepository<PetDocument, String> { }
