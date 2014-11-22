(ns cl-playground.korma
  (:require [korma.db :refer :all]
            [korma.core :refer :all]
            [clojure.string :as str]
            ))

(defdb db (sqlite3 {:db "db/database.db"}))


(declare news)

(defentity news
  (entity-fields :title :body :url :date)
  )

(-> (select* news)
    (fields :body :date)
    (where {:url "http://example1.com"})
    (as-sql)
    println
    )

(sql-only
 (select news
    (fields :body :date)
    (where {:url "http://example1.com"})
    ))


(select news
    (fields :body :date)
    (where {:url "http://example1.com"})
    )

;(exec-raw ["select * from news"] :results)
