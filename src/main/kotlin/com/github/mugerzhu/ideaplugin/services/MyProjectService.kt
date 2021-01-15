package com.github.mugerzhu.ideaplugin.services

import com.github.mugerzhu.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
