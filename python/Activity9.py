list1 = [1,2,3,4,5,6]
list2 = [11, 12,13,14,15,16]
list3 = []

#to get odd numbers
for number in list1:
    if(number % 2 != 0):
        list3.append(number)

#to get even numbers
for number in list2:
    if(number % 2 ==0):
        list3.append(number)

print(list3)