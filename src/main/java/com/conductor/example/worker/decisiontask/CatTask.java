package com.conductor.example.worker.decisiontask;

import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;
import org.springframework.stereotype.Component;

@Component
public class CatTask implements Worker {

    private static final String TYPE_DEF = "cat_meow";

    @Override public String getTaskDefName() {
        return TYPE_DEF;
    }

    @Override public TaskResult execute(Task task) {
        System.out.println("MEOW MEOW ! ! !");
        return TaskResult.complete();
    }
}
