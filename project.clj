(defproject grec "1.0.0-SNAPSHOT"
  :clean-non-project-classes false
  :description "grec: global regular expression color"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/tools.cli "0.2.2"]
                 [colorize "0.1.1"
                  :exclusions [org.clojure/clojure]]]
  :main grec.core)
