
public class item {
	
	String name; 
	int id;
	int parent;
	int heirarchy;
	
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

	
	public static boolean setParent(item parent){
		
		
		return true;
	}
}


