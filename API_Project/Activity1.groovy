

class Activity1 {

	static void main(args) {
		def inputlist = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		println inputlist
		
		def intList = inputlist.minus(["Mango", "Apple", "Watermelon"])
		println intList.sort()
		
		def strList = inputlist.minus([11, 2, 19, 5])
		println strList.sort()
		
	}
}
