package com.pm.spbootdeployment.controller;

import com.pm.spbootdeployment.dto.ApiResponse;
import com.pm.spbootdeployment.dto.CustomerDTO;
import com.pm.spbootdeployment.entity.Customer;
import com.pm.spbootdeployment.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-08-04
 */
@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerServiceImpl customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> saveCustomer(@RequestBody CustomerDTO customer) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "ok",
                        customerService.save(customer)
                )
        );
    }
}
