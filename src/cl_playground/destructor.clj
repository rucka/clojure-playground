(ns cl-playground.destructor)

(def book {:name "SICP" :details {:pages 657 :isbn-10 "0262011530"}})

(defn get-book-name [{name :name }]
       name)

(get-book-name book)


(defn dump-book [{name :name {:keys [pages isbn-10]} :details}]
       (println "name:" name "pages:" pages "isbn-10:" isbn-10))

(dump-book book)


(get-in book [:details :pages])
