package com.lv297java.hometask1;

import com.lv297java.hometask1.tasks.AbstractTest;
import com.lv297java.hometask1.tasks.Task107;
import com.lv297java.hometask1.tasks.Task243a;
import com.lv297java.hometask1.tasks.Task243b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<AbstractTest> tasksList = new ArrayList();

    static {                           //До вечора спробую зробити автоматичну ініціалізацію коллекції з допомогою рефлексії
        tasksList.add(new Task107());
        tasksList.add(new Task243a());
        tasksList.add(new Task243b());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String taskName;
        while (true) {
            System.out.println("Enter task name:");
            taskName = bufferedReader.readLine();
            if (taskName.equals("exit"))
                break;

            for (AbstractTest abstractTest : tasksList) {
                if (abstractTest.getTestID().equals(taskName)) {
                    abstractTest.execute();
                }
            }
        }
    }
}
