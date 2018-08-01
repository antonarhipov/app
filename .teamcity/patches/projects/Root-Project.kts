package patches.projects

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project
import jetbrains.buildServer.configs.kotlin.v2018_1.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        expect {
            password("passwordPhrase", "пароль")
        }
        update {
            password("passwordPhrase", "credentialsJSON:b913fa4a-59be-4179-898f-540f7b3ae26c")
        }
    }
}