package model;

public enum CategoryName {
    HOME("Homeworks"),
    WORK("Meetings, schedule, topics, seminars"),
    SHOP("Product list"),
    KIDS("Kindergarten, school, university");

    private String name;

    CategoryName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}