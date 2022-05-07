// https://www.codewars.com/kata/51e04f6b544cf3f6550000c1
// Returns number of complete beeramid levels
int beeramid(double bonus, double price) {
    int bottles = bonus/price;

    int sum = 0, i;
    for (i = 0; i < bottles; i++) {
      sum += i*i;
      if (sum > bottles) {
        return i-1;
      }
    }
    return i;
}

#include <criterion/criterion.h>
Test(beeramid, should_pass_some_fixed_tests) {
  cr_assert_eq(beeramid(1500, 2), 12);
  cr_assert_eq(beeramid(5000, 3), 16);
  cr_assert_eq(beeramid(3, 4), 0);
  cr_assert_eq(beeramid(4, 4), 1);
  cr_assert_eq(beeramid(5, 1), 2);
  cr_assert_eq(beeramid(15, 1), 3);
}