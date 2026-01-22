package org.algorithm;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrustTest {

    @Test
    void printsTrustworthyGroupsBasedOnThreshold() {
        HashMap<String, Integer> subgroups = new HashMap<>();
        subgroups.put("GroupA", 10);
        subgroups.put("GroupB", 20);
        subgroups.put("GroupC", 70);
        subgroups.put("GroupD", 100);

        HashMap<String, Integer> trustworthyGroups = Trust.findTrustWorthyGroups(subgroups);

        assertEquals(2, trustworthyGroups.size());
        assertTrue(trustworthyGroups.containsKey("GroupC"));
        assertTrue(trustworthyGroups.containsKey("GroupD"));
        assertFalse(trustworthyGroups.containsKey("GroupA"));
        assertFalse(trustworthyGroups.containsKey("GroupB"));

    }

    @Test
    void handlesEmptySubgroups() {
        HashMap<String, Integer> subgroups = new HashMap<>();

        HashMap<String, Integer> trustworthyGroups = Trust.findTrustWorthyGroups(subgroups);

        assertTrue(trustworthyGroups.isEmpty());
    }

    @Test
    void handlesAllTrustworthySubgroups() {
        HashMap<String, Integer> subgroups = new HashMap<>();
        subgroups.put("GroupA", 70);
        subgroups.put("GroupB", 80);
        subgroups.put("GroupC", 90);

        HashMap<String, Integer> trustworthyGroups = Trust.findTrustWorthyGroups(subgroups);

        assertEquals(3, trustworthyGroups.size());
        assertTrue(trustworthyGroups.containsKey("GroupA"));
        assertTrue(trustworthyGroups.containsKey("GroupB"));
        assertTrue(trustworthyGroups.containsKey("GroupC"));
    }
}
