# Using left shift to find the square of a number
def square_using_left_shift(num):
    return num << 1

# Using right shift to find the square of a number
def square_using_right_shift(num):
    return num >> 1

# Example usage
original_number = 5
result_left_shift = square_using_left_shift(original_number)
result_right_shift = square_using_right_shift(original_number)

print(f"The square of {original_number} using left shift is: {result_left_shift}")
print(f"The square of {original_number} using right shift is: {result_right_shift}")

