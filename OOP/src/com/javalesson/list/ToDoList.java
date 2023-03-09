package com.javalesson.list;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> toDoList = new ArrayList<>();

    public void addToList(String task) {
        addToList(task);
    }

    public void addToListAtPosition(int position, String task) {
        addToListAtPosition(position, task);
    }

    public void printToDoList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

    public void changeTask(int position, String task) {
        toDoList.set(position, task);

    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }

}
