package com.test.ten;

import java.util.HashMap;

public class Run {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<Person, String>();
        map.put(new Person("001"), "findingsea");
        map.put(new Person("002"), "linyin");
        map.put(new Person("003"), "henrylin");
        map.put(new Person("003"), "findingsealy");
        System.out.println(map.toString());
        System.out.println(map.get(new Person("001")));
        System.out.println(map.get(new Person("002")));
        System.out.println(map.get(new Person("003")));
    }

}
