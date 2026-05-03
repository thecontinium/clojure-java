(ns pez.java-hello
  (:import [pez HelloWorld]))

(defprotocol GOODBYE
  (goodbye [this message]))

(extend-type HelloWorld
  GOODBYE
  (goodbye [this message]
    (println "goodbye " (.bar this) message)))

(goodbye (HelloWorld.) "farewell")

(comment
  HelloWorld/FOO
  (HelloWorld/foo)
  (.bar (HelloWorld.)))
