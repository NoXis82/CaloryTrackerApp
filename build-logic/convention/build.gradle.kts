plugins {
    `kotlin-dsl`
}

group = "ru.noxis.calorytrackerapp.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
    compileOnly(libs.android.tools.common)
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
        register("androidLibraryCompose") {
            id = "calorytrackerapp.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidRoom") {
            id = "calorytrackerapp.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
        register("androidHilt") {
            id = "calorytrackerapp.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("androidRetrofit") {
            id = "calorytrackerapp.android.retrofit"
            implementationClass = "AndroidRetrofitConventionPlugin"
        }
        register("androidOkHttp") {
            id = "calorytrackerapp.android.okhttp"
            implementationClass = "AndroidHttpConventionPlugin"
        }
        register("androidFeatureUi") {
            id = "calorytrackerapp.android.feature.ui"
            implementationClass = "AndroidDynamicFeatureConventionPlugin"
        }
    }
}
