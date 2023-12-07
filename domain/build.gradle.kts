plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation(project(":common"))

    implementation("io.insert-koin:koin-core:3.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

}