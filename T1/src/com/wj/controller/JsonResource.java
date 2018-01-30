package com.wj.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.wj.entity.Item;
import com.wj.entity.User;
import com.wj.service.ItemService;
import com.wj.service.UserService;

//@ApplicationPath("/a")
@Path("/")
public class JsonResource
{
	@Autowired
	private UserService userService;
	@Autowired
	private ItemService itemService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "a";
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
        return userService.save(userList);
    }
    
    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    public Item getItem() {
    	Item item = itemService.get(10);
    	return item;
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