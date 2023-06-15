import sqlite3

conn = sqlite3.connect('test.db')

print(conn)#문자열시작되는부분 전부 외우기
sql = '''create table IF NOT EXISTS saram(
no integer primary key,
id varchar(20),
name varchar(20),
age integer
)'''
c= conn.cursor()
c.execute(sql)

conn.close()
conn.close()

#ANSI - 미국 표준
#ECMA - 유럽 표준 ex) ES6+
#표준, 프로토콜, 저작권 주의하기.
