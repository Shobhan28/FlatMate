package com.flatmateapp.Service;


import com.flatmateapp.Entity.LegalPackage;

import java.util.List;

public interface LegalPackageService {

    public List<LegalPackage> getAllLegalProducts() ;

    LegalPackage getLegalProductById(Long productId);
}
