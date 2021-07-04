package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte menu;

        Shop shop = new Shop();
//        shop.Add("dklfj", "sdifahln", 9.0, 12);
//        shop.Add("dsfasdfg", "dsagfsa", 56, 0);
//        for (Product i: shop.getProducts()) {
//            i.Print();
//        }
//        System.out.println("---------------------");
//        shop.Del(1);
//
//        for (Product i: shop.getProducts()) {
//            i.Print();
//        }

        while (true){
            mainMenu();
            menu=input.nextByte();
            switch (menu){
                case 1:{//добавить
                    System.out.println("Введите название продукта");
                    String name=input.next(), category;
                    System.out.println("Введите её категорию");
                    category=input.next();
                    System.out.println("Введите цену");
                    double price = input.nextDouble(), discount;
                    System.out.println("Введите размер скидки");
                    discount = input.nextDouble();
                    shop.add(name, category, price, discount);
                }break;
                case 2: {//вывести описание по ID
                    System.out.println("Введите ID");
                    int id = input.nextInt();
                    if (!shop.searchById(id)){
                        System.out.println("Нету продукта с таким ID");
                    }
                }break;
                case 3:{//вывести весь список
                    shop.printAll();
                }break;
                case 4:{//редактировать
                    System.out.println("Введите ID для редактирования");
                    int id = input.nextInt();
                    if (!shop.searchById(id)){
                        System.out.println("Нету продукта с таким ID");
                        break;
                    }
                    editMenu();
                    menu=input.nextByte();
                    System.out.println("Введите новое значение");
                    Object value= input.next();
                    if (!shop.editById(id, menu, value)){
                        System.out.println("Что-то пошло не так и редактирования не получилось");
                    }
                }break;
                case 5:{//удаление
                    System.out.println("Введите ID для удаления");
                    int id = input.nextInt();
                    if (!shop.searchById(id)){
                        System.out.println("Нету продукта с таким ID");
                        break;
                    }
                    shop.del(id);
                }break;
                case 6:
                    return;
                default:{
                    System.out.println("Вы ввели неверное значение. Повторите ввод");
                }
            }
        }

    }

    private static void mainMenu(){
        System.out.println("Главное меню");
        System.out.println("1. Добавить продукт");
        System.out.println("2. Вывести описание продукта по ID");
        System.out.println("3. Вывести список всех продуктов");
        System.out.println("4. Редактировать описание продукта");
        System.out.println("5. Удаление продукта по ID");
        System.out.println("6. Выход");
    }

    private static void editMenu(){
//        System.out.println("Выберите, что редактировать");
//        System.out.println("1. Имя");
//        System.out.println("2. Категория");
//        System.out.println("3. Цена");
//        System.out.println("4. Скидка");
//        System.out.println("5. Вернуться");
    }
}
