package leetCode.test;

public class sentencePreSearcheWord {

	public static void main(String[] args) {
		String sentence = "this problem is an easy problem";
		String word = "pro";
		System.out.println(isPrefixOfWord(sentence,word));
	}
	
	//查找一个句子中第一个前缀为searchword的单词并返回它的位置
	public static int isPrefixOfWord(String sentence, String searchWord) {
		String[] strs = sentence.split(" ");
		
		int index = 0;
		
		//从句子第一个往后开始
		while(index < strs.length) {
			
			//如果单词长度小于前缀长度 直接跳过
			if(strs[index].length() < searchWord.length()) {
				index++;
				continue;
			}
			
			//直接用单词截取前缀长度，比较
			if (strs[index].substring(0, searchWord.length()).equals(searchWord)) {
				return index + 1;
			}else {
				index++;
			}
		}
		return -1;
		
    }



}
