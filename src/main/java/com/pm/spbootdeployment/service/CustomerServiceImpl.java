package com.pm.spbootdeployment.service;

import com.pm.spbootdeployment.dto.ApiResponse;
import com.pm.spbootdeployment.dto.CustomerDTO;
import com.pm.spbootdeployment.entity.Customer;
import com.pm.spbootdeployment.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-08-04
 */
@Service
@RequiredArgsConstructor

public class CustomerServiceImpl {
    private final CustomerRepository customerRepository;

    public ApiResponse save(CustomerDTO customerDTO) {
        Customer customer = Customer.builder()
                .id(customerDTO.getId())
                .name(customerDTO.getName())
                .address(customerDTO.getAddress())
                .phoneNumber(customerDTO.getPhoneNumber())
                .build();

        Customer savedCustomer = customerRepository.save(customer);

        return new ApiResponse(200, "Customer saved successfully", savedCustomer);
    }
}
