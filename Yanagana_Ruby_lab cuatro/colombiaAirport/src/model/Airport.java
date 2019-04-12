package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Airport  {
	private static final String PATH_AIRLINES = "data/Airlines.txt"; 
	


	    private String readAirline(int position) throws IOException{
		File f = new File(PATH_AIRLINES);
		BufferedReader br = new BufferedReader(new FileReader(f));
		int i = 0;
		String line = br.readLine();
		while(i<position){
			line = br.readLine();
			i++;
		}
		br.close();
		return line;
	    }
	    

//****************************************************************************************************************************************
//BUbble:
	    
	 public void sorTime(Flight p[]) {
	    	for (int i = 0; i < p.length-1; i++) {
	    		for (int j = 0; j < p.length-i-1; j++) {
	    			if(c2(p[i],p[j+1])==1) {
	    				Flight tem =p[j];
	    				p[j]=p[j+1];
	    				p[j+1]=tem;
	    				
	    			}
					
				}
				
			}
	    }
	    
//******************************************************************************************************************************   
//	insertion:
	
	    private int c2(Flight flight, Flight flight2) {
		// TODO Auto-generated method stub
		return 0;
	}


		public void sortName(AirLine p[]) {
	    	for (int i = 1; i < p.length; i++) {
				AirLine aux =p[i];
				int j= i;
				while(j>0&& compare(p[j-1],aux)==1) {
					p[i]=p[j];
					j--;
					
				}
				p[j]=aux;
			}
	    }
	    	
	    	  
//  *************************************************************************************************************************
	  // insertion
	  
	  public void SortGate(Flight p[])  {
	   for(int i=1;i<p.length;i++){
	   Flight aux =p[i];
	   int j = i;
	   while(j>0&&compare(p[j-1],aux)==1){
	   p[j]=p[j];
	   j--;
	   }
	   p[j]=aux;
	   }
	  
	  
	  }
private int compare(AirLine p, AirLine aux) {
	// TODO Auto-generated method stub
	return 0;
}


//***************************************************************************************************************************	  
	 //selection
	  
	  public void sortDate(Flight p[]) {
		 int i,j,pos=0;
		 Flight menor= null;
		 Flight temporal = null;
		 for (int k = 0; k < p.length; k++) {
			menor=p[k];
			for (int k2 = 0; k2 < p.length; k2++) {
				if(p[k2].compareTo(menor)==1) {
					menor=p[k2];
					pos=k2;	
				}
				
			}
			if(pos!=k) {
				temporal=p[k];
				p[k]=p[pos];
				p[pos]=temporal;
			}
		}
		 
	  }
	 
	  
//*****************************************************************************************************************************	    
	 //  
	    public void SortDestinationCities(Flight p[])  {
	   for(int i=1;i<p.length;i++){
	   Flight aux =p[i];
	   int j = i;
	   while(j>0&&compare(p[j-1],aux)==1){
	   p[j]=p[j];
	   j--;
	   }
	   p[j]=aux;
	   }
	  
	    } 
	  
//******************************************************************************************************************************
   public void SortNumberOfFlights(Flight p[])  {
	   for(int i=1;i<p.length;i++){
	   Flight aux =p[i];
	   int j = i;
	   while(j>0&&compare4(p[j-1],aux)==1){
	   p[j]=p[j];
	   j--;
	   }
	   p[j]=aux;
	   }
	  
	    }
	  
	    
//****************************************************************************************************************************   
	    
	   private int compare4(Flight flight, Flight aux) {
			// TODO Auto-generated method stub
			return 0;
		}


	private int compare(Flight flight, Flight aux) {
			// TODO Auto-generated method stub
			return 0;
		}

}
	







	
