package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vender;
import com.online.restaurant.dao.CustomerDAO;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer janhvi = new Customer();

        janhvi.setName("Janhvi");
        janhvi.setCity("Nagpur");
        janhvi.setAddress("New nandanwan, Nagpur");
        janhvi.setState("Maharastra");
        janhvi.setEmailId("abc@gmail.com");
        janhvi.setPhonenumber(6573637382L);

        System.out.println("Vendor Details:-");
        System.out.println("Name :" + janhvi.getName());
        System.out.println("City :" + janhvi.getCity());
        System.out.println("Address :" + janhvi.getAddress());
        System.out.println("State :" + janhvi.getState());
        System.out.println("EmailID :" + janhvi.getEmailId());
        System.out.println("Phone Number :" + janhvi.getPhonenumber());





        Vender euphoria = new Vender();
        euphoria.setName("Euphoria veg Restaurant");
        euphoria.setAddress("Nandanwan Nagpur");
        euphoria.setCategory("veg");
        euphoria.setRating(5.0);
        euphoria.setPhoneNumber(0712223344);
        euphoria.setCity("Nagpur");


        Order order = new Order();
        order.setCustomer(janhvi);
        order.setVender(euphoria);
        order.setTotalAmount(999.0);
        order.setOrderData(new Date());
        order.setDeliveryAddress("101,civil lines Nagpur");

        CustomerDAO customerDAO = new CustomerDAO();








    }
}
