#Leetcode link: https://leetcode.com/problems/basic-calculator-iii/
#Lintcode link: https://www.lintcode.com/problem/basic-calculator-iii/description

class Solution:
    def calculate(self, s):
        def update(op, v):
            if op == "+": stack.append(v)
            if op == "-": stack.append(-v)
            if op == "*": stack.append(stack.pop() * v)
            if op == "/": stack.append(int(stack.pop() / v))
        i, num, stack, sign = 0, 0, [], "+"
        
        while i < len(s):
            if s[i].isdigit():
                num = num * 10 + int(s[i])
            elif s[i] in "+-*/":
                update(sign, num)
                num, sign = 0, s[i]
            elif s[i] == "(":
                num, j = self.calculate(s[i + 1:])
                i = i + j
            elif s[i] == ")":
                update(sign, num)
                return sum(stack), i + 1
            i += 1
        update(sign, num)
        return sum(stack)
