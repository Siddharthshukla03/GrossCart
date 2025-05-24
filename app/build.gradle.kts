plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.23"
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.flash"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.flash"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    dependencies {
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
        implementation("androidx.activity:activity-compose:1.8.2")
        implementation(platform("androidx.compose:compose-bom:2023.08.00"))
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.0")

        testImplementation("junit:junit:4.13.2")

        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
        androidTestImplementation("androidx.compose.ui:ui-test-junit4")

        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
        implementation("androidx.navigation:navigation-compose:2.6.0")

        implementation("com.squareup.retrofit2:retrofit:2.11.0")
        implementation("com.squareup.retrofit2:converter-scalars:2.11.0")

        implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
        implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")
        implementation("com.squareup.okhttp3:okhttp:4.12.0")

        implementation("io.coil-kt:coil-compose:2.4.0")

        implementation("androidx.datastore:datastore-preferences:1.0.0")

        implementation(platform("com.google.firebase:firebase-bom:33.13.0"))
        implementation("com.google.firebase:firebase-analytics")

        implementation("com.google.firebase:firebase-auth")
        implementation("com.google.firebase:firebase-database")
    }
}