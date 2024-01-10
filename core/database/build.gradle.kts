plugins {
    alias(libs.plugins.my.android.library)
    alias(libs.plugins.my.android.hilt)
    alias(libs.plugins.my.android.room)
}

android {
    namespace = "com.google.samples.apps.multi_moduleproject.core.database"
}

dependencies {
    api(projects.core.model)

}