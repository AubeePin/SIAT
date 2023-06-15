from pprint import pprint

peoples = [
    {"num":1, "name":"KIM","phone":"010-1111-1111"},
    {"num":2, "name":"LEE","phone":"010-2222-2222"},
    {"num":3, "name":"PARK","phone":"010-3333-3333"}
]

num_seq = 3

def addDictPeople(name,phone):
    global num_seq
    num_seq +=1

    peoples.append({"num":num_seq,"name":name,"phone":phone})

addDictPeople("Ahn","010-4444-4444")
print(peoples)
print(peoples)
