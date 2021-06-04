package model;

import java.util.ArrayList;
import java.util.List;

public class Notes {

private List<User> users = new ArrayList<>();
private User author;
private CategoryName name;
private String text;
//private LocalDate localDate;
private int notesNum;

    public Notes(User author, CategoryName name, String text, int notesNum) {
        this.author = author;
        this.name = name;
        this.text = text;
        this.notesNum = notesNum;
        //this.localDate = localDate;
    }

    public User getAuthor() { return author; }

    public CategoryName getCategoryName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public List<User> getUsers() {
        return users;
    }

    //public LocalDate getLocalDate() {
      //  return localDate;
    //}

    public int getNotesNum() {
        return notesNum;
    }

//    public void addUser(User user){
//    users.add(user);
    }
}
