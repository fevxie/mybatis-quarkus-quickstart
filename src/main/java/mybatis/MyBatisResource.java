package mybatis;

import mybatis.mapper.UsersMapper;
import mybatis.models.Users;
import org.apache.ibatis.annotations.Delete;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mybatis")
public class MyBatisResource {

    @Inject
    UsersMapper usersMapper;

    @Path("/user/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Users getUser(@PathParam("id") Integer id){
        return usersMapper.selectByPrimaryKey(id);
    }

    public Integer createUser(@FormParam("id") Integer id, @FormParam("name") String name){
        Users user = new Users(){
            {
                setId(id);
                setName(name);
            }
        };
        return usersMapper.insert(user);
    }

    @Path("/user/{id}")
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public Integer deleteUser(@PathParam("id") Integer id){
        return usersMapper.deleteByPrimaryKey(id);
    }
}
