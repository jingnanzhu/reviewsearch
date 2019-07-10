#!/usr/bin/python
import pymysql.cursors
import pandas as pd

# Connect to the database
connection = pymysql.connect(host='127.0.0.1',
                             port=33061,
                             user='jingnanuser',
                             password='zEbcWLmp8xFvNsKbSSyGgLU8OeDrwqo8',
                             db='testdb',
                             charset='utf8mb4',
                             cursorclass=pymysql.cursors.DictCursor)

cursor = connection.cursor()
        # Create a new record
data = pd.read_csv("data_fullstack.csv")
try:
    for _,r in data.iterrows():
        try:
            sql = '''INSERT INTO reviews (id, review) VALUES (%d, "%s")'''%(r['id'],r['text'].replace('"','\\"'))
            cursor.execute(sql)
            connection.commit()
        except:
            pass
except:
    pass
finally:
    connection.close
