def sum_of_digits(number):
    return sum(int(digit) for digit in str(number))


def calculate_total_sum(n):
    total_sum = sum(sum_of_digits(i) for i in range(1, n + 1))
    return total_sum


def main():
    t = int(input())
    for _ in range(t):
        n = int(input())
        result = calculate_total_sum(n)
        print(result)


if __name__ == "__main__":
    main()
