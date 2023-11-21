package com.example.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.InputFiles;

public abstract class JarCount extends DefaultTask {

    // ConfigurableFileCollection
    // RegularFileProperty
    // DirectoryProperty

    @InputFiles
    public abstract ConfigurableFileCollection getAllJars();

}
