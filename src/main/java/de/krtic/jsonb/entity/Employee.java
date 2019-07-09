package de.krtic.jsonb.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTypeAdapter;

/**
 * Employee
 */
public class Employee {
    private long id;
    private String name;
    @JsonbProperty("departmentId")
    @JsonbTypeAdapter(value = DepartmentTypeAdapter.class)
    private Department department;

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
}