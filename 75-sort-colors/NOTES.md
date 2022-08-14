insertion sort was used here :
```
int i, j, key, temp;
​
for (i = 1; i < nums.length; i++) {
key = nums[i];
j = i - 1;
​
while (j >= 0 && key < nums[j]) {
temp = nums[j];
nums[j] = nums[j + 1];
nums[j + 1] = temp;
j--;
}
}
```
​
​