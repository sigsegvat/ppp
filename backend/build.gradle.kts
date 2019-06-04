plugins {
    java
    kotlin("jvm") version "1.3.31"
    kotlin("plugin.spring") version "1.3.31"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
    idea
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencyManagement {
    dependencies {
        dependency("org.springframework.boot:spring-boot-starter-web:2.1.5.RELEASE")
        dependency("org.springframework.boot:spring-boot-starter-test:2.1.5.RELEASE")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

repositories {
    mavenCentral()
}
