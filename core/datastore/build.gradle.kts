plugins {
    alias(libs.plugins.my.android.library)
    alias(libs.plugins.my.android.hilt)
}

android {
    namespace = "com.google.samples.apps.multi_moduleproject.core.datastore"
}

dependencies {
    api(libs.androidx.dataStore.core)
    api(projects.core.model)

    implementation(projects.core.common)
}