package com.cydeo.runners;
//class dışında run kodu yazıyoruz @test veya main metodu class içinde yazıyorduk

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
               // "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },

        //bu classın projenin geri kalanına ulaşması için. 2 bölümü var
      features = "src/test/resources/features", //resources altındaki features sağ tıkla path reference content root path i seç
      glue ="com/cydeo/step_definitions", // aynı package içinde olduğu için step_definitions a sağ tıkla path reference content root path i seç
        tags = "@employee",
        publish = false
)
public class CukesRunner {
}
