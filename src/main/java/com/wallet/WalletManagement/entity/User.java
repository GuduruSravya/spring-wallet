package com.wallet.WalletManagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true, name = "email")
    String email;

    @Column(nullable = false, name = "password")
    String password;

    @Column(nullable = true, name = "firstName")
    String firstName;

    @Column(nullable = true, name = "lastName")
    String lastName;

    @Column(nullable = true, name = "age")
    Integer age;

    @Column(nullable = false, name = "createdDate")
    Date createdDate;

    @Column(nullable = false, name = "lastUpdatedDate")
    Date lastUpdatedDate;

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @PrePersist
        //Auto Computing the value
    void beforeInsert() {
        this.createdDate = new Date();
        this.lastUpdatedDate = new Date();
    }

}
