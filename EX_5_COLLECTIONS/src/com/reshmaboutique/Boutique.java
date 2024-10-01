package com.reshmaboutique;

public class Boutique {

	 private String id;
		private String name;
	  private String dress_type;
	  private String dress_size;
	  private int dress_cost;
	 
	  public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDress_type() {
		return dress_type;
	}
	public void setDress_type(String dress_type) {
		this.dress_type = dress_type;
	}
	public String getDress_size() {
		return dress_size;
	}
	public void setDress_size(String dress_size) {
		this.dress_size = dress_size;
	}
	public int getDress_cost() {
		return dress_cost;
	}
	public void setDress_cost(int dress_cost) {
		this.dress_cost = dress_cost;
	}
	public Boutique()
	{
	}
	public Boutique(String dress_type, String dress_size, int dress_cost,String id,String name) {
		this.dress_type = dress_type;
		this.dress_size = dress_size;
		this.dress_cost = dress_cost;
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Boutique [name=" + name + ", dress_type=" + dress_type + ", dress_size=" + dress_size + ", dress_cost="
				+ dress_cost + ", id=" + id + "]";
	}



	  
	}


