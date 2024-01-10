plugins {
    alias(libs.plugins.my.android.library)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.google.samples.apps.multi_moduleproject.core.domain"
}

dependencies {

    api(projects.core.data)
    api(projects.core.model)
}