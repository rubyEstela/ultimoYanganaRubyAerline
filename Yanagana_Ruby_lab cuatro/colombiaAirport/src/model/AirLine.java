package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AirLine {
	
	private static final String PATH_DESTINATIONs_CITIES = "data/DestinationCities.txt";
	private String name;
	private Flight []flights;
	
	    public AirLine(String name, Flight[] flights) {
		super();
		this.name = name;
		this.flights = flights;
	}
	    
	    public String getName() {
			return name;
		}
       public void setName(String name) {
			this.name = name;
		}

       public Flight[] getFlights() {
			return flights;
		}
       public void setFlights(Flight[] flights) {
			this.flights = flights;
		}


       public static String getPathDestinationsCities() {
			return PATH_DESTINATIONs_CITIES;
		}


private String readDestination(int position) throws IOException{
		File f = new File(PATH_DESTINATIONs_CITIES);
		BufferedReader br = new BufferedReader(new FileReader(f));
		int i = 0;
		String msg = "";
		while(i < position) {
			msg = br.readLine();
			i++;
		}
		br.close();
		return msg;
	}

}
