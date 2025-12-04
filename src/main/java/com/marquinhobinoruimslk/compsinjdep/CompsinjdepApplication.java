package com.marquinhobinoruimslk.compsinjdep;

import com.marquinhobinoruimslk.compsinjdep.entities.Order;
import com.marquinhobinoruimslk.compsinjdep.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class CompsinjdepApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
    private Order order = new Order();

    public static void main(String[] args) {
        SpringApplication.run(CompsinjdepApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        order.setCode(sc.nextInt());

        System.out.print("Enter the basic price: ");
        order.setBasic(sc.nextDouble());

        System.out.print("Enter the discount: ");
        order.setDiscount(sc.nextDouble());

        System.out.println("Pedido código: " + order.getCode());
        System.out.println("Valor total: " + orderService.total(order));

    }
}
