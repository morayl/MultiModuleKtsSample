import com.android.build.gradle.BaseExtension

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
        // importはbuildScriptには効かないため、フルパスで定義
        classpath(deps.Plugins.kotlinGradle)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() // Warning: this repository is going to shut down soon
    }
}

subprojects {
    afterEvaluate {
        // "android"をBaseExtensionにキャストすることで、androidブロックが書ける
        extensions.getByName("android").castApply<BaseExtension> {
            compileSdkVersion(Versions.App.VersionName)
        }
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

/**
 * castした対象がthisとしてブロック記載出来ます
 * castできたらapplyできるイメージ
 */
inline fun <reified T> Any?.castApply(block: T.() -> Unit): T? {
    return if (this is T) {
        block()
        this
    } else {
        null
    }
}
