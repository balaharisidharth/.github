// Last updated: 13/02/2026, 10:23:26
class Solution {
    public boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
s = s.replace("{}", "");
s = s.replace("()", "");
s = s.replace("[]", "");
}
return s.isEmpty();
}
    }