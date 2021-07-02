import Products.Product;
import Shops.Shop;

import java.util.Scanner;

public class ShopManagement {


    private static int hasIntCheckInput() {
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            scanner.nextLine();
            scanner.reset();
            if (number < 0) return -1;
            else return number;
        } else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        int switcher;
        boolean status1 = true;
        boolean status2 = true;

        String msgOfEmptyList = "Список товаров пуст.";
        String msgOfValue = "Введите корректное значение";
        String msgOfMatchId = "Товар с данным ID не найден в списке";

        while (status1) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Редактировать товар");
            System.out.println("4. Отобразить список товаров");
            System.out.println("5. Выход");
            System.out.print("Для действия введите номер пункта: ");
            switcher = hasIntCheckInput();
            System.out.println();

            switch (switcher) {
                case 1: {
                    int id;
                    while (true) {
                        System.out.print("Введите ID товара: ");
                        id = hasIntCheckInput();
                        if (id == -1) {
                            System.out.println(msgOfValue);
                            System.out.println();
                        } else {
                            break;
                        }
                    }

                    System.out.print("Введите наименование товара: ");
                    String name = scanner.nextLine();

                    int price;
                    while (true) {
                        System.out.print("Введите цену товара в USD: ");
                        price = hasIntCheckInput();
                        if (price == -1) {
                            System.out.println();
                            System.out.println(msgOfValue);
                        } else {
                            break;
                        }
                    }
                    System.out.println(shop.productAdd(new Product(id, name, price)));
                    System.out.println();
                    break;
                }

                case 2: {
                    while (true) {
                        if (shop.getProductList().isEmpty()) {
                            System.out.println(msgOfEmptyList);
                            System.out.println();
                            break;
                        } else {
                            System.out.print("Введите ID товара, который вы хотите удалить: ");
                            int id = hasIntCheckInput();
                            if (id == -1) {
                                System.out.println("Введите корректное значение");
                                System.out.println();
                            } else if (shop.hasFoundId(id)) {
                                shop.productRemove(id);
                                System.out.println();
                                shop.printProductList();
                                System.out.println();
                                break;
                            } else {
                                System.out.println(msgOfMatchId);
                                System.out.println();
                            }
                        }
                    }
                    break;
                }

                case 3: {
                    if (shop.getProductList().isEmpty()) {
                        System.out.println(msgOfEmptyList);
                        System.out.println();
                    } else {
                        int id;
                        while (true) {
                            System.out.print("Введите ID товара, который вы хотите изменить: ");
                            id = hasIntCheckInput();
                            if (id == -1) {
                                System.out.println(msgOfValue);
                                System.out.println();
                            } else if (shop.hasFoundId(id)) {
                                break;
                            } else {
                                System.out.println(msgOfMatchId);
                                System.out.println();
                            }
                        }

                        System.out.print("Введите наименование товара: ");
                        String name = scanner.nextLine();

                        int price;
                        while (true) {
                            System.out.print("Введите цену товара в USD: ");
                            price = hasIntCheckInput();
                            if (price == -1) {
                                System.out.println();
                                System.out.println(msgOfValue);
                            } else {
                                break;
                            }
                        }
                        shop.productChange(id, name, price);
                        System.out.println();
                    }
                    break;
                }

                case 4: {
                    while (status2) {
                        System.out.println("Выберите тип сортировки:");
                        System.out.println("1. По возрастанию цены");
                        System.out.println("2. По убыванию цены");
                        System.out.println("3. В обратом порядке добавления товар");
                        System.out.println("4. Без сортировки");
                        System.out.println("5. Вернуться в меню");
                        System.out.print("Для действия введите номер пункта: ");

                        switcher = hasIntCheckInput();

                        switch (switcher) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                break;
                            }
                            case 3: {
                                break;
                            }
                            case 4: {
                                shop.printWithoutSort(msgOfEmptyList);
                                break;
                            }
                            case 5: {
                                status2 = false;
                                break;
                            }
                            default: {
                                System.out.println(msgOfValue);
                                System.out.println();
                            }
                        }
                    }
                }

                case 5: {
                    status1 = false;
                    break;
                }

                default:{
                    System.out.println(msgOfValue);
                    System.out.println();
                }
            }
        }
    }
}
