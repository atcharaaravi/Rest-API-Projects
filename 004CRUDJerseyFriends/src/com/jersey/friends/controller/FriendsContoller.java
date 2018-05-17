package com.jersey.friends.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.friends.pojo.Friend;
import com.jersey.friends.service.FriendsCollectionService;

@SuppressWarnings({ "unchecked","rawtypes" })
@Path("/friends")
public class FriendsContoller {

	FriendsCollectionService friendsCollectionService = new FriendsCollectionService();

	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List getAllFriends(){
	List allFriends= 	friendsCollectionService.getAllFriends();
	return allFriends;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend getFriendByID(@PathParam("id") int myId){
		Friend f = friendsCollectionService.getFriendById(myId);
		return f;
	}
	
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> updateFriend(Friend friend){
		return friendsCollectionService.updateFriend(friend);
		
	}
	
	@DELETE
	@Path("/remove/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend>  deleteFriend(@PathParam("id") int myId){
		return friendsCollectionService.removeFriend(myId);
	}

}
