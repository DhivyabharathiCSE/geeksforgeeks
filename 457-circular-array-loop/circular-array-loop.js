var circularArrayLoop = function(nums) {
    const n = nums.length;
    const next = (i) => ((i + nums[i]) % n + n) % n;

    for (let i = 0; i < n; i++) {
        if (nums[i] === 0) continue;
        let slow = i, fast = next(i);
        while (
            nums[slow] * nums[fast] > 0 &&
            nums[slow] * nums[next(fast)] > 0
        ) {
            if (slow === fast) {
                if (slow === next(slow)) break;
                return true;
            }
            slow = next(slow);
            fast = next(next(fast));
        }

        // mark all visited as 0
        let val = nums[i], j = i;
        while (nums[j] * val > 0) {
            let tmp = next(j);
            nums[j] = 0;
            j = tmp;
        }
    }

    return false;
};