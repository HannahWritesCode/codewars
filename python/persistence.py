# Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
#
# For example:
#  persistence(39) # returns 3, because 3*9=27, 2*7=14, 1*4=4
#                  # and 4 has only one digit        
#    
#  persistence(999) # returns 4, because 9*9*9=729, 7*2*9=126,
#                   # 1*2*6=12, and finally 1*2=2
#
#  persistence(4) # returns 0, because 4 is already a one-digit number

def persistence(n):
    p = 0
    if isinstance(n, int) == False:
        return "invalid input"
    if n < 10: 
        return p
    while n >= 10:
        # map out each digit into a list
        digits = list(map(int, str(n)))
        product = 1
        for x in digits:
            product = product * x
        # set n to new product
        n = product
        # increase persistence by 1
        p+=1 
        if n < 10:
            return p
        

print("persistence of 39, expect 3: " + str(persistence(39)))
print("persistence of 999, expect 4: " + str(persistence(999)))
print("persistence of 4, expect 0: " + str(persistence(4)))
print("persistence of 25, expect 2: " + str(persistence(25)))
print("persistence of 4.5, expect invalid input: " + str(persistence(4.5))) 