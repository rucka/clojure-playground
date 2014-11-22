(ns cl-playground.sqlite
  (:require [clojure.java.jdbc :refer :all]
            ))

(def testdata1
  {:date "2011-9-12",
   :url "http://example1.com",
   :title "SQLite Example1",
   :body "Example using SQLite with Clojure1"
   })

(def testdata2
  {:date "2011-9-13",
   :url "http://example2.com",
   :title "SQLite Example2",
   :body "Example using SQLite with Clojure2"
   })

(def testdata3
  {:date "2011-9-14",
   :url "http://example3.com",
   :title "SQLite Example4",
   :body "Example using SQLite with Clojure3"
   })


(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "db/database.db"
   })

(defn create-db []
  (try (db-do-commands db
                       (create-table-ddl :news
                                         [:date :text]
                                         [:url :text]
                                         [:title :text]
                                         [:body :text]))
       (catch Exception e (println e))))

(create-db)
(insert! db :news testdata1)
(insert! db :news testdata2)
(insert! db :news testdata3)

(def output
  (query db "select * from news"))

(keys (first output))
(:body (first output))

 (count output)
