# reviewsearch
Review search with key words

project implementation using spring boot + mysql

# provision mysql

./db/provision.sh

# import data into db
cd ./init && python import_data.py

# running the review search web server

./run.sh

web interface can be access http://1727.0.0.1:8080/index.html

![Alt text](https://github.com/jingnanzhu/reviewsearch/blob/master/Screen%20Shot%202019-07-09%20at%206.59.03%20PM.png "input web ")


![Alt text](https://github.com/jingnanzhu/reviewsearch/blob/master/Screen%20Shot%202019-07-09%20at%206.59.37%20PM.png "result ")
