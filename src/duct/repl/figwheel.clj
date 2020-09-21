(ns duct.repl.figwheel
  (:require [integrant.repl.state :as state]
            [figwheel.main.api :as figwheel]))

(defn cljs-repl
  ([]
   (cljs-repl (get-in state/system [:duct.server/figwheel-main :server])))
  ([build-id]
   (figwheel/cljs-repl build-id)))
