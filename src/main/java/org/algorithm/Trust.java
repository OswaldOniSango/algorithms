package org.algorithm;

import java.util.HashMap;

public class Trust {
    public static HashMap<String, Integer> findTrustWorthyGroups(HashMap<String, Integer> subgroups) {
        // Find the maximum value
        int maxValue = 0;
        for (int value : subgroups.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        HashMap<String, Integer> trustworthyGroups = new HashMap<>();
        // Filter the trustworthy subgroups
        for (String subgroup : subgroups.keySet()) {
            int value = subgroups.get(subgroup);
            double weight = (double) value / maxValue;
            if (weight >= 0.7) {
                trustworthyGroups.put(subgroup, value);
            }
        }

        return trustworthyGroups;
    }
}
