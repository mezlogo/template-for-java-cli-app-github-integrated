plugins {
    id("mezlogo.common-build")
    application
}

dependencies {
    implementation(project(":api"))
}

application {
    mainClass.set("mezlogo.template_cli.cli.Main")
    applicationName = "mycliapp"
}
