#TinyURL is a URL shortening service where you enter
# a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL
# such as http://tinyurl.com/4e9iAk. Design a class to encode a URL and decode a tiny URL.

#v1 Time complexity: O(n) Space complexity: O(n)
class Codec:
    def __init__(self):
        self.encodeMap = {}
        self.decodeMap = {}
        self.base = "http://tinyurl.com/"

    def encode(self, longUrl):
        """Encodes a URL to a shortened URL.
        :type longUrl: str
        :rtype: str
        """
        if longUrl not in self.encodeMap:
            shortUrl = self.base + str(len(self.encodeMap) + 1)
            self.encodeMap[longUrl] = shortUrl
            self.decodeMap[shortUrl] = longUrl

        return self.encodeMap[longUrl]

    def decode(self, shortUrl):
        """Decodes a shortened URL to its original URL.

        :type shortUrl: str
        :rtype: str
        """
        return self.decodeMap[shortUrl]



#v2 Time complexity: O(1) Space complexity: O(n)
import hashlib
class Codec:
    def __init__(self):
        self.encodeMap = {}
        self.decodeMap = {}
        self.base = "http://tinyurl.com/"

    def encode(self, longUrl: str) -> str:
        """Encodes a URL to a shortened URL.
        """
        hashValue = hashlib.sha256(longUrl.encode('utf-8')).hexdigest()[:8]
        if hashValue not in self.encodeMap:
            shortUrl = self.base + hashValue
            self.encodeMap[hashValue] = longUrl
            self.decodeMap[shortUrl] = hashValue
        return self.base + hashValue

    def decode(self, shortUrl: str) -> str:
        """Decodes a shortened URL to its original URL.
        """
        hashValue = shortUrl.split('/')[-1]
        return self.encodeMap[hashValue]