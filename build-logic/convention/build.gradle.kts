plugins {
    `kotlin-dsl`
}

group = "ru.noxis.calorytrackerapp.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "calorytrackerapp.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "calorytrackerapp.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "calorytrackerapp.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
    }
}
