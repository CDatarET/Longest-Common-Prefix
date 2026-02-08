class Solution:
    def longestCommonPrefix(self, strs):
        com = strs[0]
        for i in range(1, len(strs)):
            sb = ""
            for j in range(min(len(com), len(strs[i]))):
                if com[j] == strs[i][j]:
                    sb += com[j]
                else:
                    break

            if len(com) > len(sb):
                com = sb

        return com
