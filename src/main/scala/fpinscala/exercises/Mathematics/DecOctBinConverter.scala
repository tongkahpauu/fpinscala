package Mathematics

object DecOctBinConverter {

  //convert Int to Dec
  def decimalConverter(n: Int): Int = {
    var value = 0
    var multiplier = 1
    var num = n


    while (num > 0) {
      value = value + ((num % 10) * multiplier)
      num = num / 10
      multiplier = multiplier * 10
    }

    return value
  }

  //convert Int to Oct


  //convert Int to Bin


}