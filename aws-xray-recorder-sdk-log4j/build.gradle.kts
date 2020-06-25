plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api(project(":aws-xray-recorder-sdk-core"))

    compileOnly("org.apache.logging.log4j:log4j-api:2.13.3")

    testImplementation("org.apache.logging.log4j:log4j-api:2.13.3")
}

description = "AWS X-Ray Recorder SDK for Java – Log4J Trace ID Injection"
