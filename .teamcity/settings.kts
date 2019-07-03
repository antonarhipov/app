import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.SvnVcsRoot
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.project
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2018_2.version

version = "2018.2"

project {

}

object MyVcs : GitVcsRoot({
    name = "MyVcs"
    url = "http://localhost:3000/anton/app"

    branchSpec = """
        +:refs/heads/(master)
        +:refs/heads/(feature*)
    """.trimIndent()
})
