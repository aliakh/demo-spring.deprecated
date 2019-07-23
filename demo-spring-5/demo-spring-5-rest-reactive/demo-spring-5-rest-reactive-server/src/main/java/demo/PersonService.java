package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PersonService {

    public static final Map<Long, Map<String, Object>> PERSON_DATA;

    static {
        PERSON_DATA = new HashMap<>();
        addPerson(1L, "Amanda");
        addPerson(2L, "Brittany");
        addPerson(3L, "Christopher");
        addPerson(4L, "Elizabeth");
        addPerson(5L, "Hannah");
        addPerson(6L, "Joshua");
        addPerson(7L, "Kayla");
        addPerson(8L, "Lauren");
        addPerson(9L, "Matthew");
        addPerson(10L, "Megan");
    }

    private static void addPerson(Long id, String name) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", id);
        map.put("name", name);
        PERSON_DATA.put(id, map);
    }

    public static final Map<Long, Map<String, Object>> HOBBY_DATA;

    static {
        HOBBY_DATA = new HashMap<>();
        addHobby(1L, "Travel");
        addHobby(2L, "Coffee Roasting");
        addHobby(3L, "Puzzles");
        addHobby(4L, "3D Printing");
        addHobby(5L, "Skiing");
        addHobby(6L, "Yoga");
        addHobby(7L, "Scuba Diving");
        addHobby(8L, "Shopping");
        addHobby(9L, "Tai Chi");
        addHobby(10L, "Kombucha brewing");
    }

    private static void addHobby(Long personId, String hobby) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("personId", personId);
        map.put("hobby", hobby);
        HOBBY_DATA.put(personId, map);
    }
}
