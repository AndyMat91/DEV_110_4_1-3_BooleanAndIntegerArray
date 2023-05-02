package org.example;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("1). Создадим 2 объекта 2-х наших типов, установим в true элементы с индексами 2, 4, 7, 10 и выведем на печать");
        BooleanInterface intAnit = new IntegerImpl();
        BooleanInterface boolAnit = new BooleanImpl();
        intAnit.setTrueByIndex(2);
        intAnit.setTrueByIndex(4);
        intAnit.setTrueByIndex(7);
        intAnit.setTrueByIndex(10);
        boolAnit.setTrueByIndex(2);
        boolAnit.setTrueByIndex(4);
        boolAnit.setTrueByIndex(7);
        boolAnit.setTrueByIndex(10);
        System.out.println("Булевский массив:\n" + boolAnit);
        System.out.println("Целочисленный массив:\n" + intAnit + "\n");

        System.out.println("2). Проверим элементы с индексом 2, 7, 0");
        System.out.println("Булевский массив: элемент с индексом 2 - " + (boolAnit.checkByIndex(2)?"1; ":"0; ") +
                "элемент с индексом 7 - " + (boolAnit.checkByIndex(7)?"1; ":"0; ") + "элемент с индексом 0 - " +
                (boolAnit.checkByIndex(0)?"1; ":"0; "));
        System.out.println("Целочисленный массив: элемент с индексом 2 - " + (intAnit.checkByIndex(2)?"1; ":"0; ") +
                "элемент с индексом 7 - " + (intAnit.checkByIndex(7)?"1; ":"0; ") + "элемент с индексом 0 - " +
                (intAnit.checkByIndex(0)?"1; ":"0; " + "\n"));

        System.out.println("3). Сбросим в false элементы c индексами 2, 4, 12 и выведем на печать");
        intAnit.setFalseByIndex(2);
        intAnit.setFalseByIndex(4);
        intAnit.setFalseByIndex(12);
        boolAnit.setFalseByIndex(2);
        boolAnit.setFalseByIndex(4);
        boolAnit.setFalseByIndex(12);
        System.out.println("Булевский массив:\n" + boolAnit);
        System.out.println("Целочисленный массив:\n" + intAnit + "\n");

        System.out.println("4). Проверим установку элемента с заданным индексом заданным логическим значением," +
                " установим true элементам с индексами 0, 1, 2 ,3 и false элементам с индексами 7, 10, 11");
        intAnit.setBooleanValueByIndex(0,true);
        intAnit.setBooleanValueByIndex(1,true);
        intAnit.setBooleanValueByIndex(2, true);
        intAnit.setBooleanValueByIndex(3, true);
        intAnit.setBooleanValueByIndex(7,false);
        intAnit.setBooleanValueByIndex(10,false);
        intAnit.setBooleanValueByIndex(11,false);
        boolAnit.setBooleanValueByIndex(0,true);
        boolAnit.setBooleanValueByIndex(1,true);
        boolAnit.setBooleanValueByIndex(2, true);
        boolAnit.setBooleanValueByIndex(3, true);
        boolAnit.setBooleanValueByIndex(7,false);
        boolAnit.setBooleanValueByIndex(10,false);
        boolAnit.setBooleanValueByIndex(11,false);
        System.out.println("Булевский массив:\n" + boolAnit);
        System.out.println("Целочисленный массив:\n" + intAnit + "\n");

        System.out.println("5). Проверим инвертирование элемента с индексом 0 и 10 ");
        intAnit.reverse(0);
        intAnit.reverse(10);
        boolAnit.reverse(0);
        boolAnit.reverse(10);
        System.out.println("Булевский массив:\n" + boolAnit);
        System.out.println("Целочисленный массив:\n" + intAnit + "\n");

        System.out.println("6). Проверим метод, возвращающий количество элементов, установленных в true");
        System.out.println("Булевский массив. Количество true элементов: " + boolAnit.getNumberTrueElements());
        System.out.println("Целочисленный массив. Количество true элементов: " + intAnit.getNumberTrueElements() + "\n");
        System.out.println("Установим элементы с индексами 5 и 6 в true, запустим метод еще раз");
        intAnit.setBooleanValueByIndex(5,true);
        intAnit.setBooleanValueByIndex(6,true);
        boolAnit.setBooleanValueByIndex(5, true);
        boolAnit.setBooleanValueByIndex(6, true);
        System.out.println("Булевский массив:\n" + boolAnit);
        System.out.println("Целочисленный массив:\n" + intAnit + "\n");
        System.out.println("Булевский массив. Количество true элементов: " + boolAnit.getNumberTrueElements());
        System.out.println("Целочисленный массив. Количество true элементов: " + intAnit.getNumberTrueElements() + "\n");
    }
}
