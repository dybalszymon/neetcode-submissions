class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sCounter, tCounter = {}, {}
        for i in range(len(s)):
            sCounter[s[i]] = 1 + sCounter.get(s[i], 0)
            tCounter[t[i]] = 1 + tCounter.get(t[i], 0)
        for s in sCounter:
            if sCounter[s] != tCounter.get(s, 0):
                return False

        return True
