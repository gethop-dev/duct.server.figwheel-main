(ns duct.server.figwheel-main
  (:require [figwheel.main.api :as figwheel]
            [integrant.core :as ig]))

(defmethod ig/init-key :duct.server/figwheel-main [_ opts]
  (figwheel/start opts)
  opts)

(defmethod ig/halt-key! :duct.server/figwheel-main [_ {:keys [id]}]
  (figwheel/stop id))

(defmethod ig/suspend-key! :duct.server/figwheel-main [_ _])

(defmethod ig/resume-key :duct.server/figwheel-main [key opts old-opts old-impl])
