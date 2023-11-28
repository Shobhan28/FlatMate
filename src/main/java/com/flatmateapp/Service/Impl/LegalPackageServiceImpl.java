package com.flatmateapp.Service.Impl;

import com.flatmateapp.Entity.LegalPackage;
import com.flatmateapp.Repository.PackageRepository;
import com.flatmateapp.Service.LegalPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalPackageServiceImpl implements LegalPackageService {

    @Autowired
    private PackageRepository packageRepository;
    @Override
    public List<LegalPackage> getAllLegalProducts() {
        return packageRepository.findAll();

    }

    @Override
    public LegalPackage getLegalProductById(Long productId) {
        return packageRepository.findById(productId).orElse(null);
    }
}
