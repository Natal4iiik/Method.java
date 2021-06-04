
import model.CategoryName;
import model.Notes;
import model.User;

import java.util.List;

public class Method {
    public static void main(String[] args){

        User user = new User();
        user.setLastName("blabla");
        //.....

        Notes home = new Notes(user, CategoryName.HOME, "new home tasks", 7);

        System.out.println("Note by " + "in category " + home.getCategoryName() + " Nr." + home.getNotesNum() + " " + home.getText());
        System.out.println("===================================");

        User anotherUser = new User();
        anotherUser.setLastName("anotherblabla");
        anotherUser.setFirstName("blaaaah");
        anotherUser.getFullName(); //-> blaaaah anotherblabla
        //........

        Notes kids = new Notes(CategoryName.KIDS, "new reminders", 6);


        System.out.println("Note by " + "in category " + kids.getCategoryName() + " Nr." + kids.getNotesNum() + " " + kids.getText());
        System.out.println("===================================");

        Notes shop = new Notes(CategoryName.SHOP, "shopping lists", 10);


        System.out.println("Note by " + "in category " + shop.getCategoryName() + " Nr." + shop.getNotesNum() + " " + shop.getText());
        System.out.println("===================================");

        Notes work = new Notes(CategoryName.WORK, "new meetings and seminars", 4);


        System.out.println("Note by " + "in category " + work.getCategoryName() + " Nr." + work.getNotesNum() + " " + work.getText());
        System.out.println("===================================");

        if (shop.getNotesNum()>0){
            if (home.getNotesNum()>0){
                if(work.getNotesNum()>0){
                    if(kids.getNotesNum()>0){
                        System.out.println(shop.getText());
                        System.out.println(home.getText());
                        System.out.println(work.getText());
                        System.out.println(kids.getText());
                    }
                }
            }
            }

//        LocalDate localDate = LocalDate.of(2021,12,20);
//        System.out.println(localDate);


        List<User> users = home.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getFullName());
        }

//
//        natalia.printUserInfo();
//        arthur.printUserInfo();
//        kostik.printUserInfo();
//        egor.printUserInfo();

    }
}
