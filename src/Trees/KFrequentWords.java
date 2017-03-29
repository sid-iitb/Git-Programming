/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author sidhsaho
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
 
 class KFrequentWords {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
		String[] arr=new String[100];
		int k=4;
		HashMap<String, Integer> hash=new HashMap<String, Integer>(); 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("/home/aniket/welcome.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				arr=sCurrentLine.split(" ");
				for(int i=0;i<arr.length;i++)
				{
					if(null==hash.get(arr[i]))
					{
							hash.put(arr[i],1);
					}
					else
					{
						int x=hash.get(arr[i])+1;
						hash.put(arr[i],x);
					}
				}
 
 
			}
 
 
 
			HashMap<String, Integer> sortedMap = sortByComparator(hash);
			int i=0;
			for(String string:sortedMap.keySet())
			{
				if(i<k)
				System.out.println(string+" , "+hash.get(string));
				else
				break;
				i++;
			}
 
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
 
 
	private static HashMap sortByComparator(HashMap unsortMap) {
 
		List list = new LinkedList(unsortMap.entrySet());
 
		// sort list based on comparator
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue())
                                       .compareTo(((Map.Entry) (o1)).getValue());
			}
		});
 
		// put sorted list into map again
                //LinkedHashMap make sure order in which keys were inserted
		HashMap sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
 
 
}
 