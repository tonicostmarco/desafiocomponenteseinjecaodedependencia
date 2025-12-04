package com.marquinhobinoruimslk.compsinjdep.services;

import com.marquinhobinoruimslk.compsinjdep.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double orderDiscount = order.getBasic() * (order.getDiscount() / 100);

        double totalDiscount = order.getBasic() - orderDiscount;

         if (totalDiscount <= 100) {
            return orderDiscount - 20;
        } else if (totalDiscount <= 200) {
            return orderDiscount - 12;
        }
        return orderDiscount;
    }
}
