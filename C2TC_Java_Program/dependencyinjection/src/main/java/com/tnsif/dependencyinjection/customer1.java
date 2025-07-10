package com.tnsif.dependencyinjection;

import org.springframework.stereotype.Component;

@Component 
public class customer1 {
	private int cid;
	private String cname;
	
	public customer1()
	{
		System.out.println("Customer1 has been called");
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
    void show() {
    	System.out.println("this is the customer class");
    }
}
