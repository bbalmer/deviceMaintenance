package com.laughlin.cucumber.stepdefs;

import com.laughlin.DeviceMaintenanceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DeviceMaintenanceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
