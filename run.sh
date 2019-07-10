#/usr/bin/bash
cd ./backend/review-search/ && ./mvnw install && cd -
java -jar backend/review-search/target/review-search-0.0.1-SNAPSHOT.jar 
