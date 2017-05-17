object maps {

  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
  val capitolOfCountry = Map("US" -> "Washington", "India" -> "Delhi")


  capitolOfCountry("India")
  capitolOfCountry get "0"
  capitolOfCountry get "India"

  def showCaptiol(country: String) = capitolOfCountry.get(country) match{

    case Some(country) => country
    case None => "Missing Country in List"
  }

  showCaptiol("US")
  showCaptiol("Germany")
}

