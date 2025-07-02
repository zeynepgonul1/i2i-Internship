import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastExample {
    public static void main(String[] args) {
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();
        IMap<Integer, Person> map = instance.getMap("personMap");

        for (int i = 0; i < 10000; i++) {
            map.put(i, new Person("Person-" + i));
        }

        for (int i = 0; i < 10000; i++) {
            Person p = map.get(i);
            if (i % 1000 == 0) {
                System.out.println("Retrieved: " + p.getName());
            }
        }

        instance.shutdown();
    }
}
