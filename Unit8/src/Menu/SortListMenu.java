package Menu;

public class SortListMenu implements MenuOptions{

    private final static String[] sortListMenu = {
            "Выберите действие:",
            "1. По возрастанию цены",
            "2. По убыванию цены",
            "3. В обратом порядке добавления товар",
            "4. Без сортировки",
            "5. Вернуться в главное меню",
            "Для действия введите номер пункта: "
    };

    public void printSortListMenu() {
        printMenu(sortListMenu);
    }

}

