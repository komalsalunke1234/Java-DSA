class Solution(object):
    def largestRectangleArea(self, heights):
        stack = [-1]
        ans = 0

        for i, h in enumerate(heights + [0]):
            while stack[-1] != -1 and heights[stack[-1]] > h:
                height = heights[stack.pop()]
                width = i - stack[-1] - 1
                ans = max(ans, height*width)
            stack.append(i)
        return ans
        