from collections import deque

"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return None

        result_clone = Node(node.val)
        clone_dict = {}

        current = node
        clone_dict[node.val] = result_clone

        to_process = deque()
        to_process.append(current)

        while to_process:
            current = to_process.popleft()
            
            for neighbor in current.neighbors:
                if neighbor.val not in clone_dict:
                    clone_dict[neighbor.val] = Node(neighbor.val)
                    # Important here is that we need to append the neighbour not the cloned
                    # neighbor
                    to_process.append(neighbor)

                clone_dict[current.val].neighbors.append(clone_dict[neighbor.val])


        return result_clone