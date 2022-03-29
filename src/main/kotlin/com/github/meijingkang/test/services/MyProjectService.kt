package com.github.meijingkang.test.services

import com.intellij.openapi.project.Project
import com.github.meijingkang.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
