package com.by.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TestMono {

	public static void main(String[] args) {
		TestMono t = new TestMono();
		System.out.println(t.call());
	}
	
	List<String> call() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		Optional<A> user = Optional.ofNullable(null);
//		return user.map(u -> u.getOrders()).orElse(this.getAIns());
//		return user.flatMap(u -> u.getStr1());
		return user.map(u -> u.getOrders()).orElseGet(() ->Collections.emptyList());
//		return user.map(u -> u.getOrders());
	}
	
	List<String> getAIns() {
		List<String> list = new ArrayList<>();
		list.add("bb");
		System.out.println("执行了");
		return list;
	}

}
class A{
	private List<String> list;
	private String str;
	
	public A() {
		
	}
	public A(List<String> list) {
		this.list=list;
	}
	
	public void setOrders(List<String> list){
		this.list=list;
	}
	public List<String> getOrders(){
		return list;
	}
	
	public String getStr() {
		return this.str;
	}
	
	public Optional<String> getStr1() {
		return Optional.ofNullable(this.str);
	}
}
