class Person:
	age = None
	name = None
    

a = Person()
a.age = 10
a.name = "小明"

b = a
print(b.name)
b.age = 200
b = None

print(a.age)
# print(b.age)
