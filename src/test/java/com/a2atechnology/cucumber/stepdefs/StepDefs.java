package com.a2atechnology.cucumber.stepdefs;

import com.a2atechnology.A2AtechnologyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = A2AtechnologyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
