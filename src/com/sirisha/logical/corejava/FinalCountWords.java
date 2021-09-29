package com.sirisha.logical.corejava;

import java.util.HashMap;

public class FinalCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This this is is done by sirisha";
        String[] split = str.split(" ");
         
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i].toLowerCase())) {
                int count = map.get(split[i]);
                map.put(split[i].toLowerCase(), count+1);
            }
            else {
                map.put(split[i].toLowerCase(), 1);
            }
        }
        System.out.println(map);
		
		
	}

}
