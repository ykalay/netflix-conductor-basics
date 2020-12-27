package com.conductor.example.worker.decisiontask;

import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;
import org.springframework.stereotype.Component;

@Component
public class DogTask implements Worker {

    private static final String TYPE_DEF = "dog_bark";

    @Override public String getTaskDefName() {
        return TYPE_DEF;
    }

    @Override public TaskResult execute(Task task) {
        System.out.println("HAW HAW HAW ! ! !");
        return TaskResult.complete();
    }
}
