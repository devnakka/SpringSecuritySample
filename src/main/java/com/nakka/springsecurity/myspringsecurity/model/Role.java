package com.nakka.springsecurity.myspringsecurity.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * @author Srikanth Nakka on 10/12/2018
 * @project myspringsecurity
 */

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
