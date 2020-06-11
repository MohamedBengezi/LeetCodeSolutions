import math
class MinStack(object):
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.q = []
        
        

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        self.q.append(x)
        
        

    def pop(self):
        """
        :rtype: None
        """ 
        return self.q.pop(-1)
        

    def top(self):
        """
        :rtype: int
        """
        temp = self.q.pop(-1)
        self.q.append(temp)
        return temp

    def getMin(self):
        """
        :rtype: int
        """
        return min(self.q)
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()