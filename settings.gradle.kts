



    pluginManagement {
        repositories.gradlePluginPortal()
//        repositories.mavenCentral()
//        repositories.maven("https://my.location/repo") {
//            credentials.username = "..."
//            credentials.password = "..."
//        }

        includeBuild("gradle/plugins")
    }


    dependencyResolutionManagement {
        repositories.mavenCentral()
//        repositories.google()
//        repositories.maven("https://my.location/repo") {
//            credentials.username = "..."
//            credentials.password = "..."
//        }

        //includeBuild("../my-other-project")
    }

    rootProject.name = "my-project"

    include("app")// app
    include("business-logic")// business-logic
    include("data-model")// data-model