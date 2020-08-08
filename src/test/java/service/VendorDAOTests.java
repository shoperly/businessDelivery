package service;

import domain.Vendor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.awt.*;
import java.util.UUID;

@SpringBootTest
public class VendorDAOTests {

    @Test
    void getVendorByID(){
        VendorDAO dao = new VendorDAO();
       Vendor result = dao.getVendorByID(1234);


    }
}
