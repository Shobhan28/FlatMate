package com.flatmateapp.Repository;

import com.flatmateapp.Entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {

    // You can define custom queries or methods here if needed.
    // Spring Data JPA provides methods like save(), findById(), findAll(), deleteById(), etc., out of the box.

    // Example custom query method
    // Optional<Property> findByApartmentTypeAndBhkType(String apartmentType, String bhkType);
}
