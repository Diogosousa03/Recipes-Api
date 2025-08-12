plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

        implementation("org.http4k:http4k-core:5.15.0.0")
    implementation("org.http4k:http4k-server-jetty:5.15.0.0")
        implementation("org.http4k:http4k-client-okhttp:5.15.0.0") // optional for making HTTP calls


}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}