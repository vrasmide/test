package com.Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListItems {
// key will act as an id of the value
private Integer key;
// value will be the value of the above key
private String value;

// create constructor for reference
public ListItems(Integer id, String name)
{

// assigning the value of key and value
this.key = id;
this.value = name;
}

// return private variable key
public Integer getkey() { return key; }


// return private variable name
public String getvalue() { return value; }


}

public class Key_ValuePair {

public static void main(String[] args) {
// Creating a List of type ListItems using ArrayList
List<ListItems> list = new ArrayList<ListItems>();


// add the member of list
list.add(new ListItems(1, "I"));
list.add(new ListItems(2, "Love"));
list.add(new ListItems(3, "India"));
list.add(new ListItems(4, "For"));
list.add(new ListItems(5, "Ever"));


// Map which will store the list items
Map<Integer, String> map = new HashMap<>();

list.forEach(
(n) -> { map.put(n.getkey(), n.getvalue()); });

// Printing the given map
System.out.println("Map : " + map);
}

}
