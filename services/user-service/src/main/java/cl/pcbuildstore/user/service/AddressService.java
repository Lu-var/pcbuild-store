package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.model.Address;
import cl.pcbuildstore.user.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public List<Address> getAddressesByUserId(Long userId) {
        return addressRepository.findByUserId(userId);
    }

    public Optional<Address> getPrimaryAddressByUserId(Long userId) {
        return addressRepository.findByUserIdAndIsPrimary(userId, true);
    }

    public Map<Long, Address> getAllAddresses() {
        Map<Long, Address> addressMap = new HashMap<>();
        addressRepository.findAll().forEach(address -> addressMap.put(address.getId(), address));
        return addressMap;
    }

    public Optional<Address> createAddress(Address address) {
        return Optional.of(addressRepository.save(address));
    }

    public Optional<Address> updateAddress(Long id, Address addressData) {
        return addressRepository.findById(id)
                .map(address -> {
                    address.setStreet(addressData.getStreet());
                    address.setCity(addressData.getCity());
                    address.setPostalCode(addressData.getPostalCode());
                    address.setIsPrimary(addressData.getIsPrimary());
                    return addressRepository.save(address);
                });
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
