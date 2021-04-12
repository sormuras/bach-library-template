import com.github.sormuras.bach.ProjectInfo;
import com.github.sormuras.bach.ProjectInfo.*;

@ProjectInfo(
    // <editor-fold desc="Options">
    options =
        @Options(
            compileModulesForJavaRelease = 11,
            includeSourceFilesIntoModules = true,
            tools = @Tools(limit = {"javac", "jar", "javadoc", "junit"})),
    // </editor-fold>
    // <editor-fold desc="Libraries">
    libraries =
        @Libraries(
            externalLibraries = {
              @ExternalLibrary(name = LibraryName.JUNIT, version = "5.7.1"),
            })
    // </editor-fold>
    )
module bach.info {
  requires com.github.sormuras.bach;
}
