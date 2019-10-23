package com.turing.mybatis.entity;

public class Emp {
private int id;
private String name;
private int sal;
private String address;
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
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
}

}
