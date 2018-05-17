package com.jersey.friends.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.friends.pojo.Friend;
@SuppressWarnings({ "unchecked", "unused","rawtypes" })
public class FriendsCollectionService {

	Friend dao;
	static HashMap<Integer, Friend> friendsMap = new HashMap<Integer, Friend>();
	public FriendsCollectionService() {
		super();
	
	Friend f1= new Friend("Mahendra1", 1, "palani1");
	Friend f2= new Friend("Mahendra2", 2, "palani2");
	Friend f3= new Friend("Mahendra3", 3, "palani3");
	Friend f4= new Friend("Mahendra4", 4, "palani4");
	Friend f5= new Friend("Mahendra5", 5, "palani5");
	
	friendsMap.put(1, f1);
	friendsMap.put(2, f2);
	friendsMap.put(3, f3);
	friendsMap.put(4, f4);
	friendsMap.put(5, f5);
	
	dao.connectToDatabase();
	
	}
	public List getAllFriends() {
		
		List friends = new ArrayList<Friend>(friendsMap.values());
		return friends;
		
	}
	public Friend getFriendById(int myId) {
		Friend f = friendsMap.get(myId);
		return f;
		
	}
	public List updateFriend(Friend friend) {
		Friend f = friendsMap.put(friend.getId(),friend);
		List friends = new ArrayList<Friend>(friendsMap.values());
		return friends;
	}
	
	public List<Friend> removeFriend(int myId) {
		
		Friend f = friendsMap.remove(myId);
		List friends = new ArrayList<Friend>(friendsMap.values());
		return friends;
	}
}
