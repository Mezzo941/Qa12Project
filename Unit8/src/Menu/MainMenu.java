package Menu;

public class MainMenu implements MenuOptions{

    private final static String[] mainMenu = {
            "Выберите действие:",
            "1. Добавить товар",
            "2. Удалить товар",
            "3. Редактировать товар",
            "4. Отобразить список товаров",
            "5. Выход",
            "Для действия введите номер пункта: "
    };

    public void printMainMenu() {
        printMenu(mainMenu);
    }
}


