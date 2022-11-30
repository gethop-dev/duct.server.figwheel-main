(defproject dev.gethop/server.figwheel-main "0.1.4-SNAPSHOT"
  :description "Integrant methods for running Figwheel Main"
  :url "https://github.com/gethop-dev/server.figwheel-main"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [com.bhauman/figwheel-main "0.2.18"]
                 [cider/piggieback "0.5.1"]
                 [integrant "0.8.0"]
                 [integrant/repl "0.3.2"]]
  :resource-paths ["target"]
  :clean-targets ^{:protect false} ["target"]
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]]
  :profiles
  {:dev          [:project/dev :profiles/dev]
   :profiles/dev {}
   :project/dev {:plugins [[lein-cljfmt "0.8.0"]
                           [jonase/eastwood "1.2.3"]]}})
