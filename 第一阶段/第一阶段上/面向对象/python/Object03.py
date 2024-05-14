class Person:
	name = None
	age = None


p1 = Person()
p1.name = "小明"
p1.age = "18"

print("p1.name = " + p1.name + "\tp1.age = " + p1.age)


p2 = p1
print("p2.name = " + p2.name + "\tp2.age = " + p2.age)
