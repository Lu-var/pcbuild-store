package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.dto.AddressDTO;
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

    public Optional<AddressDTO> getAddressById(Long id) {
        return addressRepository.findById(id)
                .map(AddressDTO::new);
    }

    public List<AddressDTO> getAddressesByUserId(Long userId) {
        return (addressRepository.findByUserId(userId)
                .stream()
                .map(AddressDTO::new)
                .toList());
    }

    public Optional<AddressDTO> getPrimaryAddressByUserId(Long userId) {
        return addressRepository.findByUserIdAndIsPrimary(userId, true)
                .map(AddressDTO::new);
    }

    public Map<Long, AddressDTO> getAllAddresses() {
        Map<Long, AddressDTO> addressMap = new HashMap<>();
        addressRepository.findAll()
                .forEach(address -> addressMap.put(address.getId(), new AddressDTO(address)));
        return addressMap;
    }

    public AddressDTO createAddress(AddressDTO address) {
        Address newAddress = new Address();
        newAddress.setStreet(address.getStreet());
        newAddress.setPostalCode(address.getPostalCode());
        newAddress.setIsPrimary(address.getIsPrimary());

        Address savedAddress = addressRepository.save(newAddress);
        return new AddressDTO(savedAddress);
    }

    public Optional<AddressDTO> updateAddress(Long id, AddressDTO addressDTO) {
        return addressRepository.findById(id)
                .map(address -> {
                    address.setStreet(addressDTO.getStreet());
                    address.setPostalCode(addressDTO.getPostalCode());
                    address.setIsPrimary(addressDTO.getIsPrimary());
                    Address saved = addressRepository.save(address);
                    return new AddressDTO(saved);
                });

    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
