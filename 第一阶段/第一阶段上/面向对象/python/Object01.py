class Cat:
	name = None;
	age = None;
	color = None;
	weight = None;


cat1 = Cat()
cat1.name = "jack"
cat1.age = 3
cat1.color = "yellow"
cat1.weight = 17.8


cat2 = Cat()
cat2.name = "joey"
cat2.age = 1
cat2.color = "black"
cat2.weight = 1711.8


print(
	"the forst cat is " + cat1.name +
	",he\'s age is " + str(cat1.age) +
	",color is " + cat1.color +
	",weight is " + str(cat1.weight))


print(
	"the second cat is " + cat2.name +
	",he\'s age is " + str(cat2.age) +
	",color is " + cat2.color +
	",weight is " + str(cat2.weight))