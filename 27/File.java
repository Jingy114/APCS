String fenceF(int posts) {
	String fence = "|";
	
	for(int i=0; i<posts; i++) {
		fence += "--|";
	}
	return fence;
}

String reverseF(String s) {
	String result;
	for(int start_index = s.length()-1; s >= 0; s--) {
		result += s.substring(start_index,start_index+1);
	}
	return result;
}

String reverseR(String s) {
	if (s.length()==1) {
		return s;
	}
	return s.substring(s.length()-1) + reverseR(s.substring(0,s.length()-1));
}
