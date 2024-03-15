import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
    war

    checkstyle

    id("org.springframework.boot")
    id("io.spring.dependency-management")

    kotlin("jvm")
    kotlin("plugin.spring")
}

group = "org.pegasus"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect:_")

    developmentOnly(Spring.boot.devTools)

    implementation(Spring.boot.web)
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.3")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.3")

    implementation("org.liquibase:liquibase-core")
    runtimeOnly("org.postgresql:postgresql")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:_")

    testImplementation(Kotlin.test)
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        minHeapSize = "256M"

        jvmArgs("-Dspring.profiles.active=test")
    }
    withType<BootRun> {
        jvmArgs("-Dspring.profiles.active=dev")
    }
    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }
}

repositories {
    mavenCentral()
}
