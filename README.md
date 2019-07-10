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

![Alt text](http://full/path/to/img.jpg "input web ")


![Alt text](http://full/path/to/img.jpg "result ")
