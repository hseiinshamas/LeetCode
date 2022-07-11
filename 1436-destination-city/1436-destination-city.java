class Solution {

    public String destCity(List<List<String>> paths) {
        HashSet<String> unique = new HashSet<>();
        for (List<String> path : paths) {
            unique.add(path.get(0)); // b 
        }

        for (List<String> path : paths) {
            if (!unique.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return "";
    }
}
