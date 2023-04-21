fun sumAfterConversion(list : List<Double?>) : Double {
    if (list.isNotEmpty())
    {
        var listAfterFilterNotNull = list.filterNotNull()
            if (listAfterFilterNotNull.isNotEmpty())
            {
                var listAfterConversion = listAfterFilterNotNull
                    .asSequence()
                    .map { if (it!!.toInt() % 2 == 0) it * it else it / 2 }
                    .filter { it <= 25 }
                    .toList()
                if (listAfterConversion.isNotEmpty())
                {
                    return listAfterConversion
                        .asSequence()
                        .sortedDescending()
                        .take(10)
                        .toList()
                        .sum()
                }
                else throw Exception("Пустая коллекция!")
            }
            else throw Exception("Пустая коллекция!")
    }
    else throw Exception("Пустая коллекция!")
}
