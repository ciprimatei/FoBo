import sbt._
import sbt.Keys._
import java.lang.String

object LiftModuleFoBoBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val liftEdition = SettingKey[String]("liftEdition", "Lift Edition (short version number to append to artifact name)")
  
  lazy val root = Project(id   = "FoBo", 
                             base = file(".")) 
                             .dependsOn(jquery,bootstrap,fontAwesome,foundation,datatables,knockout,angularjs,jquerymobile,prettify)                                                 
                             .settings(description := "FoBo", parallelExecution in Test := false)
                             
//aggregate(fontAwesome,bootstrap)                             
                             
   lazy val fontAwesome = Project(id   = "FoBo-Font-Awesome", 
                             base = file("Font-Awesome"))  
                             
  lazy val bootstrap    = Project(id   = "FoBo-Twitter-Bootstrap", 
                             base = file("Twitter-Bootstrap"))  
                             
  lazy val foundation   = Project(id   = "FoBo-Foundation", 
                             base = file("Foundation"))                                               
                             
  lazy val datatables   = Project(id   = "FoBo-DataTables", 
                             base = file("DataTables"))                  
                             
  lazy val knockout     = Project(id   = "FoBo-Knockout", 
                             base = file("Knockout")) 
                   
  lazy val angularjs    = Project(id   = "FoBo-AngularJS", 
                             base = file("AngularJS"))  
                             
  lazy val jquery       = Project(id   = "FoBo-JQuery", 
                             base = file("JQuery"))  
                             
  lazy val jquerymobile = Project(id   = "FoBo-JQuery-Mobile", 
                             base = file("JQuery-Mobile"))  
                             
  lazy val prettify     = Project(id   = "FoBo-Google-Code-Prettify", 
                             base = file("Google-Code-Prettify"))                               
                             
  lazy val foboLess     = Project(id   = "FoBo-Less", 
                             base = file("FoBo-Less"))                             
  
}

