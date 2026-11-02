# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

p1 = Point(0.0, 0.0)
p2 = Point(3.0, 4.0)
print(p1.distance_to(p2)) # p1 is the self and p2 is the other (this prints 5)
