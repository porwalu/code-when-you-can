import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
###
public class Misc {
	
	static 		Map <String,String> map = new HashMap<>();
int a = 10;
	static {
		map.put("Hello","hi");
	}


	public static void main(String[] args) {
		
		Misc misc = new Misc();		
		map.put("hi","hello");
		System.out.println(map.get("Hello"));
		System.out.println(map.get("hi"));
		StringBuilder sb = new StringBuilder("N");
		
		Deque<Integer> deq = new ArrayDeque<>();
		Queue<Integer> list = new LinkedList<>();

		Queue<Integer> queue = new LinkedList<>();

		
	}

}

