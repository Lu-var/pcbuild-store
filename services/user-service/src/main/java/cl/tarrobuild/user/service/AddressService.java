package cl.tarrobuild.user.service;

import cl.tarrobuild.user.dto.AddressResponse;
import cl.tarrobuild.user.model.Address;
import cl.tarrobuild.user.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Optional<AddressResponse> getAddressById(Long id) {
        return addressRepository.findById(id)
                .map(AddressResponse::new);
    }

    public List<AddressResponse> getAddressesByUserId(Long userId) {
        return (addressRepository.findByUserId(userId)
                .stream()
                .map(AddressResponse::new)
                .toList());
    }

    public Optional<AddressResponse> getPrimaryAddressByUserId(Long userId) {
        return addressRepository.findByUserIdAndIsPrimary(userId, true)
                .map(AddressResponse::new);
    }

    public List <AddressResponse> getAllAddresses() {
        return addressRepository.findAll()
                .stream()
                .map(AddressResponse::new)
                .toList();
    }

    public AddressResponse createAddress(AddressResponse address) {
        Address newAddress = new Address();
        newAddress.setStreet(address.getStreet());
        newAddress.setPostalCode(address.getPostalCode());
        newAddress.setIsPrimary(address.getIsPrimary());

        Address savedAddress = addressRepository.save(newAddress);
        return new AddressResponse(savedAddress);
    }

    public Optional<AddressResponse> updateAddress(Long id, AddressResponse addressResponse) {
        return addressRepository.findById(id)
                .map(address -> {
                    address.setStreet(addressResponse.getStreet());
                    address.setPostalCode(addressResponse.getPostalCode());
                    address.setIsPrimary(addressResponse.getIsPrimary());
                    Address saved = addressRepository.save(address);
                    return new AddressResponse(saved);
                });

    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
