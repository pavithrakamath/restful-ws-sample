package com.pk.rest.ws.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pk.rest.ws.beans.User;
@Component
public class UserService {

	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "PK", new Date()));
		users.add(new User(1, "PK", new Date()));
		users.add(new User(1, "PK", new Date()));
	}

	public List<User> getAllUsers() {
		return users;

	}

	public User getUser(int id) {
		return users.stream().filter(p -> p.getId() == id).findAny().orElse(null);
	}

	public User setUser(User newUser) {
		if (newUser != null) {
			newUser.setId(users.size() + 1);
			users.add(newUser);
		}
		return newUser;
	}

	public void deleteUser(int id) {
		User todel = getUser(id);
		if (todel != null)
			users.remove(todel);

	}
}
