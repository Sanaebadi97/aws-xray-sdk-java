plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api(project(":aws-xray-recorder-sdk-core"))

    compileOnly("org.slf4j:slf4j-api:1.7.30")

    testImplementation("ch.qos.logback:logback-classic:1.3.0-alpha5")
}

description = "AWS X-Ray Recorder SDK for Java - SLF4J Trace ID Injection"
