fun MutableList<Int>.square(){
    if (this.isNotEmpty()) {
        var i = this.size
        while (i > 0) {
                this.add(this.elementAt(0) * this.elementAt(0))
                this.remove(this.elementAt(0))
                i--
            }
    }
    else throw Exception("Пустая коллекция!")
}