package de.krtic.jsonb.entity;

import javax.inject.Inject;
import javax.json.bind.adapter.JsonbAdapter;

import de.krtic.jsonb.boundary.DepartmentStore;

/**
 * DepartmentTypeAdapter
 */
public class DepartmentTypeAdapter implements JsonbAdapter<Department, Long> {

    @Inject
    DepartmentStore store;

    @Override
    public Long adaptToJson(Department obj) throws Exception {
        return obj.getId();
    }

    @Override
    public Department adaptFromJson(Long obj) throws Exception {
        return store.getDepartment(obj);
    }

    
}