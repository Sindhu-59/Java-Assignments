class Country{

	public static int getCountryCode(String CountryName){
	
	int CountryCode = 0;
	
		
	if(CountryName=="India"){
		CountryCode=91;
		}
		else if(CountryName=="Australia"){
			CountryCode=61;
			return CountryCode;
			}
			else if(CountryName=="Sri Lanka"){
				CountryCode=94;
				return CountryCode;
				}
				else if(CountryName=="Singapore"){
				CountryCode=65;
					return CountryCode;
				}
				else if(CountryName=="Spain"){
				CountryCode=34;
					return CountryCode;
				}
				else if(CountryName=="Sweden"){
				CountryCode=46;
					return CountryCode;
				}
				else if(CountryName=="Bangladesh"){
				CountryCode=880;
					return CountryCode;
				}
				else if(CountryName=="Bhuthan"){
				CountryCode=975;
					return CountryCode;
				}
				else if(CountryName=="Cuba"){
				CountryCode=53;
					return CountryCode;
				}
				else if(CountryName=="South Korea"){
				CountryCode=82;
					return CountryCode;
				}
				else if(CountryName=="Somoa"){
				CountryCode=685;
					return CountryCode;
				}
				
				else{
					System.out.println("The country code is invalid "+CountryCode);
					}
			return CountryCode;
		}
		}
		
