package com.camunda.sample.camundaquickstart;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldWorker {
    Logger logger = LoggerFactory.getLogger(HelloWorldWorker.class);
    @JobWorker(type = "hello-world-worker", autoComplete = true)
    public void handle(final JobClient client, final ActivatedJob job) {

        // perform the action or activity which is required
        logger.info("Hello World, Worker executed...");
    }
}
