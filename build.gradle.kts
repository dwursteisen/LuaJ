plugins {
    java
    `java-library`
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        google()
        jcenter()
    }
}

allprojects {

    version = "1.0"
    apply(plugin = "java")

    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
        maven { url = uri("https://oss.sonatype.org/content/repositories/releases/") }
    }

}

project(":j2se") {

    dependencies {
        implementation(project(":core"))
        // https://mvnrepository.com/artifact/org.apache.bcel/bcel
        implementation("org.apache.bcel:bcel:5.2")

    }
}

project(":core") {
    dependencies {

    }
}

/*
idea {
    project {
        this as ExtensionAware
        configure<ProjectSettings> {
            this as ExtensionAware
            configure<NamedDomainObjectContainer<RunConfiguration>> {
                this as PolymorphicDomainObjectContainer<RunConfiguration>
                create("🎮 Numcher - Desktop", Application::class) {
                    this.mainClass = "fr.sous.les.apps.numcher.desktop.DesktopLauncher"
                    this.workingDirectory = "./core/assets/"
                    this.moduleName = "desktop_main"
                }
            }
        }
    }
}
*/