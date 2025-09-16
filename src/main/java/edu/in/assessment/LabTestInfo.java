package edu.in.assessment;

import java.util.ArrayList;
import java.util.List;

class LabTestInfo {
    // Private attribute to store test details as "testName:cost"
    private List<String> testList = new ArrayList<>();
    private final String name = "vinoth";

    // Adds a single test detail string to the list
    public void addTestDetails(String testDetails) {
        testList.add(testDetails);
    }

    // Returns test names whose cost lies within [minimumCost, maximumCost]
    public List<String> getTestsWithinGivenCostRange(int minimumCost, int maximumCost) {
        List<String> filteredTests = new ArrayList<>();

        for (String details : testList) {
            // details format: "testName:cost"
            String[] parts = details.split(":");
            String testName = parts[0].trim();
            int cost = Integer.parseInt(parts[1].trim());

            if (cost >= minimumCost && cost <= maximumCost) {
                filteredTests.add(testName);
            }
        }

        return filteredTests;
    }
}
