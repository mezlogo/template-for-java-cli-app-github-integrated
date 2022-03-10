plugins {
    id("mezlogo.common-build")
    application
}

dependencies {
    implementation(project(":api"))
    implementation("info.picocli:picocli:4.6.3")
    annotationProcessor("info.picocli:picocli-codegen:4.6.3")
}

tasks.withType(JavaCompile::class.java) {
    options.compilerArgs.add("-Aproject=${project.group}/${project.name}")
}

application {
    mainClass.set("mezlogo.template_cli.cli.MainCommand")
    applicationName = "mycliapp"
}
