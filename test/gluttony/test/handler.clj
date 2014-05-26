(ns gluttony.test.handler
  (:use clojure.test
        ring.mock.request
        gluttony.handler))

(deftest test-app
  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404))))
  (testing "Echo get request"
    (let [response (app (request :get "/echo-get?people=shit"))]
      (is (= (:status response) 200))
      (is (= (:body response) "{\"people\":\"shit\"}")))))
