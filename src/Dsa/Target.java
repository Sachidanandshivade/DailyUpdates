HashMap<Integer,Integer> map = new HashMap<>();
for(int num: arr) {
    map.put(num, map.getOrDefault(num,0)+1);
}

int max = arr[0];
int count = 0;
for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
    if(entry.getValue() > count){
        count = entry.getValue();
        max = entry.getKey();
    }
}
return max;





HashSet<Integer> set = new HashSet<>();

for(int num: arr) {
    if(set.contains(num)){
        return "Yes";
    }else{
        set.add(num);
    }
}

HashSet<Integer> set = new HashSet<>();

int count = 0;
for(int num: arr){
    if(set.add(num)){
        count++;
    }
    
}

ArrayList<Integer> result = new ArrayList<>();

HashMap<Integer,Integer> map = new HashMap<>();
for(int num: arr) {
    map.put(num,map.getOrDefault(num,0)+1);
}

for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
    if(entry.getValue() == 1) {
       result.add(entry.getKey());
    }
}
Collections.sort(result);
return result.isEmpty() ? result.add(-1) : result;


ArrayList<Integer> result = new ArrayList<>();
HashMap<Integer,Integer> map = new HashMap<>();

for(int num: arr) {
    map.put(num, map.getOrDefault(num,0)+1);
}

for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    if (entry.getValue() > 1) {
        result.add(entry.getKey());
    }
}
Collections.sort(result);
return result.isEmpty()? new ArrayList<>(List.of(-1)): result;


ArrayList<String> result = new ArrayList<>();

HashMap<Character,Integer> map = new TreeMap<>();
for(char ch: s.toCharArray()){
    map.put(ch,map.getOrDefault(ch,0)+1);
}

for(Map.Entry<Character,Integer> entry: map.entrySet()) {
    result.add(entry.getKey() + " " + entry.getValue());
}

return result;


Map<Character,Integer> map1 = new TreeMap<>();
Map<Character,Integer> map2 = new TreeMap<>();

for(char ch : s1.toCharArray()) {
    map1.put(ch, map1.getOrDefault(ch,0) +1);
}

for(char ch : s2.toCharArray()) {
    map2.put(ch, map2.getOrDefault(ch,0) +1);
}

if(map1.equals(map2)) {
    return "YES";
}

return "NO";

