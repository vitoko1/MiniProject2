import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class InputCollector {

    public static List<Contact> lstContact = new ArrayList<>();

    /**
     * this method require a string to show a message in our console  and also one integer to
     * know what kind of validation we need to apply.
     *
     * @param prompt
     * @param discriminator
     * @return
     */
    public static String getUserInput(String prompt, int discriminator) {
        int number = 0;
        if (discriminator == 0) {
            /**
             * it print the message in the console
             */
            System.out.println(prompt);

            Scanner sc = new Scanner(System.in);

            /**
             *  input validation
             */
            do {

                while (!sc.hasNextInt()) {
                    System.out.println("That's not a valid option, please type a valid option.");
                    sc.next();
                }

                number = sc.nextInt();
            } while (number < 0 || number > 5);


        } else if (discriminator == 1) {

// first I ask for their name.
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            Contact contact = new Contact();
            Phone phone = new Phone();
            String name = sc.nextLine();

            boolean aux = true;

            while (aux) {

                if (!name.equalsIgnoreCase("")) {

                    contact.setName(name);
                    aux = false;
                    break;

                } else {

                    System.out.println("Please enter a name (YOU MUST TO ENTER THIS FIELD)");
                    name = sc.nextLine();
                }

            }

            // then for theirs mobile phone
            System.out.println("Enter mobile phone");
            String mobilePhone = sc.nextLine();
            aux = true;
            while (aux) {

                if (!mobilePhone.equalsIgnoreCase("")) {
                    aux = false;

                    phone.setMobilePhone(mobilePhone);
                } else {

                    System.out.println("Please enter a mobile contact phone  (YOU MUST TO ENTER THIS FIELD)");
                    mobilePhone = sc.nextLine();
                }

            }
            int flag = 0;
            for (Contact ct : lstContact) {

                if (ct.getName().equalsIgnoreCase(name) &&
                        ct.getPhone().getMobilePhone().equalsIgnoreCase(mobilePhone)) {


                    System.out.println("The contact already exists and cannot be created ");
                    flag = 1;
                    break;


                } else {

                    contact.setName(name);
                    break;
                }

            }

            if (flag == 0) {
                System.out.println("Enter home phone");
                phone.setHomePhone(sc.nextLine());
                System.out.println("Enter Work phone");
                phone.setWorkPhone(sc.nextLine());
                System.out.println("Enter a City");
                contact.setCity(sc.nextLine());
                contact.setPhone(phone);
                lstContact.add(contact);
                int index = 0;
                for (
                        Contact ct : lstContact) {
                    if (ct.getId() != index) {
                        ct.setId(index);
                    }
                    index++;
                }


                number = 1;
            } else
                number = 0;


        } else if (discriminator == 2) {

            System.out.println(prompt);


            for (Contact ct : lstContact) {

                System.out.print(ct.getId() + "." + "< " + ct.getName() + " > " + "(mobile= " + ct.getPhone().getMobilePhone()
                        + ", work= " + ct.getPhone().getWorkPhone() + ", home= " + ct.getPhone().getHomePhone() + ", City= " + ct.getCity() + " )");
                System.out.println("");
            }

        } else if (discriminator == 3) {

            System.out.println(prompt);

            Scanner sc = new Scanner(System.in);


            /**
             *  input validation
             */
            do {

                while (!sc.hasNextInt()) {
                    System.out.println("That's not a valid option, please type a valid index to remove the contact.");
                    sc.next();
                }

                number = sc.nextInt();
                if (lstContact.size() - 1 >= number) {
                    Contact contactToShow = lstContact.get(number);
                    System.out.println("The contact = [INDEX]=  " + contactToShow.getId() + " , [NAME]=  " + contactToShow.getName() + " was successfully removed");
                    lstContact.remove(number);
                    break;
                } else {

                    System.out.println("That's not a valid option, please type a valid index to remove the contact.");

                }
            } while (number < 0 || number > lstContact.size() - 1);

        } else if (discriminator == 4) {

            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);


            do {

                while (!sc.hasNextInt()) {
                    System.out.println("That's not a valid option, please type a valid index to update the contact.");
                    sc.next();
                }

                number = sc.nextInt();

                Contact contact = new Contact();
                if (lstContact.size() == 0) {
                    System.out.println("You don't have any contact in your Contact list, please add one first ");
                    break;
                }
                System.out.println("The contact is = [ID]= " + lstContact.get(number).getId() + " [Name]=  " + lstContact.get(number).getName());
                break;

            } while (number < 0 || number > lstContact.size() - 1);

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the name : ");

            String name1 = sc2.nextLine();
            boolean aux = true;
            Contact contact = new Contact();
            Phone phone = new Phone();
            while (aux) {

                if (!name1.equalsIgnoreCase("")) {
                    aux = false;

                    contact.setName(name1);
                } else {

                    System.out.println("Please enter a name (YOU MUST TO ENTER THIS FIELD)");
                    name1 = sc2.nextLine();
                }

            }
            // then for theirs mobile phone
            System.out.println("Enter mobile phone");
            String mobilePhone1 = sc2.nextLine();
            aux = true;

            while (aux) {

                if (!mobilePhone1.equalsIgnoreCase("")) {
                    aux = false;
                    //contact.setName(sc.nextLine());
                    phone.setMobilePhone(mobilePhone1);
                    break;
                } else {

                    System.out.println("Please enter a mobile contact phone  (YOU MUST TO ENTER THIS FIELD)");
                    mobilePhone1 = sc2.nextLine();
                }

            }
            System.out.println("Enter home phone");
            phone.setHomePhone(sc2.nextLine());
            System.out.println("Enter Work phone");
            phone.setWorkPhone(sc2.nextLine());
            System.out.println("Enter a City");
            contact.setCity(sc2.nextLine());
            contact.setPhone(phone);


            lstContact.set(number, contact);

            System.out.println("The contact has been modified  = [ID] = " + lstContact.get(number).getId() + " [NAME]= " + lstContact.get(number).getName());


        }


        return String.valueOf(number);
    }

}
