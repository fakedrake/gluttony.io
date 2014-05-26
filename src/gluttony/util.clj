(ns gluttony.util
  (:require [noir.io :as io]
            [markdown.core :as md]
            [clojure.data.json :as json]))

(defn md->html
  "reads a markdown file from public/md and returns an HTML string"
  [filename]
  (->>
    (io/slurp-resource filename)
    (md/md-to-html-string)))

(defn json-response
  "REST with JSON route."
  [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (json/write-str data)})
