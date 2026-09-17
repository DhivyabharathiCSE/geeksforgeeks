class Solution {
public:
    int compress(vector<char>& chars) {
        int w = 0;
        int i = 0;

        while (i < chars.size())
        {
            char ch = chars[i];
            int c = 0;

            while (i < chars.size() && chars[i] == ch)
            {
                i++;
                c++;
            }

            chars[w++] = ch;

            if (c > 1)
            {
                string num = to_string(c);

                for (char x : num)
                {
                    chars[w++] = x;
                }
            }
        }

        return w;
    }
};