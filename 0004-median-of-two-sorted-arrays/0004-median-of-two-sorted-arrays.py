class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        maxHeap = []
        minHeap = []
        i=0
        for n in nums1:
            self.addToHeaps(n, maxHeap, minHeap)
        for n in nums2:
            self.addToHeaps(n, maxHeap, minHeap)

        if len(maxHeap) == len(minHeap):
            return -maxHeap[0] / 2.0 + minHeap[0] / 2.0
        return -float(maxHeap[0])

    def addToHeaps(self,num, maxHeap, minHeap):
        if not maxHeap or -maxHeap[0]>=num:
            heappush(maxHeap, -num)
        else:
            heappush(minHeap, num)

        if len(maxHeap)>len(minHeap)+1:
            heappush(minHeap, -heappop(maxHeap))
        elif len(minHeap)>len(maxHeap):
            heappush(maxHeap, -heappop(minHeap))
        



        


        

            
