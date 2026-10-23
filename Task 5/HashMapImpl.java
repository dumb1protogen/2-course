import java.util.ArrayList;
import java.util.LinkedList;
//God curse (or bless) those libraries
public class HashMapImpl<V> implements HashMap<String, V> {
    private static final int TABLE_SIZE = 300007;
    private static final int A = 31;
    //If i get correct final = constant?

    private static class coupleEntries<V> {
        String key;
        V value;
        coupleEntries(String key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final ArrayList<LinkedList<coupleEntries<V>>> table; //Our Table

    public HashMapImpl() {
        table = new ArrayList<>(TABLE_SIZE); //
        for (int i = 0; i < TABLE_SIZE; i++) {
            table.add(null); //god it so stupid honestly, but I kinda dont know any idea that doesnt crash program.
            //Maybe I just dumb
            //Perhaps if we try call something that doesnt exist try catch error like in c++ and just put null in cell null?
        }
    }

    private long hashByString(String value) {
        long hash = 0;
        for (char ch : value.toCharArray()) {
            hash = (hash * A + ch) % TABLE_SIZE; //We turn words into table hash.
        }
        return hash;
    }

    @Override
    public void put(String key, V value) {
        int index = (int) hashByString(key);
        LinkedList<coupleEntries<V>> list = table.get(index); //we found

        if (list == null) { //we didnt found, creating
            list = new LinkedList<>();
            table.set(index, list);
        }

        for (coupleEntries<V> entry : list) {
            if (entry.key.equals(key)) {
                entry.value = value; //Writing new one insted old
                return;
            }
        }

        list.add(new coupleEntries<>(key, value)); //New couple
    }

    @Override
    public V getValue(String key) {//I wanna name it returnValue honestly
        int index = (int) hashByString(key);
        LinkedList<coupleEntries<V>> list = table.get(index);

        if (list == null) {
            return null; //we didnt found
        }

        for (coupleEntries<V> entry : list) {
            if (entry.key.equals(key)) {
                return entry.value; //we found
            }
        }

        return null; // we really didnt found
    }

    @Override
    public V delete(String key) {
        int index = (int) hashByString(key);
        LinkedList<coupleEntries<V>> list = table.get(index);
        if (list == null) {
            return null; //we didnt found
        }

        for (int i = 0; i < list.size(); i++) {
            coupleEntries<V> entry = list.get(i);
            if (entry.key.equals(key)) {
                V value = entry.value; //we found
                list.remove(i);
                if (list.isEmpty()) {
                    table.set(index, null); //Kinda stole that idea, it helps clear out table from empty  list.
                }
                return value;
            }
        }
        return null;
    }}