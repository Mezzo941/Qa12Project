package Menu;

public interface MenuOptions{
    default void printMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            if (i != menu.length - 1) {
                System.out.println(menu[i]);
            } else System.out.print(menu[i]);
        }
    }
}
