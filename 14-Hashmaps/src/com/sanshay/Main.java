package com.sanshay;

import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash{

    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }
    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }


    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }
    @Override
    public String toString() {
        String ans = "";

        for (Entity entity : entities) {
            if (entity != null) {
                ans += entity.key + " = " + entity.value + "\n";
            }
        }

        return ans;
    }



}

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("kunal",99);
        map.put("sanshay",100);

//        System.out.println(map.get("sanshay"));
        System.out.println(map);
//
//        System.out.println(map.getOrDefault("sanshay",0));
//
        System.out.println(map.containsKey("kunal"));
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(78);
        set.add(78);
        System.out.println(set);
        // hashDemo();
        MapUsingHash mapp = new MapUsingHash();

        mapp.put("Mango", "King of fruits");
        mapp.put("Apple", "A sweet red fruit");
        mapp.put("Litchi", "Kunal's fav fruit");

        System.out.println(mapp);
        System.out.println(mapp.get("Mango"));

    }

}
