package com.example.swagger_example.user;

import java.io.Serializable;

public class User implements Serializable {

int id;

String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}