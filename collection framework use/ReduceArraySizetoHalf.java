// Step1: The idea is to store the repetation of numbers.
// Step2: Remove the maximum repetation elements, such that less different elements have to remove.
// Step3: For this implimentation, use priority queue of reverse order.
// Step4: store the elements of repetation values in this priorityqueue.
// Step5: Remove elements from priority(greatest elements will be removed and that will help to remove less elements but fastly reach to half of the length).

class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Integer,Integer>m:map.entrySet()){
            pq.offer(m.getValue());
        }
        int res=0;
        int count=0;
        while(res<n/2){
            res+=pq.remove();
            count++;
        }
        return count;
    }
}