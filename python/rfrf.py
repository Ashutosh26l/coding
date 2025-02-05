#input using a loop.
n = int(input("Enter the number of elements: "))
my_list = []
for i in range(n):
    
    element = input("Enter element {}: ". format(i+1))
    my_list. append(element)
    
     
    # Printing the list.
    print("List:", my_list)
    
