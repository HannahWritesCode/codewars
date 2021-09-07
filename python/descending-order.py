# Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. 
# Essentially, rearrange the digits to create the highest possible number.

# Examples:
# Input: 42145 Output: 54421
# Input: 145263 Output: 654321
# Input: 123456789 Output: 987654321

def quick_sort(list, low, high):
    if (low < high):
        pivot = low
        i = low
        j = high
 
        while (i < j):
            while list[i] >= list[pivot] and i < high:
                i += 1
            while list[j] < list[pivot]:
                j -= 1
 
            if (i < j):
                list[i], list[j] = list[j], list[i]
                 
        list[pivot], list[j] = list[j], list[pivot]
        quick_sort(list, low, j - 1)
        quick_sort(list, j + 1, high)
        return list
 
    else:
      return list

def descending_order(input):
    # if positive integer
    if  isinstance(input, int) and input >= 0:
        # convert integer to list of digits
        input_list = list(map(int, str(input)))
        low = 0
        high = len(input_list) - 1
        # return list of sorted digits back as an integer 
        return int("".join(list(map(str, quick_sort(input_list, low, high))))) 
    else:
        return None

print(descending_order(42145)) # expect 54421
print(descending_order(145263)) # expect 654321
print(descending_order(123456789)) # expect 987654321
print(descending_order(0)) # expect 0
print(descending_order(15)) # expect 51
print(descending_order(-87)) # expect None
print(descending_order("string?")) # expect None