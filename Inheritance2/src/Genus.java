
public class Genus {
	private String genusName;
	
	public Genus(String name) {
		setGenusName(name);    
	}    
	public void setGenusName(String name) {
		this.genusName = name; 
		}    
	public String getGenusName() { 
		return genusName; 
	}    
	public String toString() {
		return "Genus: " + genusName;   
	}   

}
