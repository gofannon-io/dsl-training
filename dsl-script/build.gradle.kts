plugins {
    kotlin("jvm") version "2.2.10"
    antlr
    idea
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.2")

    testImplementation(kotlin("test"))
}


tasks.generateGrammarSource {
    maxHeapSize = "64m"
    outputDirectory = project.file("src/main/java/org/example/dsl_script/dsl/connect/grammar")
    arguments = arguments + listOf("-visitor", "-long-messages")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateTestGrammarSource)
}
