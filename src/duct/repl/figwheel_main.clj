(ns duct.repl.figwheel-main
  (:require [integrant.repl.state :as state]
            [figwheel.main.api :as figwheel]))

(defn cljs-repl
  ([]
   (cljs-repl (get-in state/system [:duct.server/figwheel-main :id])))
  ([build-id]
   (figwheel/cljs-repl build-id)))
