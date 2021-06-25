package deps

object Lib {
    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.AndroidX.fragmentKtx}"

        object Ktx {
            const val core = "androidx.core:core-ktx:${Versions.AndroidX.Ktx.core}"
        }

        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerView}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.App.kotlin}"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.App.kotlin}"
    }


    object Groupie {
        const val core = "com.xwray:groupie:${Versions.groupie}"
        const val viewBinding = "com.xwray:groupie-viewbinding:${Versions.groupie}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.Test.junit}"
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:${Versions.AndroidTest.junit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
    }

    const val footprint = "com.morayl:footprint:1.4.0"
}

object Plugins {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.App.buildTools}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.App.kotlin}"
    val googlePlayService = "com.google.gms:google-services:4.2.0"
}