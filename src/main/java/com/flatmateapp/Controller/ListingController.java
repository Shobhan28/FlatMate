package com.flatmateapp.Controller;

import com.flatmateapp.Payload.ListingDTO;
import com.flatmateapp.Service.ListingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    private ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @PostMapping
    public ResponseEntity<ListingDTO> addProperty(@RequestBody ListingDTO listingDTO) {
        ListingDTO savedListing = listingService.saveListing(listingDTO);
        return new ResponseEntity<>(savedListing, HttpStatus.CREATED);
    }

    //  When a PATCH request is made to a URL "/{propertyId}/approve", it triggers the approvePropertyListing method.
    // This method, in turn, calls a service method (approvePropertyListing in listingService) to handle the approval logic
    // and returns the result as a ResponseEntity<ListingDTO> with a 200 OK status.
    @PatchMapping("/{propertyId}/approve")
    public ResponseEntity<ListingDTO> approvePropertyListing(@PathVariable Long propertyId) {
        ListingDTO approvedListing = listingService.approvePropertyListing(propertyId);
        return new ResponseEntity<>(approvedListing, HttpStatus.OK);
    }


    @GetMapping("/{id}/read")
    public ResponseEntity<Object> getListingById(@PathVariable Long id) {
        try {
            ListingDTO listingDTO = listingService.getListingById(id);
            return new ResponseEntity<>(listingDTO, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (IllegalStateException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.FORBIDDEN);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
