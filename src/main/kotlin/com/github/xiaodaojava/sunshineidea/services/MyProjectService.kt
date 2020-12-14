package com.github.xiaodaojava.sunshineidea.services

import com.intellij.openapi.project.Project
import com.github.xiaodaojava.sunshineidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
