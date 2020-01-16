(defrecord trips [spot duration]
(def japon  (->trips "kagoshima" 90))
(def sweden (->trips "ostersund" 30))

(for [trips [:spot :duration]
      (println "trip a  
