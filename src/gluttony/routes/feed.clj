(ns gluttony.routes.feed
  (:use compojure.core)
  (:require [gluttony.layout :as layout]
            [gluttony.util :as util]))

(defn feed-json []
  (util/json-response {:feed "On XML!"}))

(defn json-echo [kw]
  (util/json-response kw))

(defroutes feed-routes
  (GET "/feed" [] (feed-json))
  (GET "/echo-get" [& kw] (json-echo kw)))
