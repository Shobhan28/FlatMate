package com.flatmateapp.Controller;

import com.flatmateapp.Entity.LegalPackage;
import com.flatmateapp.Repository.PackageRepository;
import com.flatmateapp.Service.LegalPackageService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/legal")
public class PackageController {

    @Autowired
    private LegalPackageService legalPackageService;
    @Autowired
    private PackageRepository packageRepository;
    @Value("${stripe.secret.key}")
    private String stripeSecretKey;

    @GetMapping("/packages")
    public ResponseEntity<List<LegalPackage>> getAllLegalPackages() {
        List<LegalPackage> legalPackages = legalPackageService.getAllLegalProducts();
        return new ResponseEntity<>(legalPackages, HttpStatus.OK);
    }


}