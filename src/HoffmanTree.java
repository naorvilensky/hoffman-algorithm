import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class HoffmanTree {

	private HoffmanNode root;

	public HoffmanTree(String text) {
		createTree(createMapping(text));
	}

	private void createTree(Map<Character, Integer> map) {

	}

	private static HashMap<Character, Integer> createMapping(@NotNull String text) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < text.length(); i++) {
			if(map.containsKey(text.charAt(i))) {
				int value = map.get(text.charAt(i));
				map.replace(text.charAt(i), value + 1);
			} else {
				map.put(text.charAt(i), 1);
			}
		}

		return map;
	}

	private static char getMinHashMapKey(Map<Character, Integer> map) {
		int minValue = Integer.MAX_VALUE;
		char minKey = '\0';

		for(char key: map.keySet()) {
			int value = map.get(key);
			if(value < minValue) {
				minValue = value;
				minKey = key;
			}
		}

		return minKey;
	}
}
