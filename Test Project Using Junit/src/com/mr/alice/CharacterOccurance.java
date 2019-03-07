package com.mr.alice;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	static public Map<Character,Integer> findOccurance(String message)
	{
		HashMap<Character,Integer> table = null;
		if(message!=null) {
			message = message.trim();
			table = new HashMap<>(1);
			char[] charArray = message.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if(table.containsKey(charArray[i])) {
					table.put(charArray[i],table.get(charArray[i])+1);
				}else {
					table.put(charArray[i], 1);
				}
			}
			table.remove(' ');
		}
		return table;
	}
}
