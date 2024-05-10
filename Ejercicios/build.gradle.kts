plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.xerial:sqlite-jdbc:3.45.3.0")
    implementation("com.mysql:mysql-connector-j:8.3.0")
    implementation ("org.slf4j:slf4j-api:2.0.13")
    implementation ("org.slf4j:slf4j-simple:2.0.13")

}

tasks.test {
    useJUnitPlatform()
}