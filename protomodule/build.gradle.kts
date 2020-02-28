plugins {
	kotlin("jvm")
    id("com.google.protobuf") version "0.8.11"
}

dependencies {
    implementation(project(":okhttp"))
}