# cowin-finder

This project is to help people find vaccine slots and get notified as soon as possible

For Noobs:
1. Download jdk from https://www.oracle.com/in/java/technologies/javase-jdk11-downloads.html
2. Install it!
3. Download the release from the releases section, unzip it into a folder. you should see two files. one jar and one properties.json
5. Go to https://ifttt.com/home and create your account
6. Go to https://ifttt.com/applets/ud6P23az and connect the applet to your account
7. Go to https://ifttt.com/maker_webhooks and click on "documentation" on the right side of the page
8. You will see a webhook url on the page, sorta like: https://maker.ifttt.com/trigger/{event}/with/key/fKYMWaMcG5ATaVjzj0m_bDFlYisi02AjKNGiLuYD_lj 
9. Install the app on your phone and set it up. allow it do not disturb access
10. Update the webhook in the properties.json file
11. Find your districtId in https://drive.google.com/file/d/1B9agSp4qlcibDZ-vQcn4neg4mVsH9DPH/view?usp=sharing and update it in the properties.json file
12. open commandline or terminal, cd to the location of the jar
13. run the command: "java -jar cowin-finder-0.0.1-SNAPSHOT-jar-with-dependencies.jar" and leave it enabled for the time you want to keep an eye on the slots

For Devs:
Prerequisites:
1. Java 11
2. Eclipse
3. Lombok
4. IFTTT account

How to use:
1. Download and install jdk11 from oracle or openjdk
2. Download and install latest eclipse
3. Download and install lombok: https://projectlombok.org/download
4. Restart eclipse
5. Update properties.json with the required arguments. Create a webhook for notifications on IFTTT and paste the url in the file. also update the district-id as needed.
6. Run the application from Main.java
