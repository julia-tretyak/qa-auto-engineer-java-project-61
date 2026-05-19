plugins {
    application
    checkstyle
    id("org.sonarqube") version "5.1.0.4882"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    checkstyle("com.puppycrawl.tools:checkstyle:10.12.0")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.12.0"
    configFile = file("${project.rootDir}/config/checkstyle/checkstyle.xml")
}