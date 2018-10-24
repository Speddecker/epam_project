/*
 * Creator: Ivanov Stanislav
 *
 * Last modification 16.11.2018
 *
 */

package by.gstu.Entities;

import java.time.LocalDate;


/**
 * Class that describes chidren entity
 *
 * @Author Stanislav Ivanov
 */
public class Children {
    private int id;
    private String firstName;
    private String secondName;
    private String thirdName;
    private LocalDate dateOfBirth;
    private String childGroup;

    /**
     * Constructor for full-filled class instance
     * @param id unique identificator
     * @param firstName
     * @param secondName
     * @param thirdName
     * @param dateOfBirth
     * @param childGroup name of the child group
     */
    public Children(int id, String firstName, String secondName, String thirdName, LocalDate dateOfBirth, String childGroup) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.dateOfBirth = dateOfBirth;
        this.childGroup = childGroup;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getChildGroup() {
        return childGroup;
    }

    public void setChildGroup(String childGroup) {
        this.childGroup = childGroup;
    }

    @Override
    public String toString() {
        return "ID: " + id +  "\nФамилия: " + secondName + "\nИмя:" + firstName + "\nОтчество: " + thirdName + "\nДата рождения: " +
                dateOfBirth + "\nГруппа: " + childGroup;
    }
}
