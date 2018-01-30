package com.wj.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.wj.entity.Item;
import com.wj.entity.User;
import com.wj.service.ItemService;
import com.wj.service.UserService;
import com.wj.util.AppPropertyBean;
import com.wj.util.jwt.JWTokenUtility;

//@ApplicationPath("/b")
@Path("/")
public class Login{
	@Autowired
	private UserService userService;
	@Autowired
	private ItemService itemService;
    @Autowired
    private AppPropertyBean propBean;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "b";
    }

	@GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> list() {
        return Arrays.asList("a","b");
    }

    @GET
    @Path("map")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "000");
        map.put("b", "111");
        return map;
    }

    static public class Person{
        public String name;
        public int age;
    };
    
    @GET
    @Path("pojo")
    @Produces(MediaType.APPLICATION_JSON)
    public User pojo() {
//        Person person = new Person();
//        person.name = "Foo Bar";
//        person.age = 30;
//        return person;
    	return userService.get(1);
    }
    
    @GET
    @Path("save")
    @Produces(MediaType.APPLICATION_JSON)
    public int save() {
    	List<User> userList=new ArrayList<User>();
        User user = new User();
        user.setId(3);
        user.setUsername("ËË");
        user.setSchoolNamer("êÏçËè¨");
        userList.add(user);
        user = new User();
        user.setId(2);
        user.setUsername("ËË");
        user.setSchoolNamer("êÏçËëÂ");
        userList.add(user);
//        try {
        	userService.save(userList);
//        } catch (Exception e){
//        	e.printStackTrace();
//        }
        
        return 0;
    }
    
    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    public Item getItem() {
    	Item item = itemService.get(10);
    	return item;
    }
    
    @GET
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login() {
        Response resp = Response.ok("user" + " authenticated")
                .header("jwt", JWTokenUtility.buildJWT("user/password",propBean.getExpirationTime()))
                .build();
        return resp;
    }
    
//    @GET
//    @Path("del")
//    @Produces(MediaType.APPLICATION_JSON)
//    public int del() {
//        User user = new User();
//        user.setId(2);
//        user.setUsername("ËË");
//        user.setSchoolNamer("êÏçËëÂ");
//        return userService.save(user);
//    }
}