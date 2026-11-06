
class Solution {
    public String findOrder(String[] words) {
        HashSet<Character> set = new HashSet<>();

        for (String ele : words) {
            for (char ch : ele.toCharArray()) {
                set.add(ch);
            }
        }

        int n = set.size();

        HashMap<Character, Integer> map = new HashMap<>();
        int idx = 0;

        for (char ch : set) {
            map.put(ch, idx++);
        }

        char[] reverse = new char[n];
        for (char ch : set) {
            reverse[map.get(ch)] = ch;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        int[] indegree = new int[n];

        // Build graph
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());
            int j = 0;

            while (j < len && s1.charAt(j) == s2.charAt(j))
                j++;

            if (j == len) {
                if (s1.length() > s2.length()) return "";
                continue;
            }

            int u = map.get(s1.charAt(j));
            int v = map.get(s2.charAt(j));

            if (!adj.get(u).contains(v)) {
                adj.get(u).add(v);
                indegree[v]++;
            }
        }

        // Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int front = q.remove();
            list.add(front);

            for (int ele : adj.get(front)) {
                indegree[ele]--;
                if (indegree[ele] == 0) q.add(ele);
            }
        }

        if (list.size() != n) return "";

        StringBuilder ans = new StringBuilder();

        for (int node : list) {
            ans.append(reverse[node]);
        }

        return ans.toString();
    }
}
