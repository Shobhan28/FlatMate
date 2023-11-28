package com.flatmateapp.Repository;

import com.flatmateapp.Entity.LegalPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PackageRepository extends JpaRepository <LegalPackage, Long> {

        // You can add custom query methods if needed

    }

