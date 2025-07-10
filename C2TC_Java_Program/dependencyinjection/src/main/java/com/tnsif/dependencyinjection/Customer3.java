package com.tnsif.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer3 {
		private int cid;
		private String cname;
		@Autowired
		private customer1 customer1;
		@Autowired
		private customer2 customer2;
		public int getCid(){
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
	    	customer1.show();
	    	customer2.show();
	    	System.out.println("this is from customer class");
	    }
	}

