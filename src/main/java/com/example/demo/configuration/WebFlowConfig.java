package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.faces.config.*;
import org.springframework.faces.webflow.FlowFacesContextLifecycleListener;

@Configuration
public class WebFlowConfig extends AbstractFacesFlowConfiguration {

    @Bean
    public FlowExecutor flowExecutor() {
        return getFlowExecutorBuilder(flowRegistry())
                .addFlowExecutionListener(new FlowFacesContextLifecycleListener())
                .build();
    }

    @Bean
    public FlowDefinitionRegistry flowRegistry() {
        return getFlowDefinitionRegistryBuilder()
                .setBasePath("/WEB-INF")
                .addFlowLocationPattern("**/*-flow.xml").build();

}
    }