package com.Quess.MicroServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameConfiguration nameConfiguration;
    @GetMapping("/names")
    public NameConfiguration retrieveNames()
    {
        return new NameConfiguration(nameConfiguration.getFirstName(),nameConfiguration.getLastName());
    }
}
