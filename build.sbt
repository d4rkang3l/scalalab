name                := "ScalaLab"

version             := ""

organization        := ""

scalaVersion        := "2.12.4" 

javaOptions   ++= Seq("-Xss", "2M", "-Xmx", "4G")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")


scalacOptions ++= Seq("-deprecation", "-unchecked", "-opt:_","closure-invocations", "l:method")

crossScalaVersions  := Seq("2.12.4") 

description         := "A MATLAB-like environment)"


exportJars := true

 
val classPath = Seq(
  "./lib/ApacheCommonMaths.jar",
  "./lib/blas.jar",
     "./lib/JASYMCA.jar",
    "./lib/JFreeChart.jar",
    "./lib/JfreeCommon.jar",
     "./lib/jfreesvg.jar",
     "./lib/jgraph.jar",
      "./lib/itext.jar",
       "./lib/LBFGS.jar",
     "./lib/MTJColtSGTJCUDA.jar",
     "./lib/NumericalRecipesNUMAL.jar",
     "./lib/PDFRenderer.jar",
     "./lib/RSyntaxTextArea.jar",
     "./lib/akka-actor.jar",
    "./lib/antlr-2.7.7.jar",
     "./lib/apidoc.jar",
     "./lib/arpack_combo-0.1.jar",
     "./lib/asm-all-4.1.jar",
     "./lib/cglib-nodep-2.2.jar",
     "./lib/config.jar",
     "./lib/diffutils.jar",
     "./lib/ejml.jar",
     "./lib/f2jutil.jar",
     "./lib/fjbg.jar",
     "./lib/funclate-131.jar",
     "./lib/gsl-linux-x86.jar",
     "./lib/gsl-linux-x86_64.jar",
     "./lib/gsl-macosx-x86_64.jar",
     "./lib/gsl-windows-x86.jar",
     "./lib/gsl-windows-x86_64.jar",
     "./lib/gsl.jar",
    "./lib/Jeigen-onefat.jar",
    "./lib/hamcrest-core-1.3.jar",
    "./lib/itext-2.1.5.jar",
     "./lib/jSciJPlasmaJSparseJTransforms.jar",
     "./lib/jarjar-1.1.jar",
     "./lib/javacpp.jar",
     "./lib/jdk6Help.jar",
     "./lib/jhall.jar",
     "./lib/jline.jar",
     "./lib/jna-4.0.0.jar",
     "./lib/jsearch.jar ",
     "./lib/jsyntaxpane.jar",
     "./lib/matlabscilab.jar",
     "./lib/netlib-java-0.9.3.jar",
     "./lib/objenesis-1.2.jar",
     "./lib/optimization.jar",
     "./lib/scala-actors-migration.jar",
     "./lib/scala-actors.jar",
     "./lib/scala-compiler.jar",
     "./lib/scala-continuations-library.jar",
     "./lib/scala-continuations-plugin.jar",
     "./lib/scala-library.jar",
     "./lib/scala-parser-combinators.jar",
     "./lib/scala-reflect.jar",
     "./lib/scala-swing.jar",
     "./lib/scala-xml.jar",
     "./lib/scalaHelp.jar",
     "./lib/scalap.jar",
     "./lib/txt2xhtml.jar",
     "./lib/stringtemplate-3.2.1.jar",
     "./lib/xmlgraphics-commons.jar"
    )
    
    

packageOptions += Package.ManifestAttributes(
  "Class-Path" -> classPath.mkString(" "),
  "Main-Class" -> "scalaExec.scalaLab.scalaLab"
)
   

