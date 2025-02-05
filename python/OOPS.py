# 5 types of INHERITENCE is there in python
# 1. single
# 2. multiple
# 3. multilevel
# 4. hierarchical
# 5. hybrid
'''class parent1:
    def m1(self):
        print("parent1 method")
class parent2:
    def m2(self):
        print("parent2 method")
class child(parent1,parent2):
    def m3(self):
        print("child method")
c=child()
c.m1()    '''
"""class A:
    def m1(self):
        print("parent class A:m1 method")
class B(A):
    def m2(self):
        print("parent class B:m2 method")
class C(B):
    def m3(self):
        print("child class C:m3 method")
c=C()
c.m1()
"""
# POLYMORPHISM
# existence in more than one form
"""print(4+5)
print("4"+"5")
print(4*5)
print("4"*5)"""



"""
class a():
    def m1(self):
        print("hello1")
class b(a):
    def m1(self):
        print("hello2") 
h=a()
h.m1()"""

#polymorphism in classes

#ENCAPSULATION AND EXTRACTION:

"""wrapping up of data in a single unit"""

#ABSTRACTION
"""Hiding the complexity and showing only essential"""
class example:
    def __init__(self,a,b):
        self.a=a
        self.b=b
    def add(self):
      return self.a+self.b
e=example(8,6)
print(e.add())
print(e.a)

#STATIC AND FINAL
"""static->class level
final->fixed(cant be changed)"""

class example:
   
   def static_method():
      print("this is static method")
asd=example()
asd.static_method()

