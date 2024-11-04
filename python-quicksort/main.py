def quickSort(array, low, high):
    left = low
    right = high
    pivot = array[(low + high) // 2]

    while left <= right:
        while array[left] < pivot:
            left += 1
        while array[right] > pivot:
            right -= 1
        if left <= right:
            array[left], array[right] = array[right], array[left]
            left += 1
            right -= 1

    if low < right:
        quickSort(array, low, right)
    if left < high:
        quickSort(array, left, high)


Array = [1, 5, 3, 7, 2, 8, 4]
quickSort(Array, 0, len(Array) - 1)
print(Array)