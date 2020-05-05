package com.andrew.petclinic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = com.andrew.petclinic.PetClinicApplication.class)
@SpringBootTest
class PetClinicApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("testing...");
    }

}
