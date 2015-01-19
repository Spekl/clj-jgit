(defproject clj-jgit "0.8.3"
  :description "Clojure wrapper for JGit"
  :dependencies [[org.eclipse.jgit/org.eclipse.jgit.java7 "3.5.0.201409260305-r"]
                 [fs "1.3.2"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [midje "1.5.1"]
                                  [com.stuartsierra/lazytest "1.2.3"]
                                  [lein-clojars "0.9.0"]]} }
  :plugins [[lein-midje "3.0.1"]
            [lein-marginalia "0.7.1"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"
                 "jgit-repository" "https://repo.eclipse.org/content/groups/releases/"})
