(set-env! :resource-paths #{"resources" "src"}
          :dependencies   '[[org.clojure/clojure "1.8.0"]
                            [boot/new "0.5.2"]
                            [degree9/boot-semver "1.6.0" :scope "test"]])

(require '[degree9.boot-semver :refer :all]
         '[boot.new :refer [new]])

(task-options!
 pom {:project 'degree9/meta-template})
