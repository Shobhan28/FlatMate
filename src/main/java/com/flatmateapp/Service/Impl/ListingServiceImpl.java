package com.flatmateapp.Service.Impl;

import com.flatmateapp.Entity.Listing;
import com.flatmateapp.Payload.ListingDTO;
import com.flatmateapp.Repository.ListingRepository;
import com.flatmateapp.Service.ListingService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListingServiceImpl implements ListingService {

    private ModelMapper modelMapper;
    private ListingRepository listingRepository;

    public ListingServiceImpl(ModelMapper modelMapper,
                              ListingRepository listingRepository) {
        this.modelMapper = modelMapper;
        this.listingRepository = listingRepository;
    }


    @Override
    public ListingDTO saveListing(ListingDTO listingDTO) {
        Listing listingEntity = mapToEntity(listingDTO);
       // Status will be by default pending,
       // so whatever status you will give in json object, it doesnt matter.
        listingEntity.setStatus("pending");
        Listing savedListing = listingRepository.save(listingEntity);
        return mapToDto(savedListing);
    }

    @Override
    public ListingDTO approvePropertyListing(Long listingId) {
            Optional<Listing> optionalProperty = listingRepository.findById(listingId);

            if (optionalProperty.isPresent()) {
                Listing listing = optionalProperty.get();
                listing.setStatus("approved");
                listing = listingRepository.save(listing);
                return mapToDto(listing);
            } else {
                // Handle property not found
                // You can throw an exception or return null/empty, depending on your design
                return null;
            }
    }

    private Listing mapToEntity(ListingDTO listingDto) {
        return modelMapper.map(listingDto, Listing.class);

}
    ListingDTO mapToDto(Listing listing) {
        return modelMapper.map(listing, ListingDTO.class);
    }
}
