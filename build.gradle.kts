plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    kotlin("multiplatform").apply(false)
}

buildscript{
    dependencies{
        classpath("dev.icerock.moko:resources-generator:0.23.0")
        classpath("dev.icerock.moko:graphics:0.9.0")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
