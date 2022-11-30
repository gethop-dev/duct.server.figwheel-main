(defproject dev.gethop/server.figwheel-main "0.1.3-SNAPSHOT"
  :description "Integrant methods for running Figwheel Main"
  :url "https://github.com/gethop-dev/server.figwheel-main"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.773"]
                 [com.bhauman/figwheel-main "0.2.11"]
                 [com.bhauman/rebel-readline-cljs "0.1.4"]
                 [cider/piggieback "0.5.1"]
                 [integrant "0.8.0"]
                 [integrant/repl "0.3.1"]]
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
   :project/dev  {:plugins [[lein-cljfmt "0.6.7"]
                            [jonase/eastwood "0.3.11"]]}})
