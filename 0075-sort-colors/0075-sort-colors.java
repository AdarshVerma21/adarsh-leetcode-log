class Solution {
    public void sortColors(int[] nums) {
    HashMap<Integer, Integer> m = new HashMap<>();

    m.put(0,0);
    m.put(1,0);
    m.put(2,0);

    for(int x : nums)
{
    m.put(x, m.get(x) +1);
}

int i = 0;

for (int j= 0; j< m.get(0); j++){
    nums[i++] = 0;
}
for (int j= 0; j< m.get(1); j++){
    nums[i++] = 1;

    }
    for (int j= 0; j< m.get(2); j++){
    nums[i++] = 2;
}
}
}