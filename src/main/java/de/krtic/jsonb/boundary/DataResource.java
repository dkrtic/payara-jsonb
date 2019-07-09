package de.krtic.jsonb.boundary;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import de.krtic.jsonb.entity.Employee;

/**
 *
 * @author airhacks.com
 */
@Path("data")
public class DataResource {

    @Inject
    DepartmentStore store;

    @GET
    public Response get() {
        Employee e = new Employee("Jonh Doe");
        e.setDepartment(store.getDepartment(42));
        return Response.ok(e).build();
    }

}
