
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.keluarga.aman"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.keluarga.aman"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    flavorDimensions += "role"

    productFlavors {
        create("parent") {
            dimension = "role"
            applicationIdSuffix = ".parent"
            resValue("string", "app_name", "Keluarga Aman Orang Tua")
        }

        create("child") {
            dimension = "role"
            applicationIdSuffix = ".child"
            resValue("string", "app_name", "Keluarga Aman Anak")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
