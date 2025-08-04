package com.pm.spbootdeployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class CustomerController {
    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }
}
