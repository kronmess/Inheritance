import java.util.LinkedList;

public class Specimen {
	private String name; 
	private int cageNumber; 
	private Species toa;  
	public Specimen( String a, int c, Species s) { 
		setName(a); setCage(c); setTOA(s); 
	} 
	public void setName(String a){
		name = a; 
	} 
	public void setCage(int c){
		cageNumber = c; 
	} 
	public void setTOA(Species s){
		toa = s; 
	} 
	public String getName(){ 
		return name; 
	} 
	public int getCage(){ 
		return cageNumber; 
	} 
	public Species getTOA(){ 
		return toa; 
	} 
	public String toString() { 
		return name + " is a " + toa + " in cage " + cageNumber;
	}
	public void countSpecimens(Specimen[] animals, Species s)   {
		int count = 0;        
		for (int i = 0; i < animals.length; i++)    {
			if (s.equals(animals[i].getTOA())){
				count++;
			}
					    
		}       
		}
	
	LinkedList <Specimen> makeList( Specimen [] animals)   {   
		LinkedList <Specimen> ohyeah = new LinkedList<Specimen>(); 
		for (int i = 0 ; i < animals.length; i++) {
			ohyeah.add(animals[i]);    
			}
		return ohyeah;
	   } 
	public LinkedList<Species> makeSpeciesList(LinkedList <Species> animals) {    
		LinkedList<Species> SpeciesList = new LinkedList<Species>();    
		for(Species i: animals) {
			SpeciesList.add(i);
		}
		return SpeciesList;
		}
	
	public LinkedList<Species> makeSpeciesListUnique(LinkedList <Species> allSpecies) {    
		LinkedList<Species> SpeciesList = new LinkedList<Species>();    
		for(Species i: allSpecies) {
			if(SpeciesList.contains(i) == false) {
				SpeciesList.add(i);
			}
			
		}
		return SpeciesList;
		}
}
