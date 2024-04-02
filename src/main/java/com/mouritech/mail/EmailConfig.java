/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package com.mouritech.mail;

import static com.mouritech.constants.FrameworkConstants.REPORT_TITLE;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Remember to create an app password (App Password) for Gmail before sending
    //If you use Hosting's email, it's normal
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes

    public static final String SERVER = "vishalku.in@mouritech.com";
    public static final String PORT = "587";

    public static final String FROM = "vishalku.in@mouritech.com";
    public static final String PASSWORD = "******";

    public static final String[] TO = {"vishalku.in@mouritech.com"};
    public static final String SUBJECT = REPORT_TITLE;
}