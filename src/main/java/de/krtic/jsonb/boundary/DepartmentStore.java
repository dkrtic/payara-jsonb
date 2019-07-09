package de.krtic.jsonb.boundary;

import de.krtic.jsonb.entity.Department;

/**
 * DepartmentStore
 */
public class DepartmentStore {

    public Department getDepartment(long id) {
        Department department = new Department();
        department.setId(id);
        return department;
    }
}