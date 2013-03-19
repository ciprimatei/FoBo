FoBo-Knockout
=================

This sub module provides Knockout.js to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Knockout.js in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome#history-log) section

**Latest Module Version:**
- **2013-02-27** -- 0.1.0-SNAPSHOT 

**Latest Update:**
- **2013-02-27** -- 0.1.0-SNAPSHOT Making knockout a FoBo subproject.

**Latest Stable Releases:**
- None

**Latest Snapshot Release:**
- 


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Knockout.](http://knockoutjs.com/). 

However the FoBo-Knockout module can be used separatly the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

The following describes how to set up the module in your project **as a separate module** (without using the [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) meta module). For setup in FoBo see the FoBo documentation.

For more information on how to use Knockout see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependancy

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-knockout" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks

    import net.liftmodules.FoBoKO 
    :
    //Use this if you are planing to use font-awesome without twitter bootstrap 
    FoBoKO.InitParam.ToolKit=FoBoKO.KnockoutXYZ 
    FoBoKO.init()
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.KnockoutXYZ)   

### Lift FoBo Template hooks

    <script type="text/javascript" src="/classpath/fobo/knockout.js"></script>

For more information on how to use Knockout see [Knockout.](http://knockoutjs.com/)


### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 

