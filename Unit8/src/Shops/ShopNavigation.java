package Shops;

import Menu.MainMenu;
import Menu.SortListMenu;
import Products.sorting.ComparatorByPriceDown;
import Products.sorting.ComparatorByPriceUp;
import Products.Product;

import java.util.Scanner;

public class ShopNavigation {

    private final Shop shop = new Shop();

    /*public ShopNavigation() {
        shop.getProductList().add(new Product(90, "bbbb", 4500));
        shop.getProductList().add(new Product(5, "aaaa", 10000));
        shop.getProductList().add(new Product(20, "yyyy", 80));
        shop.getProductList().add(new Product(8, "xxxx", 6000));
        shop.getProductList().add(new Product(2, "dddd", 3000));
        shop.getProductList().add(new Product(0, "cccc", 4000));
    }*/

    private static int hasIntCheckInput() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number < 0) return -1;
            else return number;
        } else return -1;
    }

    public void startMenu() {

        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        SortListMenu sortListMenu = new SortListMenu();

        int switcher;
        boolean statusOfMainMenu = true;
        boolean statusOfPrintMenu = true;

        String msgOfEmptyList = "Список товаров пуст.";
        String msgOfValue = "Введите корректное значение";
        String msgOfMatchId = "Товар с данным ID не найден в списке";

        while (statusOfMainMenu) {
            mainMenu.printMainMenu();
            switcher = hasIntCheckInput();
            System.out.println();

            switch (switcher) {
                case 1: {

                    int id;
                    String name;
                    int price;

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
                    name = scanner.nextLine();

                    while (true) {
                        System.out.print("Введите цену товара в USD: ");
                        price = hasIntCheckInput();
                        if (price == -1) {
                            System.out.println(msgOfValue);
                            System.out.println();
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
                            break;
                        } else {
                            System.out.print("Введите ID товара, который вы хотите удалить: ");
                            int id = hasIntCheckInput();
                            if (id == -1) {
                                System.out.println("Введите корректное значение");
                            } else {
                                if (shop.hasFoundId(id)) {
                                    shop.productRemove(id);
                                    System.out.println();
                                    shop.printProductList(shop.getProductList(), msgOfEmptyList);
                                    System.out.println();
                                    break;
                                } else {
                                    System.out.println(msgOfMatchId);
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;
                }

                case 3: {
                    if (shop.getProductList().isEmpty()) {
                        System.out.println(msgOfEmptyList);
                        System.out.println();
                    } else {

                        int id;
                        String name;
                        int price;

                        while (true) {
                            System.out.print("Введите ID товара, который вы хотите изменить: ");
                            id = hasIntCheckInput();
                            if (id == -1) {
                                System.out.println(msgOfValue);
                                System.out.println();
                            } else {
                                if (shop.hasFoundId(id)) {
                                    break;
                                } else {
                                    System.out.println(msgOfMatchId);
                                    System.out.println();
                                }
                            }
                        }

                        System.out.print("Введите наименование товара: ");
                        name = scanner.nextLine();

                        while (true) {
                            System.out.print("Введите цену товара в USD: ");
                            price = hasIntCheckInput();
                            if (price == -1) {
                                System.out.println(msgOfValue);
                                System.out.println();
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
                    while (statusOfPrintMenu) {
                        sortListMenu.printSortListMenu();
                        switcher = hasIntCheckInput();
                        System.out.println();

                        switch (switcher) {
                            case 1: {
                                shop.productSort(shop.getProductList(), new ComparatorByPriceUp(), msgOfEmptyList);
                                break;
                            }
                            case 2: {
                                shop.productSort(shop.getProductList(), new ComparatorByPriceDown(), msgOfEmptyList);
                                break;
                            }
                            case 3: {
                                shop.printReverseProductList(shop.getProductList(), msgOfEmptyList);
                                break;
                            }
                            case 4: {
                                shop.printProductList(shop.getProductList(), msgOfEmptyList);
                                break;
                            }
                            case 5: {
                                statusOfPrintMenu = false;
                                break;
                            }
                            default: {
                                System.out.println(msgOfValue);
                                System.out.println();
                            }
                        }
                    }
                    System.out.println();
                    break;
                }

                case 5: {
                    statusOfMainMenu = false;
                    break;
                }

                default: {
                    System.out.println(msgOfValue);
                    System.out.println();
                }
            }
        }
    }
}
