package dt150420;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapDemo {
	public static void main(String args[]) throws IOException {
		File f=new File("vehicle.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		List<String> l1=new ArrayList<String>();
		String data=null;
		while((data=bf.readLine())!=null) {
			l1.add(data);
		}
		Map<String,Integer> map=new HashMap<String,Integer>();
		Iterator<String> it=l1.iterator();
		while(it.hasNext()) {
			String car = it.next();
			
			
			
			map.put(car,Collections.frequency(l1, car));
		}
		
		//System.out.println(map);
		Set<Map.Entry<String,Integer>> carset=map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1=carset.iterator();
		while(it1.hasNext()) {
			
			Map.Entry<String, Integer> itr=it1.next();
			System.out.println(itr.getKey() +"->"+itr.getValue());
		}
		
	}

}

