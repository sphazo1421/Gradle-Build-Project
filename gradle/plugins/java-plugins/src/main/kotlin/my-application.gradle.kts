

    plugins {
        id("application")
        id("my-java-base")
    }

    tasks.register<JarCount>("countJars"){
        allJars.from(tasks.jar)
        allJars.from(configurations.runtimeClasspath)

        countFile.set(layout.buildDirectory.file("gen/count.txt"))
    }

    tasks.register<Zip>("bundle") {

        group = "My Group"
        description = "Packages it all!"

        from(tasks.jar)
        from(configurations.runtimeClasspath)

        destinationDirectory.set(layout.buildDirectory.dir("distribution"))

    }

