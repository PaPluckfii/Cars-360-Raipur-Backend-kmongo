val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val mongo_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.0"
}

group = "sumeet.com"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-gson:$ktor_version")
    implementation("io.ktor:ktor-auth:$ktor_version")
    implementation("io.ktor:ktor-auth-jwt:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    //Mongo DB
    implementation("org.litote.kmongo:kmongo:$mongo_version")
    implementation("org.litote.kmongo:kmongo-coroutine:$mongo_version")
}