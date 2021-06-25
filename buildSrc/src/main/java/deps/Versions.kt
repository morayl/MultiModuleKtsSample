package deps

object Versions {

    object App {
        const val compileSdkVersion = 29
        const val targetSdkVersion = 29
        const val minSdkVersion = 21
        const val versionCode = 1
        const val VersionName = "1.0"
        const val kotlin = "1.5.10"
        const val buildTools = "4.0.0"
    }

    internal object AndroidX {
        const val appCompat = "1.1.0"
        const val fragmentKtx = "1.2.5"
        const val constraintLayout = "1.1.3"
        const val recyclerView = "1.1.0"

        object Ktx {
            const val core = "1.3.0"
        }
    }

    internal const val groupie = "2.8.0"

    internal object Test {
        const val junit = "4.12"
    }

    internal object AndroidTest {
        const val junit = "1.1.1"
        const val espresso = "3.2.0"
    }

}