package org.example.taskmanagementapi.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class generateIdService {
    private static int number;
    List<Integer> ListOfIds = new ArrayList<>();

    public int generateId() {
        this.number++;
        ListOfIds.add(this.number);
        return this.number;
    }
}
