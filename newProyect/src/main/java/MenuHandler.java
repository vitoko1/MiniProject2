import java.util.ArrayList;
import java.util.List;

public class MenuHandler {


    public static void Quit() {

        System.out.println("See ya next time :) ");

    }

    public static String AddContact() {

        String value = InputCollector.getUserInput("Contact Creation, please enter a name ", 1);
        if (value == "1") {

            System.out.println("Contact created successfully");
        }

        return "";
    }

    public static void DisplayContactList() {


        String aux = InputCollector.getUserInput("Contact List", 2);


    }


    public static void RemoveContact() {

        String aux = InputCollector.getUserInput("Remove a contact," +
                " type the index number of the contact that you want to remove.", 3);
    }

    public static void UpdateContact() {

        String aux = InputCollector.getUserInput("Update a Contact," +
                " type the index number of the contact that you want to update.", 4);
    }
}
