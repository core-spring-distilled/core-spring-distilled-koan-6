package com.simplicityitself.corespringdistilled.koans

import com.simplicityitself.corespringdistilled.koans.persistence.Repository
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import spock.lang.Specification

class Koan5 extends Specification {
    def "Configure a single Spring Bean using XML"() {
        given:
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/simplicityitself/corespringdistilled/koans/configuration/persistence/single-bean.xml");

        when: "Begin your Koan Here: Create an appropriate bean entry in the single-bean.xml configuration file."
        Repository repository = applicationContext.getBean(Repository.class);

        then: "The application context should not be null"
        repository != null;
    }
}
