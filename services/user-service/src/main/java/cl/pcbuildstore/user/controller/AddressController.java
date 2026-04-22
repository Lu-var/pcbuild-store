package cl.pcbuildstore.user.controller;

import cl.pcbuildstore.user.dto.AddressDTO;
import cl.pcbuildstore.user.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<Map<Long, AddressDTO>> getAllAddresses() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<AddressDTO>> getAddressesByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(addressService.getAddressesByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO address) {
        AddressDTO created = addressService.createAddress(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressDTO> updateAddress(@PathVariable Long id, @RequestBody AddressDTO address) {
        return addressService.updateAddress(id, address)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.noContent().build();
    }
}
