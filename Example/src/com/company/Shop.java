package com.company;

import java.util.LinkedList;

public class Shop {
    private LinkedList<Product> products = new LinkedList<Product>();

    public Shop() {
    }

    public Shop(LinkedList<Product> products) {
        this.products = products;
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void add(String name, String category, double price, double discount) {
        if (discount == 0) {
            products.add(new Product(name, category, price));
        } else
            products.add(new Product(name, category, price, discount));
    }

    public void del(int id) {

        for (Product i : products) {
            if (i.getId() == id) {
                products.remove(i);
                break;
            }
        }
//        for (int i=0; i<products.size(); i++){
//            if (products.get(i).getId()==id){
//                products.remove(i);
//                break;
//            }
//        }
    }

    public boolean searchById(int id) {
        for (Product i : products) {
            if (i.getId() == id) {
                i.Print();
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (Product i : products) {
            i.Print();
        }
    }

    public boolean editById(int id, byte character, Object value) {

        for (Product i : products) {
            if (i.getId() == id) {
                switch (character) {
                    case 1: {//имя

                        i.setName((String) value);

                    }break;
                    case 2: {//категория
                        i.setCategory((String) value);
                    }
                    break;
                    case 3: {//цена
                        i.setPrice((double) value);
                    }
                    break;
                    case 4: {//скидка
                        i.setDiscount((double) value);
                    }
                    break;
                    default:
                        return false;
                }
                return true;
            }
        }
        return false;
    }
}
