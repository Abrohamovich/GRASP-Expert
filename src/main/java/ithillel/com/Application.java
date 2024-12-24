package ithillel.com;

import ithillel.com.entity.Address;
import ithillel.com.entity.User;

import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) {
        User user_1 = new User("John Doe", 27, "M");
        Address address_1 = new Address("Germany", "Bayern", "Nuremberg", "90478", "Regensburger Str. 63");
        user_1.setAddress(address_1);
        System.out.println("user_1: "+ user_1.toString());
        System.out.println("user_1 address:" + user_1.getAddress().toString());

        User user_2 = new User("Jim Carrey", 62, "M");
        Address address_2 = new Address("Canada", "Ontario", "Newmarket", "905", "Harossin Dr. 69");
        user_2.setAddress(address_2);
        System.out.println("user_2: "+ user_2.toString());
        System.out.println("user_2 address:" + user_2.getAddress().toString());

        System.out.println("Does address_2 belong to user_1 - " + isBelongTo(user_1, address_2));
        System.out.println("Does address_1 belong to user_1 - " + isBelongTo(user_1, address_1));
        System.out.println("Does address_1 belong to user_2 - " + isBelongTo(user_2, address_1));
        System.out.println("Does address_2 belong to user_2 - " + isBelongTo(user_2, address_2));
    }

    private static boolean isBelongTo(User user, Address address){
        try {
            Field field = User.class.getDeclaredField("address");
            field.setAccessible(true);
            Object fieldValue = field.get(user);
            if (fieldValue != null && fieldValue.equals(address)) {
                return true;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
