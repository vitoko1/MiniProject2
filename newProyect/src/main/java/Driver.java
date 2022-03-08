public class Driver {

    public static void main(String[] args) {

        showMenu();

    }


    public static void showMenu() {

        System.out.println("+===   Contact APP    ===+");
        System.out.println("|  1. List all Contacts  |");
        System.out.println("|  2. Add new Contact    |");
        System.out.println("|  3. Remove Contact     |");
        System.out.println("|  4. Update Contact     |");
        System.out.println("|  5. Quit               |");
        System.out.println("+========================+");


        String userInput = InputCollector.getUserInput("Enter your option : ", 0);

        int option = Integer.parseInt(userInput);


        switch (option) {

            case 1:
                MenuHandler.DisplayContactList();
                showMenu();
                break;

            case 2:
                System.out.println("");

                MenuHandler.AddContact();
                showMenu();
                break;

            case 3:

                MenuHandler.RemoveContact();
                showMenu();
                System.out.println("");
                break;

            case 4:
                MenuHandler.UpdateContact();
                showMenu();
                System.out.println("");
                break;

            case 5:
                MenuHandler.Quit();
                break;
            default:
                System.out.println("Choose an input between 1 to 5 ");
                showMenu();


        }

    }


}
