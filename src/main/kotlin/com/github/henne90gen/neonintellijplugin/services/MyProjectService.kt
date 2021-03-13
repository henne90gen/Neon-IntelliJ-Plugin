package com.github.henne90gen.neonintellijplugin.services

import com.github.henne90gen.neonintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
