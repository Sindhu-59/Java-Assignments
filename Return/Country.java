class Country{

	public static int getCountryCode(String CountryName){
	
	int CountryCode = 0;
	
		
	if(CountryName=="India"){
		CountryCode=91;
		}
		else if(CountryName=="Australia"){
			CountryCode=61;
			}
			else if(CountryName=="Sri Lanka"){
				CountryCode=94;
				}
				else if(CountryName=="Singapore"){
				CountryCode=65;
				}
				else if(CountryName=="Spain"){
				CountryCode=34;
				}
				else if(CountryName=="Sweden"){
				CountryCode=46;
				}
				else if(CountryName=="Bangladesh"){
				CountryCode=880;
				}
				else if(CountryName=="Bhuthan"){
				CountryCode=975;
				}
				else if(CountryName=="Cuba"){
				CountryCode=53;
				}
				else if(CountryName=="South Korea"){
				CountryCode=82;
				}
				else if(CountryName=="Somoa"){
				CountryCode=685;
				}
				
				else{
					System.out.println("The country code is invalid "+CountryCode);
					}
			return CountryCode;
		}
		}
		