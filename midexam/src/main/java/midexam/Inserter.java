package midexam;

import java.util.ArrayList;

public class Inserter {
	public ArrayList<Integer> listAdder() {
		  ArrayList<Integer> l = new ArrayList<Integer>();
		  
		  
		  //List<Integer> ll = new ArrayList<>();
		  
		  for(int i = 0; i<3; ++i) {
		   l.add(i);
		  } 
		  
		  return l;
		  
		 }
	
	 public ArrayList<String> createAlpha() {
		 
		  ArrayList<String> x = new ArrayList<String>();
		  for(int index = 0; index < 26; ++index) {
			  char c = (char)(97+index);
			  x.add(Character.toString(c));
		  }
		  return x;
		 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inserter obj=new Inserter();
		System.out.println(obj.listAdder());
		System.out.println(obj.createAlpha());

	}

}
