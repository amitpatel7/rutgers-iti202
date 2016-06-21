public class Item {
	
	String name; 
	int id;
	int parent;
	int heirarchy;
	boolean mobileStatus;		//is item movable?
	boolean containerStatus;	//can item hold something?
	boolean usableStatus;		//can the item be used?
	String usableDescription;	//phrase describing status of item (clean, dirty, broken, in-use, etc.)
	//boolean dishwashable;
	
	//Item Category? Electronic, clothes, dish, vehicle, tool, etc. so we know how to extend
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getHeirarchy() {
		return heirarchy;
	}

	public void setHeirarchy(int heirarchy) {
		this.heirarchy = heirarchy;
	}

	
	/*public static boolean setParent(Item parent){
		
		return true;
	}*/
	
	public void setContainerStatus(boolean containerStatus){
		this.containerStatus = containerStatus;
	}
	
	public boolean getContainerStatus(){
		return containerStatus;
	}
	
	public void setUsableStatus(boolean usable){
		this.usableStatus = usable;
	}
	
	public boolean getUsableStatus(){
		return usableStatus;
	}
	
	public void setUsableDecription(String description){
		this.usableDescription = description;
	}
	
	public String getUsableDescription(){
		return usableDescription;
	}

	/*
	public void setDishwashable(boolean dishwashable){
		this.dishwashable = dishwashable;
	}
	
	public boolean getDishwashable(){
		return dishwashable;
	}
	*/
	
	
}

