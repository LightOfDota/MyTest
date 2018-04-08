package com.by.test;

public class Digui {
	
	public static void main(String[] args) {
		Digui d = new Digui();
		d.dd();
	}

	public void dd() {
		Bea bea = new Bea(1);
		//hehe
		while(bea.getQq()<10) {
			bea = new Bea(bea.getQq()+1);
			System.out.println(bea.getQq());
		}
	}
}


class Bea{
	private int qq;
	
	public Bea(int i) {
		qq = i;
	}

	public int getQq() {
		return qq;
	}

	public void setQq(int qq) {
		this.qq = qq;
	}
	
}
